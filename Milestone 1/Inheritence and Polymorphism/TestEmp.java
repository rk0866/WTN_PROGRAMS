package Encapsulation_Inheritence;

public class TestEmp {

	public static void main(String[] args) {
		Employee e=new Employee("Rk");
		e.setIns("2355");
		e.setSal(10000);
		e.setYear(2004);
		System.out.println("The Salary is : "+e.getSal());
		System.out.println("The Year is : "+e.getYear());
		System.out.println("The Insurence no is : "+e.getIns());
	}

}
