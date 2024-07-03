package programmingAssignment;

public class reversewtoutequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		char[] ch = str.toCharArray();
		int i = 0;int j = ch.length-1;
		boolean flag = true;
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				flag = false;
			}
			i++;
			j--;
		}
		if(flag)
		{
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
