package programmingAssignment;

public class reverseusingsplit13 {
	void reverse(String text)
	{
		String[] text1 = text.split(" ");
		for(int i = text1.length-1;i>=0;i--)
		{
			System.out.print(text1[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nothing is impossible";
		reverseusingsplit13  variable = new reverseusingsplit13();
		variable.reverse(str);

	}

}
