public class C6E23SpecifiedCharacter
{
    private String string;
	private char specifiedchar;
	public C6E23SpecifiedCharacter(String x,char a)//constructor
	{
	   this.string=x;
	   this.specifiedchar=a;		
	}
	
	public static int count(String str,char a)
	{
	  int sumup=0; 
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)==a)
		  sumup++;//sum up specific char
		 
	  }
	  return sumup;//if cannot find such char, the method gonna return 0 instead.
	}

   
	
}

