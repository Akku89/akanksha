package pack1;
abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	void draw() {
		System.out.println("drawing the rectangle");
	}
}

public class abstractcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle obj=new rectangle();
obj.draw();
	}

}
