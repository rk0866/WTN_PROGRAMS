package Encapsulation_Inheritence;

public class Employee extends PersonEmp{
	Employee(String n)
	{
		super(n);
	}
double sal;
int year;
String ins;
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getIns() {
	return ins;
}
public void setIns(String ins) {
	this.ins = ins;
}
}
