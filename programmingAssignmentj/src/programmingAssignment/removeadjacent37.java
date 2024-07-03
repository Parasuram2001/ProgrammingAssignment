package programmingAssignment;

public class removeadjacent37 {
	char[] remove(char[] str)
	{
		boolean flag = true;
		for(int i = 0;i<str.length;i++)
		{
			if(str[i]==str[i+1])
			{
				flag = false;
			}
		}
		if(flag)
		{
			return str;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbccdd";
		char[] ch = str.toCharArray();
		removeadjacent37 variable = new removeadjacent37();
		System.out.println(variable.remove(ch));
	}

}
