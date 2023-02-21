package BankManagement;

public class Employee2 extends Employee {
	private String sign_register_book;
	Employee2(String n,int a,String p,String s){
		name=n;
		age=a;
		position=p;
		sign_register_book=s;
	}
	String get_sign_register_book() {
		return  sign_register_book;
	}
	void check_files() {
		System.out.println("Checking Student Accounts files.");
	}
	public void get_bonus() {
		System.out.println("Get 15% bonus");
	}



}
