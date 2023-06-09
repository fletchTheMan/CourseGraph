import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Test{
	public static void main(String[] args) throws FileNotFoundException {
		File outfileList = new File("outfilesList.txt");
		Scanner scanning = new Scanner(outfileList);
		ArrayList<String> courseAbriviations = new ArrayList<String>(100);
		while(scanning.hasNextLine()){
			String line = scanning.nextLine();	
			String courseAbriviation; 
			if(!line.equals("Sport, Recreation and Tourism Management George Mason University")){
				courseAbriviation = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
			}
			else{
				courseAbriviation = "SRTM";
			}
			courseAbriviations.add(courseAbriviation);
		}
		HashMap<String, Node> classes = new HashMap<String, Node>(62);
		HashSet<Edge> classLinks = new HashSet<Edge>(62 * 2);
		File files = new File("outfilesList.txt");
		Scanner fileScan = new Scanner(files);
		while(fileScan.hasNext()){
			String fileName = "outfiles/" + fileScan.nextLine();
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			while(scan.hasNext()){
				String name = scan.next();
				String description = scan.nextLine();
				byte credits = (byte)(description.charAt(description.length() - 10) - 48);
				description = scan.nextLine();
				Node currentClass = new Node(name, credits, description);
				classes.put(name, currentClass);
				if(!scan.hasNextLine()){
					continue;
				}
				else{
					String requirmentsToParse = scan.nextLine();
					for(String courseAbriviation: courseAbriviations){
						int requiredCourseIndex = requirmentsToParse.indexOf(courseAbriviation);
						if(requiredCourseIndex != -1){
							String requiredClassName = requirmentsToParse.substring(requiredCourseIndex, requiredCourseIndex + courseAbriviation.length() + 4);
							System.out.println(requiredClassName);
							Node requiredClassNode = null;
							if(classes.get(requiredClassName) == null){
								requiredClassNode = new Node(requiredClassName);
							}
							else{
								requiredClassNode = classes.get(requiredClassNode);
							}
							Edge edge = new Edge(requiredClassNode, currentClass);
							classLinks.add(edge);
							classes.put(requiredClassName, requiredClassNode);
						}
					}
				}
			}
			System.out.println(fileName);
		}
	}
}

/*
 String temp = scan.next();
		System.out.println(temp.substring(0,temp.length() - 1));
		temp = scan.nextLine();
		System.out.println((byte)temp.charAt(temp.length() - 10) - 48);
		System.out.println(scan.next());
		while(scan.hasNext()){
			String line = scan.nextLine();
			int prerequisiteIndex = line.indexOf("Prerequisite");
			if(prerequisiteIndex != -1){
				String prerequisiteList = line.substring(prerequisiteIndex + 14);
				Scanner prerequisiteScanner = new Scanner(prerequisiteList);
				while(prerequisiteScanner.hasNext()){
					System.out.println(prerequisiteScanner.next());
				}
			}
		}
		
		for(int i = 0; i < 10; i++){
			System.out.println(scan.next());
		}
*/

