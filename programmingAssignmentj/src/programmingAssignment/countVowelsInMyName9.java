package programmingAssignment;

public class countVowelsInMyName9 {
	public int countVowels(String myName)
	{
		int count=0;
		for(int i=0;i<myName.length();i++)
		{
			char ch=myName.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName="Parashuram";
		countVowelsInMyName9 refVariable=new countVowelsInMyName9();
		System.out.println("count of vowels in my Name is "+refVariable.countVowels(myName));
	}
}
