import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collection;

public class Graph {
	
	public HashMap<String, Node> classes;
	public HashMap<Node, LinkedList<Node>> classMap;

	public Graph(String fileList, HashSet<String> courseAbriviations) throws FileNotFoundException {
		classes = new HashMap<String, Node>(62);
		classMap = new HashMap<Node, LinkedList<Node>>(62 * 2);
		//TODO make it take in a file that link to other files and 
		File files = new File(fileList);
		Scanner fileScan = new Scanner(files);
		while(fileScan.hasNext()){
			String fileName = "outfiles/" + fileScan.next();
			readFile(fileName, courseAbriviations);
		}
	}
	
	public void readFile(String fileName, HashSet<String> courseAbriviations) throws FileNotFoundException {
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		while(scan.hasNext()){
			String name = scan.next();
			String description = scan.nextLine();
			byte credits = (byte)(description.charAt(description.length() - 10) - 48);
			description = scan.nextLine();
			Node currentClass = new Node(name, credits, description);
			classes.put(name, currentClass);
			String requirmentsToParse = scan.nextLine();
			for(String courseAbriviation: courseAbriviations){
				int requiredCourseIndex = requirmentsToParse.indexOf(courseAbriviation);
				if(requiredCourseIndex != -1){
					String requiredClassName = requirmentsToParse.substring(requiredCourseIndex, requiredCourseIndex + courseAbriviation.length() + 4);
					Node requiredClassNode; 
					if(findNode(requiredClassName) == null){
						requiredClassNode = new Node(requiredClassName);
					}
					else{
						requiredClassNode = findNode(requiredClassName);
					}
					putNode(requiredClassName, requiredClassNode);
					putEdge(requiredClassNode, currentClass);
				}
			}
		}
	}	
	
	@Override
	public String toString(){
		StringBuilder newString = new StringBuilder();
		Collection<Node> nodes = classes.values();
		for(Node node: nodes){
			newString.append(node.toString());
		}
		return newString.toString();
	}

	public Node findNode(String name){
		return classes.get(name);
	}

	public boolean putNode(String name, Node classNode){
		return classes.put(name, classNode) != null;
	}

	public boolean putEdge(Node requiredClassNode, Node currentClass){
		Edge edge = new Edge(requiredClassNode, currentClass);
		return classLinks.add(edge);
	}
}
