package programmingAssignment;

public class uniqueCharacters24 {
	String unique(String str)
	{
		String answer = "";
		for(int i = 0;i<str.length();i++)
		{
			boolean flag = true;
			for(int j = 0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					flag =false;
					break;
				}
			}
			if(flag)
			{
				answer=answer+str.charAt(i);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is the text";
		uniqueCharacters24 variable = new uniqueCharacters24();
		System.out.println(variable.unique(str));
	}
}
