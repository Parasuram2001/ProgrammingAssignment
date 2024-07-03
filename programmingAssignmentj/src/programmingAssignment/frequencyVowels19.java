package programmingAssignment;

public class frequencyVowels19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Narendre Modi";
		int[] arr = new int[122];
		for(int i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				arr[ch]++;
			}	
		}
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+"-->"+arr[i]);
			}
		}
	}

}
