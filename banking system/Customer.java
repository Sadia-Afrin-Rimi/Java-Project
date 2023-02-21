package BankManagement;

public class Customer {
	String name;
	int age;
	String Address;
	String Profession;
	String type_account;
	
	void check_balance(Account obj) {
		System.out.println("You have deposit :"+obj.deposit_money);
	}
	void check_type_of_accounts(Account obj2) {
		if(obj2.type=="Saving") {
			System.out.println("Show accountno.:"+obj2.account_no);
		}
		
	}
	

	
	
	
}
