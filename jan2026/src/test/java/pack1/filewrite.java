package pack1;
 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class filewrite {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text:");
		
		String text=sc.nextLine();
		FileWriter fw=new FileWriter("C:\\Users\\Akanksha.Choudhary\\OneDrive - Coforge Limited\\Desktop\\git\\first.txt.txt");
		fw.write(text);
		fw.close();
		
 
	}
 
}