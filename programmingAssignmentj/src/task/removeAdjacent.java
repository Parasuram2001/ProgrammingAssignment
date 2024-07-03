package task;

public class removeAdjacent {
	static boolean remove(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return true;
		}
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi hi how how are you";
		String[] str1 = str.split(" ");
		for(int i = 0;i<str1.length-1;i++)
		{
			if(remove(str1[i],str1[i+1]))
					{
					System.out.print(str1[i]+" ");
					}
		}
		System.out.print(str1[str1.length-1]);
	}

}
