package programmingAssignment;
import java.util.Arrays;
public class anagram22 {
	String checkAnagram(String text1,String text2)
	{
		if(text1.length()==text2.length())
		{
			char[] ch = text1.toCharArray();
			char[] ch1 = text2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean result = Arrays.equals(ch,ch1);
			if(result)
			{
				return "given string is anagram";
			}
			else {
				return "not anagram";
			}
		}
		else {
			return "not anagram";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is text";
		String str1 = "is this test";
		anagram22 variable = new anagram22();
		System.out.println(variable.checkAnagram(str,str1));
	}
}
