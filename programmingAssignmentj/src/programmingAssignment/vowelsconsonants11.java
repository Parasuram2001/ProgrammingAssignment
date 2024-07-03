package programmingAssignment;

public class vowelsconsonants11 {
	public String vowcon(String str,String vowels,String consonants)
	{
		for(int i=0;i<str.length();i++)
		{
			char[] ch=str.toCharArray();
			if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
			{
				consonants=consonants+ch[i];
			}
			else {
				vowels=vowels+ch[i];
			}
		}
		return consonants+" "+vowels;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mahalingpur";
		String vowels=" ";
		String consonants=" ";
		vowelsconsonants11 vcn=new vowelsconsonants11();
		System.out.println(vcn.vowcon(str,vowels,consonants));
		
	}
}
