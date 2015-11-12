import java.util.Scanner;
public class testC12E13countCWLinfile 
{
public static void main(String args[])throws Exception
{   
	int repeatIntnumber = 1;//for loop
	while(repeatIntnumber==1)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("The program is going to count characters, words and lines in the given file");//intro
		try{

			System.out.println("if you put you test file in the src file, please input src/ before your test file name");//reminder
			System.out.println("The input format like src/XXX.txt");
			System.out.println("Please input your file name:");//ask for users to input file name or the path of the file
			String f=in.nextLine();
			System.out.println("The file name is "+f);//display the name you input
			C12E13countCWLinfile obj=new C12E13countCWLinfile(f);
			System.out.println("File "+obj.filefunc()+" has\n"+obj.charfunc()+" characters\n"+obj.wordfunc()+" words\n"+obj.linefunc()+" lines");
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			
		}
		System.out.println("Repeat program (enter 1 for yes or 0 for no? ): ");//whether continue or exist
	    repeatIntnumber = in.nextInt();
        if ( repeatIntnumber == 0)
  	    in.close();
	}
	
}
}

