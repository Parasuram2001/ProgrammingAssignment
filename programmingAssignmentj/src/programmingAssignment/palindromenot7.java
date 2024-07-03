package programmingAssignment;

public class palindromenot7 {
	public String removerep(String characters)
	{
		String replace=characters.replaceAll("[0-9~!@#$%^&*()]", "");
		String rev="";
		for(int i=replace.length()-1;i>=0;i--)
		{
			rev=rev+replace.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String characters="L!@#ev432e#$8L$#";
		String str = characters.replaceAll("[0-9~`!@#$%^&*()_+-]", "");
		palindromenot7 variable=new palindromenot7();
		System.out.println(variable.removerep(characters));
		
		if((variable.removerep(characters).equalsIgnoreCase(str)))
		{
			System.out.println(variable.removerep(characters)+" "+"is palindrome");
		}
		else {
			System.out.println(variable.removerep(characters)+" "+"it is not palindrome");
		}
	}
}
