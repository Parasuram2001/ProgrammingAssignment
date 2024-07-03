package programmingAssignment;

public class lengthStringwtoutlength {
	int findlen(String str)
	{
		int count = 0;
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java  programs";
		lengthStringwtoutlength variable = new lengthStringwtoutlength();
		System.out.println(variable.findlen(str));
	}
}
