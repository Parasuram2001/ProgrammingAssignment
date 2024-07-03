package programmingAssignment;

public class frequencyCount526 {
	public static void main(String[] args) {
		String str = "java is the programming language";
		int[] arr = new int[122];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				System.out.print((char) (i) + "-->" + arr[i]);
			}
		}
	}
}
