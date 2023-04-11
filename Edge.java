public class Edge{
	public Node requirement;
	public Node currentClass;

	public Edge(Node requirement, Node currentClass){
		this.requirement = requirement;
		this.currentClass = currentClass;
	}

	public Edge(Node currentClass){
		this.currentClass = currentClass;
	}
}
