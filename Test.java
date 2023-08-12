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
			if(!line.equals("Sport, Recreation and Tourism Management.txt")){
				courseAbriviation = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
			}
			else{
				courseAbriviation = "SRTM";
			}
			courseAbriviations.add(courseAbriviation);
		}
		HashMap<String, Node> classes = new HashMap<String, Node>(62);
		//TODO add in class mapping or some Edge thing and make some item here
		Scanner fileNameScanner = new Scanner(outfileList);
		while(fileNameScanner.hasNextLine()){
	   		String fileName = "outfiles/" + fileNameScanner.nextLine();
			System.out.println(fileName);
	       		File file = new File(fileName);
	       		Scanner scan = new Scanner(file);
	       		while(scan.hasNext()){
	       			String name = scan.nextLine();
		       		byte credits = (byte)scan.nextInt();
				scan.nextLine();
			       	String description = scan.nextLine();
				scan.nextLine();
				scan.nextLine();
		       	}
		}
	}
}
