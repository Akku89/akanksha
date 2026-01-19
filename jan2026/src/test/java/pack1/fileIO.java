package pack1;

import java.io.FileInputStream;
import java.io.IOException;
 
public class fileIO {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Akanksha.Choudhary\\OneDrive - Coforge Limited\\Desktop\\git\\first.txt.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);
		}
		
		fis.close();
		
 
	}
 
}
 
