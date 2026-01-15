package pack1;
class car{
	int noofcylinders;
	int noofvalues;
	int enginepower;
	boolean ispowersteering;
	car(){
		noofcylinders=3;
		noofvalues=4;
		enginepower=46;
		ispowersteering=false;
		
	}
	car(boolean pr){
		this.ispowersteering=pr;
	}
	car(int ncy,int ncv,int ep){
		this.noofcylinders=ncy;
		this.noofvalues=ncv;
		this.enginepower=ep;
		this.ispowersteering=true;
	}
}


public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c=new car();
System.out.println(c.noofcylinders);
car c1=new car(true);
System.out.println("ispowersteering:"+c1.ispowersteering);
car c2=new car(4,50,4);
System.out.println("no of cylinders:"+c2.noofcylinders);
System.out.println("no of values:"+c2.noofvalues);
	}

}
