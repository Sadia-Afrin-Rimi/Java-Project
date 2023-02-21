package BankManagement;

public class Manager implements IBonus {

	String name;
	int age;
	Manager(String n,int a){
		name=n;
		age=a;
	}
	
	void check_employees_attendence(Employee1 e1) {
		if(e1.get_sign_register_book()=="Signed") {
			System.out.println("Attend");
		}
			else {
				System.out.println("Absent");
			}
	}
		void check_employees_attendence(Employee2 e1) {
			if(e1.get_sign_register_book()=="Signed") {
				System.out.println("Attend");
			}
				else {
					System.out.println("Absent");
				}

		
		
	}
	void check_files(Clerk c) {
		System.out.println("Files name:"+c.files);
		
	}
	public void get_bonus() {
		System.out.println("Get 30% bonus");
	}
}
