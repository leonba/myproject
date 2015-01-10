//:Equivalance.java
public class Equivalance {
	public static void main(String[] args){
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		//operator from left to right
		int x=0, y=1, z=2;
		String sString ="x, y, z";
		System.out.println(sString + x + y + z);
		System.out.println(y + z + sString);
	}
}