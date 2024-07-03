package programmingAssignment;

public class vowels$12 {
	public char rep$(String str)
	{
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print('$');
			}
			else {
				System.out.print(ch);
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mahalingpur";
		vowels$12 vowcon=new vowels$12();
		vowcon.rep$(str);
	}
}
