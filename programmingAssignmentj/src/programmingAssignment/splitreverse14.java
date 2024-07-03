package programmingAssignment;
public class splitreverse14 {

	static void reversethis(String text)
	{
		String store = "";
		String[] text1 = text.split(" ");
		for(int i = 0;i<text1.length;i++)
		{
			System.out.print(reversetext(text1[i]+ " "));
		}
	}
	static String reversetext(String str)
	{
		String reversechar = "";
		for(int i = str.length()-1;i>=0;i--)
		{
			reversechar = reversechar + str.charAt(i);
		}
		return reversechar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "money is happiness";
		reversethis(str);
	}
}
