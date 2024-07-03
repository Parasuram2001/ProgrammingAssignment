public class Ola{
	static void check() throws RideException
	{
		int age = 15;
		if(age>=18)
		{
			System.out.println("ride the bike");
		}
		else {
			throw new RideException("cann't ride the bike");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		}
		catch(RideException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
class RideException extends Exception
{
	String msg;
	RideException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

