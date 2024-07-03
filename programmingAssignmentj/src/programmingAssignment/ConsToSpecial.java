package programmingAssignment;

public class ConsToSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi hello this";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]==ch[i+1])
			{
				ch[i]=ch[i+1]='$';
			}
		}
		System.out.print
		(ch);
		
	}

}
