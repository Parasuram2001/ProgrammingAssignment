interface Dami
{
	void disp();
}
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dami d = ()->{for (int i = 0; i < 10; i++) {
			System.out.println(i);
		};};
		d.disp();
	}

}
