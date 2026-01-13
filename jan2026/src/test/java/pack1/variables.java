package pack1;

public class variables {
 private double height=10;
 private double width=20;
 private double depth=30;
 private static int boxid;
 public double volume() {
	  double temp=0;
	  try{
	  temp=width*height*depth;
	  } catch(Exception e) {
		  e.printStackTrace();
	  }
	  return temp;
 }
 public static void main(String args[]) {
	 variables v=new variables();
	 System.out.println("volume:"+v.volume());
 }
 

}
