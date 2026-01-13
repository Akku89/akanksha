package pack1;
class box{
	double width=10;
	double height=20;
	double depth=30;
	double calvolume() {
		return width*height*depth;
	}
}

public class tcoo3_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
box obj=new box();
System.out.println(obj.calvolume());
	}

}
