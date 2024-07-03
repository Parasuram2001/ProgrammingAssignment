package programmingAssignment;

public class RemoveAdjacent30 {

	public static void main(String[] args) {
	String str="java java java is java java programming language";
	String[]str2=str.split(" ");
	
	     for(int i=0;i<str2.length-1;i++)
	     {
	    	 boolean flag = true;
	    	 if(str2[i].equals(str2[i+1]))
	    		 flag=false;
	    	 
	    	 if(flag)
	    	 {
	    		 System.out.print(str2[i]+" ");
	    		
	    	 }
	     }
	    System.out.print(str2[str2.length-1]);
	}
}
