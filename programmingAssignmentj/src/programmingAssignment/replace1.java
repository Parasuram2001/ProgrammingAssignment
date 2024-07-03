package programmingAssignment;

public class replace1 {
	static String replaceChar(String str)
	{
		String newstr=str.replace("F", "T");
		return newstr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Fire";
		System.out.println(str+" replaced with "+replaceChar(str));

	}

}
