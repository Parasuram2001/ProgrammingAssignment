package programmingAssignment;

public class frequency18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Narendre Modi";
		int[] arr = new int[122];
		for(int i = 0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			arr[ch]++;
		}
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i + " --> "+arr[i]);
			}
		}
	}
}
