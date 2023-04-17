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
	 * This is a constructor with all of the paramaters.
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
	 * This is the with only the name i guess your finding the others out later.
	 * @param name this is the name of the class.
	 */
	public Node(String name){
		this.name = name;
	}

	/**
	 * I added this constructor because I can and you cannot stop me.
	 * @param name the name of the class.
	 * @param credits the amount of credits of this class.
	 * @param description the description of the class in case someone needs it, idk why they are not good descriptions anyway so just ask someone.
	 */
	public Node(String name, byte credits, String description){
		this.name = name;
		this.credits = credits;
		this.description = description;
	}


	/**
	 * This is for comparing two nodes and returns true if the names are equal.
	 * @param other the other node, takes in objects but will only return true with nodes.
	 * @return the boolean value of true if the names of the nodes are the same and else false, like if the other is not a node.
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

	/**
	 * This method makes a hash code for the node out of the name of the node.
	 * @return this is the hash code.
	 */
	@Override
	public int hashCode(){
		return name.hashCode();
	}
}
