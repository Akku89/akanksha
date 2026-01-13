package pack1;

public class controlstatements {
 public int num=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=20;
if(num%2==0) {
	System.out.println("even number");
}
else {
	System.out.println("odd number");
}
int marks=50;
if(marks>90) {
	System.out.println("grade A");
}
else if(marks>70) {
	System.out.println("grade B");
}
else {
	System.out.println("grade C");
}
	
	int day=7;
	switch(day) {
	case 1: 
		System.out.println("monday");
	break;
	case 2: 
		System.out.println("tuesday");
	break;
	case 3: 
		System.out.println("wednesday");
	break;
	case 4: 
		System.out.println("thursday");
	break;
	case 5: 
		System.out.println("friday");
	break;
	default:
		System.out.println("wrong choice");
	}
	
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	}
	int j=1;
	while(j<=10) {
		System.out.println(j);
		j++;
	}
	int k=1;
	do
	{
		System.out.println(k);
		k++;
		
	}while(k<=5);
	
	}
}
