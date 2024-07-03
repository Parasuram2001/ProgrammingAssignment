package programmingAssignment;

public class reverseString4 {
	public String reverse(String text)
	{
		String rev="";
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="money is happiness";
		reverseString4 variable=new reverseString4();
		System.out.println(variable.reverse(text));

	}

}
