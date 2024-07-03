package programmingAssignment;

public class palindromonot8 {
	public static String chekpalindrome(String character)
	{
		String rev="";
		for(int i=character.length()-1;i>=0;i--)
		{
			rev=rev+character.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String character="LevEl";
		System.out.println(chekpalindrome(character));
		if(chekpalindrome(character).equalsIgnoreCase(character))
		{
			System.out.println(chekpalindrome(character)+" is palindrome");
		}
		else {
			System.out.println(chekpalindrome(character)+"not palindrome");
		}
	}
}
