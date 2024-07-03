
public class Immute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hi");
		System.out.println(s1);
		String s2 = new String("Hi");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}

}
