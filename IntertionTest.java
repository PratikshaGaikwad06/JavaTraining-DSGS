import java.util.Scanner;

public class IterationTest {
	public static void main(String[] args) {
	
		
		Demo demoRef = new Demo();
		demoRef.demo();

	}
}

//ContentCreation cc = new Youtuber();
//Achivements a = cc.makesVideo( );
//interface ContentCreation{
//	
//}

class Demo
{
	void demo() {
		
		System.out.println("1. Intern   &   2. FTE");
		System.out.println("Hiring Employee for Full Time and Internship : ");
		
		Scanner sc  = new Scanner(System.in);
		String empType = sc.next();
		
		Employee emp = HiringTeam.hireEmployee(empType);
		SavingsAccount savObj = new SavingsAccount();
		Work work = emp.doWork(savObj);
		work.salary(savObj);
		//Working working = new Employee();
		//Salary salary = working.doWork();
		
	}
}

interface Work{
	void salary(SavingsAccount sc);
}
class FTEWork implements Work{
	public void salary(SavingsAccount sc){
		System.out.println("Fulll Time Employee salary : " + sc.getAmt());
		
	}
}
class Internship implements Work{
	public void salary(SavingsAccount sc){
		System.out.println("Intern salary : " + sc.getAmt());
	}
}


interface Employee{
	Work doWork(SavingsAccount acc);
}
class Intern implements Employee{

	@Override
	public Internship doWork(SavingsAccount acc) {
		Internship work = new Internship();
//		work.salary();
		System.out.println("Doing internship");
		acc.deposit(5_000.0f);
		return work;
		
	}
	
}
class FullTimeEmployee implements Employee{

	
	@Override
	public FTEWork doWork(SavingsAccount acc) {
		FTEWork work = new FTEWork();
//		work.salary();
		System.out.println("Doing full time work");
		acc.deposit(20_000.0f);
		return work;
		
	}
	
}
class HiringTeam{
	String employeeType;
	public static Employee hireEmployee(String employeeType) {
		Employee emp = null;
		if(employeeType.equalsIgnoreCase("intern")) {
			emp = new Intern();
		}
		else if(employeeType.equalsIgnoreCase("fte")) {
			emp = new FullTimeEmployee();
		}
		return emp;
	}
}


interface Account {
	void withdraw(float  amt);
	void deposit(float amt);
}
class SavingsAccount implements Account {
	float amt;
	
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	public void withdraw(float amt) {
		this.amt  -= amt;
		System.out.println("withdrawing..."+amt);
	}
	public void deposit(float amt) {
		this.amt  += amt;
		System.out.println("depositing...."+amt);
	}
	
}






