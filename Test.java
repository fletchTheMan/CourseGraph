import java.util.Scanner;
import java.io.*;

public class Test{
	public static void main(String[] args) throws FileNotFoundException{
		String filename = "outfiles/Computing (COMP) George Mason University";
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		while(scan.hasNext()){
			String name = scan.next();
			name = name.substring(0, name.length() - 1);
			System.out.println("Name is: " + name);
			String description = scan.nextLine();
			byte credits = (byte)(description.charAt(description.length() - 10) - 48);
			description = scan.nextLine();
			System.out.println("Number of credits is: " + credits);
			System.out.println("Description is: " + description);
			scan.nextLine();
			scan.nextLine();
			scan.nextLine();
			scan.nextLine();
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

