package programmingAssignment;

public class removeSpaceCombine3 {

	public String removeSpace(String statement)
	{
		String replace=statement.replaceAll("  +","");
		return replace;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String statement="java   is   programming  language";
		removeSpaceCombine3 variable=new removeSpaceCombine3();
		System.out.println(variable.removeSpace(statement));

	}

}
