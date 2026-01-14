package pack1;

public class staticmodifier {
static int num1=3;
static int num2;
static {
	System.out.println("Static block intialized");
	 num2=num1*4;
}
static void mymethod(int num3) {
	System.out.println("number3="+ num3);
	System.out.println("number1="+ num1);
	System.out.println("number2="+ num2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod(42);

	}

}
