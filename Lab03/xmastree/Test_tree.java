
public class Test_tree {
	
	public static void main(String[] args) {
		Tree mytree = new BlueSpruce(); 
		mytree = new Star(mytree); 
		mytree = new Ruffles(mytree); 
		mytree = new Star(mytree); 
		mytree = new Ruffles(mytree); 
		printtree(mytree); 
	}

	private static void printtree(Tree mytree) {
		System.out.println(mytree.getDescription() + " \ncosts: " +mytree.cost());
	}
}
