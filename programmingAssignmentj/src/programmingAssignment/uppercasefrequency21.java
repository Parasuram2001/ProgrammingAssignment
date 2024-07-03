package programmingAssignment;

public class uppercasefrequency21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Narendre Modi";
		int[] arr = new int[122];
		for(int i = 0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			arr[ch]++;
		}
		for(int i = 65;i<90;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i + " --> "+arr[i]);
			}
		}
	}
}
