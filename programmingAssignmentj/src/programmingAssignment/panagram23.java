package programmingAssignment;
import java.util.TreeSet;
public class panagram23 {
	String checkPanagram(String text)
	{
		text = text.toLowerCase();
		TreeSet t = new TreeSet();
		for(int i = 0;i<text.length();i++)
		{
			char ch = text.charAt(i);
			if(ch!=' ')
			{
				t.add(ch);
			}
		}
		if(t.size()==26)
		{
			return "given string is panagram";
		}
		else {
			return "not panagram";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Quick Brown Fox Jumps On the lazydog and lazydog jumps on tv";
		panagram23 variable = new panagram23();
		System.out.println(variable.checkPanagram(str));
	}
}
