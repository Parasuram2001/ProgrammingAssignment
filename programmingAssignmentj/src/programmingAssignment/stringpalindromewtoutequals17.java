package programmingAssignment;

public class stringpalindromewtoutequals17 {
	static boolean palindrome(String text)
	{
		char[] ch = text.toCharArray();
		int i = 0;int j = ch.length-1;
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "kayakave";
		if(palindrome(text))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
