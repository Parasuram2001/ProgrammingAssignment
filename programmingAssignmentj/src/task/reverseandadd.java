package task;

public class reverseandadd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i love india";
		System.out.println(str);
		String str1 = str.replaceAll(" ", "").toUpperCase();//ILOVEINDIA
		char[] ch = str.toCharArray();
		int j = str1.length()-1;//9
		for(int i = 0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				ch[i] = str1.charAt(j);
				j--;
			}
		}
		System.out.println(ch);
	}
	

	
}
