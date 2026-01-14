package pack1;

public class lab7 {
private String firstname;
private String lastname;
private char gender;
private String phonenumber;
public lab7() {
	this.firstname="akanksha";
	this.lastname="choudhary";
	this.gender='F';
	this.phonenumber="99999999";
}
public lab7(String fn,String ln,char g,String pn) {
	this.firstname=fn;
	this.lastname=ln;
	this.gender=g;
	this.phonenumber=pn;
	
}
public void setpn(String phoneno) {
	this.phonenumber=phoneno;
}
public void display() {
	System.out.println("person details:");
	System.out.println("firstname:"+firstname);
	System.out.println("lastname:"+lastname);
	System.out.println("gender:"+gender);
	System.out.println("phonenumber:"+phonenumber);
}
}
