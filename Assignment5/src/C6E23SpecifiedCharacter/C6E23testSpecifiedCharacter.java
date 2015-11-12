import java.util.Scanner;//for Scanner

public class C6E23testSpecifiedCharacter
{
	public static void main(String[] args)
	{
		String string;
	    char spec;
	    boolean loop1=true;//first loop for string
	    while(loop1)
	    {  
	    	Scanner in1=new Scanner(System.in);
	    	System.out.println("The program is going to the find the number of occurences of a specified char in string");//intro
	    	System.out.println("Please enter a string:");
	    	string=in1.nextLine();
	    	System.out.println("The string you inputed is "+string);//display
	    	boolean loop2=true;//second one for char
	    	while(loop2)
	    	{
	    		Scanner in2=new Scanner(System.in);
	    		System.out.println("please enter a character:");
	    		spec=in2.nextLine().charAt(0);
	    		System.out.println("The character you inputed is "+spec);//display
	    		C6E23SpecifiedCharacter obj=new C6E23SpecifiedCharacter(string,spec);
	    		if(obj.count(string, spec)!=0)//if specified char could be found in the string 
	    		{
	    			System.out.println("The number of occurrences of the character in the string is "+obj.count(string, spec));
	    		}
	    		else //otherwise tell user cannot located the char in the string
	    			System.out.println("The number of occurrences is "+obj.count(string, spec)+"\n"+spec+" cannot be found in the string!");
	            System.out.print("Repeat program (enter 'y' for yes to input a new character or 'n' for no? ):");
                Scanner in3=new Scanner(System.in);
                String a=in3.next();
                if(a.toLowerCase().equals("n"))
                {
                	loop2=false;
                }
	    	}
	    	System.out.print("Repeat program (enter 'y' for yes to input a new string or 'n' for no? ):");
	        Scanner in4=new Scanner(System.in);
	        String b=in4.next();
	        if(b.toLowerCase().equals("n"))
	        {
	        	loop1=false;
	        }
	        System.out.println();  
	    }

	}
	
}


