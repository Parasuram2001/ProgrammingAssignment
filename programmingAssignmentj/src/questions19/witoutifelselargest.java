package questions19;

public class witoutifelselargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 20;
		int no2 = 30;
		int no3 = 40;
		System.out.println(no1>no2?"no1 largest":no2>no1?"no2 largest":no1>no3?"no1 largest":
			no2>no3?"no3 largest":no3>no1?"no3 largest":no3>no2?"no3 largest":"else all three are same");
	}

}
