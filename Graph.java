import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

public class Graph{
	
	public HashMap<String, Node> classes;
	public HashSet<Edge> classLinks;

	public Graph(String fileList) throws FileNotFoundException{
		classes = new HashSet<String, Node>(62);
		classLinks = new HashSet<Edge>(classes.capacity() * 2);
		//TODO make it take in a file that link to other files and 
		//File  
	}
	
	public Graph() throws FileNotFoundException{
		classes = new HashSet<Node>(12);
	}
	
	public void readFile(String fileName, HashSet<String> courseAbriviations) throws FileNotFoundException{
		String filename = "outfiles/Computing (COMP) George Mason University";
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
					String requiredClassName = requirmentsToParse.substring(requiredCourseIndex, requiredCourseIndex = courseAbriviation.length() + 4);
					if(findNode(requiredClassName) == null){
						Node requiredClassNode = new Node(requiredClassName);
						putNode(requiredClassName, Node);
					}
					
				}
			}
		}
	}	
	
	@Override
	public String toString(){
		StringBuilder newString = new StringBuilder();
		for(Node x: classes){
			newString.append(x.name);
		}
		return newString.toString();
	}

	public Node findNode(String name){
		return classes.get(name);
	}

	public boolean putNode(String name, Node classNode){
		return classes.putNode(name, classNode);
	}

	public boolean putEdge(String requiredClassName, String currentClassName){
		Edge edge = new Edge(requiredClassName, currentClassName);
		return classLinks.add(edge);
	}
}
