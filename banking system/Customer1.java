package BankManagement;

public class Customer1 extends Customer{
	private String type_account;
	Customer1(String n,int a,String A,String p,String o){
		name=n;
		age=a;
		Address=A;
		Profession=p;
		type_account=o;
	}
	String get_type_account() {
		return type_account;
	}


}
