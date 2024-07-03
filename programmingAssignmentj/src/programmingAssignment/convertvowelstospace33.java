package programmingAssignment;

public class convertvowelstospace33 {
	char[] convert(String str)
	{
		String ans = "";
		int count = 0;
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
				if(count>2)
				{
					System.out.print(" ");
				}
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is the Programming Language";
		convertvowelstospace33 variable = new convertvowelstospace33();
		System.out.println(variable.convert(str))
		;
	}

}
