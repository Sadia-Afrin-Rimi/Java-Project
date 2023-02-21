package BankManagement;

public class Account {
	String type;
	String deposit_money;
	String check_book;
	String account_no;
	String account_holder_name;
	
	Account(String t,String b,String c,String a){
		type=t;
		deposit_money=b;
		check_book=c;
		account_no=a;
		
	}
	void show_name_of_customer(Customer1 c1) {
	if(c1.	get_type_account()=="Saving") {
		System.out.println("Show Customer name:"+c1.name);
	}
		
	}
	void show_name_of_customer(Customer2 c1) {
		if(c1.	get_type_account()=="Saving") {
			System.out.println("Show Customer name:"+c1.name);
		}
			
		}

	void Show_checkbook() {
		if(check_book=="sent") {
			System.out.println("Customer have check book");
		}
		
	}
	


	
}
