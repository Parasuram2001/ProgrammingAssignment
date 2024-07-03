package programmingAssignment;

public class next4thcharacter27 {

		static char[] print(char[] ch)
		{
			for(int i = 0;i<ch.length;i++)
			{
				ch[i] = (char)(ch[i]+4);
			}
			return ch;
		}
		public static void main(String[] args) 
		{
			String str = "hello";
			char[] ch = str.toCharArray();
			System.out.print(print(ch));
		}
	}
