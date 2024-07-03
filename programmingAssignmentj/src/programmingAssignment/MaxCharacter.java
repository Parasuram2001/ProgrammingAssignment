package programmingAssignment;

public class MaxCharacter {
	public static void main(String[] args) {
		String str = "abracadabra";
		int[] arr = new int[122];
		int max = 0;char ch1 = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0 && arr[i]>max)
			{
				max = arr[i];
				ch1 = (char)i;
			}
		}
		System.out.println(ch1);
	}

}
