package general;

public class LogicalOperators {
	
	public LogicalOperators() {}
	
	public static  boolean alwaysTrue() {
		System.out.println("i'm true");
		return true;
	}
	
	public static boolean alwaysFalse() {
		System.out.println("i'm false");
		return false;
	}
	
	public static void excecuteLeftAndRightConditional(boolean left, boolean right) {

		if ( left && right ) {
			System.out.println("both are true");
		}
		else {
			System.out.println("left is " + left + " and " + "right is " +  right);
		}
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Result is " + ( alwaysFalse() && alwaysTrue() ));	
		System.out.println("Result is " + ( alwaysTrue() && alwaysFalse() ));
	}
}
