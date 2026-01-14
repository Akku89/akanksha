package pack1;

public class person {
String firstname;
String lastname;
char gender;
public person(String fn,String ln,char g) {
	this.firstname=fn;
	this.lastname=ln;
	this.gender=g;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
