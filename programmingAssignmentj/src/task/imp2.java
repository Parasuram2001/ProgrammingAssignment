package task;

public class imp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abracadabra";
		int[] arr = new int[122];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] > max) {
				max = (char) i;
			}

		}
		System.out.println((char) max);

	}
}
