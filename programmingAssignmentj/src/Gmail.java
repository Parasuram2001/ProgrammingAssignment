
public class Gmail {
	static void check() throws LoginException
	{
		int age = 15;
		if(age>=18)
		{
			System.out.println("can login");
		}
		else {
			throw new LoginException("cannt login");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		}
		catch(LoginException e)
		{
			System.out.println(e.getWarn());
		}
		
	}

}
class LoginException extends Exception
{
	String msg;
	LoginException(String msg)
	{
		this.msg = msg;
	}
	public String getWarn()
	{
		return msg;
	}
}
