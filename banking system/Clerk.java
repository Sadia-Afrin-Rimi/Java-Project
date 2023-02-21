package BankManagement;

public class Clerk implements IBonus {
	String name;
	int age;
	String files;
	Clerk(String n,int a,String f){
		name=n;
		age=a;
		files=f;
		
	}
	void Provide_files() {
		System.out.println("I am providing files when sir need");
		
	}
	void organize_files() {
		System.out.println("I am oragined all files weel");
		
	}
	public void get_bonus() {
		System.out.println("Get 10% bonus");
	}
	

}
