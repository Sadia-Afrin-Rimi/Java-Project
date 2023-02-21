package BankManagement;

abstract public class Employee implements IBonus{
	String name;
	int age;
	String position;
	
			
	
    void Create_Customer_account(Customer e) {
    	if(e.type_account=="Saving") {
    		System.out.println("Create Account");
    	}
    	
    }
    void register_customer_info(Customer e1) {
    	System.out.println("***CUSTOMER INFORMATION***");
    	System.out.println("Name:"+e1.name+"\nAge:"+e1.age+"\nAddress:"+e1.Address+"Profession:"+e1.Profession);
    	
    }
    abstract void check_files();
    
	
	
	

}
