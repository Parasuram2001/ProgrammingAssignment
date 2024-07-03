package programmingAssignment;

public class reverseExcepttoChar16 {
	String reverse(String str)
	{
		String reverse = "";
		char[] ch = str.toCharArray();
		for(char text:ch)
		{
			reverse = text + reverse;
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "reverse this except toCharArray";
		reverseExcepttoChar16 variableChar = new reverseExcepttoChar16();
		System.out.println(variableChar.reverse(str));
	}
}
