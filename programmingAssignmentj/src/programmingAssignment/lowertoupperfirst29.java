package programmingAssignment;

public class lowertoupperfirst29 {
	static char[] upperLo(char[] ch) {
		ch[0] = (char) (ch[0] - 32);
		for (int i = 1; i < ch.length; i++) {
			if (ch[i] == ' ') {
				ch[i + 1] = (char) (ch[i + 1] - 32);
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		String str = "an event triggered during the execution of the program, abrupt or sudden changes in the event and this event can be handled by try catch and throws";
		char[] ch = str.toCharArray();
		System.out.println(upperLo(ch));
	}
}
