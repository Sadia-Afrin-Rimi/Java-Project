package BankManagement;

public class Bank_Management_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer1 Alam=new Customer1("Alam Khan",39,"Jamalpur","Business Man","Saving");
		Customer2 Rumi=new Customer2("Rumi Khan",69,"Pabna","Ex govt. employee","Saving");
        Employee1 Sushant=new Employee1("Sushant Roy",29,"Accounter","Signed");
        Employee2 Sumi=new Employee2("Sumi Roy",49,"Cashier","Signed");
        Manager Rifat=new Manager("Rifat Abdullah",52);
        Account a=new Account("Saving","30000tk","sent","67890-opc");
        Clerk Rahim=new Clerk("Abdur Rahim",56,"Employee File");
        Alam.check_balance(a);
        Alam.check_type_of_accounts(a);
      
        Sushant.Create_Customer_account(Alam);
        Sushant.register_customer_info(Alam);
        Sushant.check_files();
        Sushant.get_bonus();
        a.show_name_of_customer(Alam);
        a.Show_checkbook();
        Rumi.check_balance(a);
        Rumi.check_type_of_accounts(a);
        Sumi.Create_Customer_account(Rumi);
        Sumi.register_customer_info(Rumi);
        Sumi.check_files();
        Sumi.get_bonus();

        Rifat.check_employees_attendence(Sushant);
        Rifat.check_files(Rahim);
        Rifat.get_bonus();
        Rahim.Provide_files();
        Rahim.organize_files();
        Rahim.get_bonus();
	}

}
