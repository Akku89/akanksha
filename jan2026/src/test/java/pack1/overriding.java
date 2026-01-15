package pack1;
class animal{
	void sound() {
		System.out.println("animal makes a sound");
	}
}
	class cat extends animal{
		@Override
		void sound() {
			System.out.println("cat makes sound");
		}
	}


public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal obj=new cat();
obj.sound();
	}

}
