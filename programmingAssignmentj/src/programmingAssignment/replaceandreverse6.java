package programmingAssignment;

public class replaceandreverse6 {
	public String reprev(String characters)
	{
		String replace=characters.replaceAll("[0-9!~`@#$%^&*()]", "");
		String rev="";
		for(int i=replace.length()-1;i>=0;i--)
		{
			rev=rev+replace.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String characters="L#$@!an124gua&*^ge#%134";
		replaceandreverse6 variable=new replaceandreverse6();
		System.out.println(variable.reprev(characters));

	}

}
