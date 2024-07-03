package programmingAssignment;

public class countConsonantsInMyName10 {

	public int countConsonants(String myName)
	{
		int count=0;
		for(int i=0;i<myName.length();i++)
		{
			char ch=myName.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName="Parashuram";
		countConsonantsInMyName10 refVariable=new countConsonantsInMyName10();
		System.out.println("count of consonants in my Name is "+refVariable.countConsonants(myName));
	}

}
