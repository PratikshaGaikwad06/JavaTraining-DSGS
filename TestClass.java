
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
		
		
		//Parent Class - Human
		//Child Class - Student, Teacher
		//child of child class - GraduateStudent
		System.out.println("Using Human Class Object : ");
		Human human = new Human("Pratiksha Gaikwad", "Aurangabad", 22);
		human.displayInfo();
		
		System.out.println("\n===========================================\n");
		
		System.out.println("Using Student Class Object : ");
		Student s = new Student(20190617,"Pratiksha Gaikwad", "Aurangabad", 22, 120000.0f);
		s.displayInfo();
		s.displayStudentRollNumber();
		
		System.out.println("\n===========================================\n");
		
		System.out.println("Using Teacher Class Object : ");
		Teacher t = new Teacher("Walmik Gaikwad", "Nagpur", 22, "Maths");
		t.displayInfo();
		t.displaySubject();		
		System.out.println("\n===========================================\n");
		
		System.out.println("Using GraduateStudent Class Object : ");
		GraduateStudent gs = new GraduateStudent(20190617,"Pratiksha Gaikwad", "Aurangabad", 22, 120000.0f, "Information Technology");
		gs.displayInfo();
		gs.displayStudentRollNumber();
		gs.displayFieldOfStudy();
		
		System.out.println("\n===========================================");
		
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
	private String name;
	private String address;
	private int age;
	
	Human(String name, String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	 public void displayInfo() {
	    System.out.println("Name: " + name);
	    System.out.println("Address: " + address);
	    System.out.println("Age: " + age);
	 }
	
	//4 types of function
		void changeAddress(String address){ 
			this.address  = address;
			System.out.println("changing address  ....new address of " + name +" is " + address);
		}
		void printStudentName(){ 
			System.out.println("Name of student : " + name);
		}
		// other two in student class
	
	
		
}

//Student is a Human --> Single 
class Student extends Human{

	private int rollNo;
	private float fees;
	
	Student(int rollNo, String name, String address, int age, float fees){
		super(name, address, age); 
		this.rollNo = rollNo;
		this.fees = fees;
		
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees; 
	}
	
	public void displayStudentRollNumber() {
        System.out.println("Roll Number: " + rollNo);
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
	
	float feesOfStudent() {
		System.out.println("Fees of " + super.getName() +  " : " + fees);
		return fees;
	}
	float feesForStudentForYears(int years) {
		System.out.println("Fees of " + super.getName() +  " for " + years + " years is " + fees*years);
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

//GraduateStudent is a Student who is a Human --> Multilevel
class GraduateStudent extends Student{
	private String major;
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	GraduateStudent(int rollNo, String name, String address, int age, float fees,  String major){
		super(rollNo,  name, address,  age,  fees  );
		this.major = major;
	}
	
	 public void displayFieldOfStudy() {
	        System.out.println("Field of Study: " + major);
	    }
		
}

// Teacher and Student are humans --> Hierarchical
class Teacher extends Human{
	private String subject;

    Teacher(String name, String address, int age, String subject) {
        super(name, address, age);
        this.subject = subject;
    }

    public void displaySubject() {
        System.out.println(super.getName() + " teaches " + subject );
    }
}
