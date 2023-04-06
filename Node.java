import java.util.Set;
/**
 * @author Fletcher Hammond
 * This repersents one class and has the things to edit it.
 * All items inside are public.
 */


public class Node{
	public String name;
	public String description;
	public byte credits;
	public Set<Node> requirements;
	
	/**
	 * This is a constructor with all of the paramaters
	 * @param name this is the name of the class.
	 * @param credits this is the amount of credits of this class.
	 * @param requirements these are the requirements of this class.
	 * @param description this is the description of the class as given by GMU.
	 */
	public Node(String name, byte credits, Set<Node> requirements, String description){
		this.name = name;
		this.credits = credits;
		this.requirements = requirements;
		this.description = description;
	}

	/**
	 * This is the prefered constructor.
	 * @param name this is the name of the class.
	 */
	public Node(String name){
		this.name = name;
	}

	public Node(String name, byte credits, String description){
		this.name = name;
		this.credits = credits;
		this.description = description;
	}


	/**
	 * This
	 *
	 *
	 */
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Node)){
			return false;
		}
		if(name.equals(((Node)other).name)){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int hashCode(){
		return name.hashCode();
	}
}
