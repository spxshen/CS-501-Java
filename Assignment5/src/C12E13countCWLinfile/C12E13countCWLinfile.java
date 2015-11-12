import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class C12E13countCWLinfile extends JFileChooser//by using JFileChooser
{
private int countChar;//number of char in the file
private int countWord;//number of word
private int countLine;//number of line
private String filename;
public C12E13countCWLinfile(String f) throws Exception //constructor
{
    countChar=0;	
	countWord=0;
	countLine=0;
	File file=new File(f);
	if(!file.exists())//check it out whether it exists or not
	{
		Exception ex=new Exception("The File does not exist");//exception handling what you asked for
	    throw ex;
	}
    //otherwise just initialize filename
	filename=f;
    BufferedReader read=new BufferedReader(new FileReader(file));//to build an obj can read from file
    String line;
    System.out.println("The file is shown below:");
    while((line=read.readLine())!=null)//when it is null, there is nothing in the file
    {   
    	
        System.out.println(line);//display the file
    	++countLine;//increment one if read.readline()!=null
    	countChar+=countlen(line);
    	countWord+=countwor(line);
    }
    System.out.println();
}
public int countlen(String a)
{
	return a.length();//to count the sum of char in the string and whitespace is also char
	
}
public int countwor(String b)
{
	return b.split(" ").length; //cause each word is separated by whitespac 
	                            //Section 10.10.4 for regex by using splitting    
	                            //length is an attribute of array, current line after split.
	                            //so this is different from string.length() cause it is an array not string at all.	
}
 public int charfunc()//to return what we need
 {
	 return countChar;
 }
 public int wordfunc()
 {
	 return countWord;
 }
 public int linefunc()
 {
	 return countLine;
 }
 public String filefunc()
 {
	 return filename;
	 
 }

}

