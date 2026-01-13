package pack1;
class balance{
	String name;
	double bal;
	public balance(String n,double b) {
		name=n;
		bal=b;
	}
	public void show() {
		if(bal>0) {
			System.out.println("name:"+"$"+bal);
		}
	}
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
balance obj=new balance("akanksha",500);
obj.show();
	}

}
