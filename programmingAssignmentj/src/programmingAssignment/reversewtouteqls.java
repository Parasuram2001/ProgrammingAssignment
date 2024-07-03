package programmingAssignment;

public class reversewtouteqls {
	static boolean palindrome(String text)
	{
		char[] ch = text.toCharArray();
		int i = 0; int j = ch.length-1;
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
		String str = "gadag gadag";
		if(palindrome(str))
		{
			System.out.println("given text is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
