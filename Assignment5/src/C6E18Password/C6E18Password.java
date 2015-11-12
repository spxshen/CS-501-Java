import javax.swing.*;
public class C6E18Password 
{
	private String password;
    private String errorMessage="";//like last assginment to display errors differently.
	public C6E18Password(String pw) throws Exception
	{
	    setpw(pw);//build up password in constructor  	
    }
	public void setpw(String pw)throws Exception
	{
		if(!isValidPw(pw))//isValidpw was defined before
		{
			Exception e=new Exception(errorMessage);//this is how we handle exception
			throw e;		
		}
	    //otherwise just set up password
		this.password=pw;
	}
	public boolean isValidPw(String pw)
	{ 
		//what to do is to follow the requirements one by one by using if else statement.
		if(!lettersAndDigits(pw))//to decide are there only letters and digits
		{
			errorMessage="An password consists of only letters and digits.";
			return false;
		}
		else if(pw.length()<8)
		{
			errorMessage="An password must have at least 8 characters.";//the reason why it is not valid
			return false;//return boolean value, of course
		}
		else if(!twoDigits(pw))//find out pw contains at least two digits or not
		{
			errorMessage="An password must contain at least two digits.";
			return false;
		}
		else
		{
			return true;//the rest on is true for sure		
			
		}
	
	}
	public boolean lettersAndDigits(String pw)
	{   
		for(int i=0;i<pw.length();i++)//iterate all chars over string pw
		{   
			boolean flag=false;// flag is like a label to use in the further decision, give it value false to start each loop
			if((pw.charAt(i)>='0'&&pw.charAt(i)<='9')||(pw.charAt(i)>='a'&& pw.charAt(i)<='z'))//if it is good 
			{
			    flag=true;//become true to avoid going into next if statement;
			}
		    if(flag==false) return false; 
		}
		return true;//finally it comes to true  
	}
	public boolean twoDigits(String pw)
	{   int count=0;//to add up if there is any digits
		for(int i=0;i<pw.length();i++)
		{
		   if(pw.charAt(i)>='0'&&pw.charAt(i)<='9')//if it is a number
		   {
			    count++;//increment one
				if(count>=2) return true;//at least two digits
			   
		   }
		}
		return false;
	}
		 
}




