import java.util.Scanner;
public class C6E18testPassword 
{
   public static void main(String[] args)
   {
	 int repeatIntnumber = 1;//for loop
	 String inputpw;//what you are going to input as a password
	 while (repeatIntnumber == 1)
	{ 	 Scanner in=new Scanner(System.in);
	     System.out.println("The program is going to check whether the password is vaild or not.");//intro
	     System.out.println("The password has three requirements to meet:");
	     System.out.println("1.An password must have at least 8 characters"+'\n'+"2.An password consists of only letters and digits."+'\n'+"3.An password must contain at least two digits."+'\n');
	     System.out.println("Please input a password:");
	     try
	     {
		     inputpw=in.nextLine();
		     System.out.println("The password you inputed is: "+inputpw);//display what you input
	         C6E18Password obj=new C6E18Password(inputpw);//bulid an object
	         System.out.println("valid value!");
	     }
	     catch(Exception ex)
	     {
		     System.out.println("Invalid value!");	 	 
	         System.out.println(ex.getMessage());//to display what's the problem 
	     }
         System.out.println("Repeat program (enter 1 for yes or 0 for no? ): ");//to ask users 
	     repeatIntnumber = in.nextInt();
          if ( repeatIntnumber == 0)
  	      in.close();
	 }
    }
}


