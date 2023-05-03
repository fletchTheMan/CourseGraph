import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Graph{
	
	public HashSet<Node> classes;

	public Graph(String fileList) throws FileNotFoundException{
		classes = new HashSet<Node>(62);
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
			classes.add(currentClass);
			String requirmentsToParse = scan.nextLine();
			for(String courseAbriviation: courseAbriviations){
				int requiredCourseIndex = requirmentsToParse.indexOf(courseAbriviation);
				if(requiredCourseIndex != -1){
					//TODO
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
		//TODO

	}

}

/*
 String[] courseAbriviations = {"AE","ACCT","AFAM","ANTH","AIT","ARAB","AVT",
	"ARTH","AMGT","EDAT","ASTR","ATEP","BIS","BAS","BIOD","BENG","BINF","BIOL",
	"BIMR","BMED","BIOS","BULE","BUS","BMGT","CHEM","CHIN","CEIE","CLAS","CLIM",
	"CEC","COS","CVPA","COMM","CDS","CSI","CSS","GAME","CS","COMP","CONF","CONS",
	"CM","EDCD","CRIM","CULT","EDCI","CYSE","DANC","DAEN","DSGN","DFOR","ECED",
	"ECON","EDEP","EDUC","EDIT","EDLE","EDPO","EDRS","ECE","ELED","ENGR",
	"ENGH","EAP","EVPP","EMBA","EFHP","FAVS","FNAN","FOLK","FRLN","FRSC","FREN",
	"GGS","GEOL","GERM","GLOA","GCH","GOVT","GBUS","GREE","HAP","HHS","HEAL",HEBR",
	"HE","HIST","HNRS","HDFS","ISA","ISM","INFS","IT","INTS","MAIS","ITRN","INYO",
	"ITAL","JAPA","KINE","KORE","LAS","LATN","LING","MGMT","MIS","MSEC","MKTG","MATH",
	"MBA","ME","MLAB","MEIS","MLSC","MSBA","MUSI","NAIS","NEUR","NURS","NUTR","OR","OSCM",
	"ODKM","PERS","PHIL","PHED","PHYS","POGO","PORT","EDPD","PROV","PSYC","PUAD","PUBP","EDRD",
	"REAL","RMGT","RECR","RHBS","REHI","RUSS","SPSY","SEED","SOCW","SOAN","SOCI","SWE","SPAN",
	"EDSE","SPMT","SRST","SRTM","STAT","SYST","SEOR","TECM","TCOM","THR","TOUR","TURK","UNIV","USST","WMST"}
*/
