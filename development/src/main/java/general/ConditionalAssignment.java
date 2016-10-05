package general;

public class ConditionalAssignment {
	
	private int v1;
	private int v2;
	
	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public int getV2() {
		return v2;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}

	public ConditionalAssignment() {}
	
	public void max(int v1, int v2) {
		
		this.setV1(v1);
		this.setV2(v2);
		
		int vMax = v1>v2 ? v1:v2;
		System.out.println(vMax);
	}
	
	public static void main(String[] args) {
		new ConditionalAssignment().max(10, 9);
	}

}
