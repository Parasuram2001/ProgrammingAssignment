package programmingAssignment;

public class palindromeornot5 {
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
		String text="kaivole";
		palindromeornot5 variable=new palindromeornot5();
		System.out.println(variable.reverse(text));
		if((variable.reverse(text)).equals(text))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
