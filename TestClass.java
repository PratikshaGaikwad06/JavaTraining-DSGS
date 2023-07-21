
public class TestClass {

	public static void main(String[] args) {
//		Student stud1 = new Student(11, "Pratiksha Gaikwad", "Aurangabad", 52000.0f);
//		stud1.setRollNo(11);
//		stud1.setStudName("pg");
//		stud1.setAddress("pune");
//		stud1.setFees(234112.0f);
//		Student stud2 = new Student(12, "Priya Gaikwad", "Vajapur", 70000.0f);
//		stud1.printStudent();
//		stud2.printStudent();
		
//		stud1.changeAddress("Hyderabad");
//		stud1.printStudentName();
//		float feesOfStudent = stud1.feesOfStudent();
//		float feesOfStudentForYears = stud1.feesForStudentForYears(4);
//		System.out.println("\n");
//		
//		stud1.printStudent();
		
//		stud1.changeAddress();
//		stud1.changeAddress("Pune");
//		stud1.changeAddress(42343.54f, 32564.56f, "Aurangabad");
//		stud1.changeAddress( "Ahemadnagar",42343.54f, 32564.56f);
		
		
		Student s = new Student(11, "Pratiksha Gaikwad", "Aurangabad", 52000.0f, "Medium");
		s.humanActivities(null);
	}

}
//Students belongs to College
class College{
	private int collegeID;
	private String collegeName;
	private int noOfStudents;
	
	public int getCollegeID() {
		return collegeID;
	}
	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	
	
	
	
}

class Human{
	private String humanColor;
	private String humanActivity;
	
	Human(String color){
		this.humanColor = color;
	}
	void humanActivities(String humanActivity) {
		this.humanActivity = humanActivity;
	}
}
class Student extends Human{

	private int rollNo;
	private String studName;
	private String address;
	private float fees;
	
	Student(int rollNo, String studName, String address, float fees, String colorOfStudent){
		super(colorOfStudent); 
		this.rollNo = rollNo;
		this.studName = studName;
		this.address = address;
		this.fees = fees;
		
	}
	void humanActivities(String humanActivites) {
		super.humanActivities(humanActivites);
		System.out.println("");
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
//	public Student(int rollNo, String studName, String address, float fees) {
//		
//		this.rollNo = rollNo;
//		this.studName = studName;
//		this.address = address;
//		this.fees = fees;
//	}
//	public void printStudent() {
//		System.out.println(rollNo);
//		System.out.println(studName);
//		System.out.println(address);
//		System.out.println(fees + "\n");
//	}
	
	//4 types of function
	void changeAddress(String address){ 
		this.address  = address;
		System.out.println("changing address  ....new address of " + studName +" is " + address);
	}
	void printStudentName(){ 
		System.out.println("Name of student : " + studName);
	}
	float feesOfStudent() {
		System.out.println("Fees of " + studName +  " : " + fees);
		return fees;
	}
	float feesForStudentForYears(int years) {
		System.out.println("Fees of " + studName +  " for " + years + " years is " + fees*years);
		return fees * years;
	}
	
	
	//function overloading 
	/*
//	void changeAddress(String address){ 
//		this.address  = address;
//		System.out.println("changing address  ....new address of " + studName +" is " + address);
//	}
	void changeAddress(){ 
		String collegeAddress = "Aurangabad";
		this.address  = collegeAddress;
		System.out.println("changing address  ....new address of " + studName +" is " + address);
	}
	
	void changeAddress(String address, float lattitude, float longitude) {
		this.address  = address;
		System.out.println("changing address  ....new address of " + studName +" is " + address + " lattitude : " + lattitude + " longitude : " + longitude);
	}
	
	void changeAddress(float lattitude, float longitude, String address) {
		this.address  = address;
		System.out.println("changing address  ....new address of " + studName +" is " + address + " lattitude : " + lattitude + " longitude : " + longitude);
	}*/
	
	
	
	
	

}

class EngineeringStudent extends Student{
	private int enrollId;
	
	EngineeringStudent(int rollNo, String studName, String address, float fees,String colorOfStudent, int enrollId){
		super(rollNo,  studName,  address,  fees,  colorOfStudent);
		this.enrollId = enrollId;
	}
	
	void humanActivities(String humanActivites) {
		super.humanActivities(humanActivites);
		System.out.println("enrollId : "  + enrollId);
	}
	
	
}
