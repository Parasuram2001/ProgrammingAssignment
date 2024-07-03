package programmingAssignment;

public class removeadjacent34 {

	public static void main(String[] args) 
	{
		String str="java java java is java java programming language";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length-1;i++)
		{
			if(!str1[i].equals(str1[i+1]))
			{
				System.out.print(str1[i]+" ");
			}
		}
		System.out.print(str1[str1.length-1]);
	}

}
