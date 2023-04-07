import java.util.Scanner;
import java.io.*;

public class Test{
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("outfilesList.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()){
			String line = scan.nextLine();	
			String courseAbriviation; 
			if(!line.equals("Sport, Recreation and Tourism Management George Mason University")){
				courseAbriviation = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
			}
			else{
				courseAbriviation = "SRTM";
			}
			System.out.println("Course Abriviation is: " + courseAbriviation);
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

