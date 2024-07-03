package task;

public class imp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "session";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;  				//or use treeset
			}

		}
		System.out.println(count);

		String str1 = "find";
		int count1 = 0;
		char[] ch = str1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count1++;
		}
		System.out.println(count1);
	}
	

}
