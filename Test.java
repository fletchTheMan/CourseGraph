import java.util.Scanner;
import java.io.*;
import java.util.HashSet;

public class Test{
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "outfiles/Computing (COMP) George Mason University";
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		Node[] nodes = new Node[100];
		int index = 0;
		Node startNode = new Node("AHHHHHHHHHHHH");
		HashSet<Node> testHashSet = new HashSet<Node>();
		while(scan.hasNext()){
			String name = scan.next();
			name = name.substring(0, name.length() - 1);
			System.out.println("Name is: " + name);
			String description = scan.nextLine();
			byte credits = (byte)(description.charAt(description.length() - 10) - 48);
			description = scan.nextLine();
			System.out.println("Number of credits is: " + credits);
			System.out.println("Description is: " + description);
			nodes[index] = new Node(name, credits, description);
			if(index == 0){
				startNode = new Node(name, credits, description);
				testHashSet.add(nodes[index]);
			}
			scan.nextLine();
			scan.nextLine();
			scan.nextLine();
			scan.nextLine();
		}
		
		System.out.println(testHashSet.contains(startNode));
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

