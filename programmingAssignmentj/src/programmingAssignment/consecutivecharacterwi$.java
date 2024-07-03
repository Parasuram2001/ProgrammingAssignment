package programmingAssignment;
public class consecutivecharacterwi$ {
	char[] print(String str)
	{
		String answer = "";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				 ch[i]=ch[i+1]='$';
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello kyalli";
		consecutivecharacterwi$ variable = new consecutivecharacterwi$();
		System.out.println(variable.print(str));
	}
}
