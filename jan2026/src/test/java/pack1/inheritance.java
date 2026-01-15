package pack1;
class base{
	public void basemethod() {
		System.out.println("Base method");
	}
}
class Derived extends base{
	public void derivedmethod() {
		System.out.println("derived method");
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Derived d=new Derived();
System.out.println(d instanceof Derived);
d.basemethod();
d.derivedmethod();
	}

}
