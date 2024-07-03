package programmingAssignment;

public class reversewtoutcharAt15 {
	String reversemet(String text)
	{
		char [] character = text.toCharArray();
		String reverse = "";
		for(char c:character)
		{
			reverse = c + reverse;
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "this is the text";
		reversewtoutcharAt15 variable = new reversewtoutcharAt15();
		System.out.println(variable.reversemet(text));
	}
}
