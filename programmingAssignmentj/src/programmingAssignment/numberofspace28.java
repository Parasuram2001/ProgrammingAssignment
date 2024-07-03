package programmingAssignment;

public class numberofspace28 {
	static int numberSpace(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "declaring the data member as private restricting the direct access outside the class and providing the indirect access through getters and setters is called encapsulation";
		System.out.println(numberSpace(str));
	}
}
