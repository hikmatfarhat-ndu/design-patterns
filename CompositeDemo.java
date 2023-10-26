import composite.*;
public class CompositeDemo 
{ 
	public static void main (String[] args) 
	{ 
		Developer dev1 = new Developer(100, "Eng One", "Pro Developer"); 
		Developer dev2 = new Developer(101, "Eng Two", "Developer"); 
		Unit engDirectory = new Unit(); 
		engDirectory.addEmployee(dev1); 
		engDirectory.addEmployee(dev2); 
		
		Accountant acc1 = new Accountant(200, "Acc One", "Senior Manager"); 
		Accountant acc2 = new Accountant(201, "Acc Two ", "Manager"); 
		
		Unit accDirectory = new Unit(); 
		accDirectory.addEmployee(acc1); 
		accDirectory.addEmployee(acc2); 
	
		Unit directory = new Unit(); 
		directory.addEmployee(engDirectory); 
		directory.addEmployee(accDirectory); 
		directory.showEmployeeDetails(); 
	} 
} 
