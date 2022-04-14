package ch06object;

public class DataClass {
	
	public int publicVal = 10;
	protected int protectedVal = 15;
	int defualtVal = 20;
	private int privateVal = 25;
	
	
	public static void main(String[] args) {
		DataClass data = new DataClass();
		
		System.out.println(data.publicVal);
		System.out.println(data.protectedVal);
		//System.out.println(data.defaultVal);
		System.out.println(data.privateVal);
	}
	
	

}
