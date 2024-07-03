package programmingAssignment;

public class removeExtraSpace2 {
	public String removeSpace(String statement)
	{
		String replace=statement.replaceAll("	+","");
		return replace;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String statement="java  	is  	programming  	language";
		removeExtraSpace2 variable=new removeExtraSpace2();
		System.out.println(variable.removeSpace(statement));

	}

}
