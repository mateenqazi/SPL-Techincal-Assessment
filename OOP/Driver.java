import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

interface User
{
	void getProfile();
}

class UserImplementation implements User 			//class implements User interface
{
	String firstName;
	String lastName;
	String userName;
	String password;
	static ArrayList<UserImplementation> users = new ArrayList<UserImplementation>();

	public UserImplementation(String firstname1, String lastName1, String username1, String password1){		//Parameterized constructor
		setFirstName(firstname1);
		setLastName(lastName1);
		setUserName(username1);
		setPassword(password1);
	}

	void setFirstName(String firstname1){
		firstName = firstname1;
	}

	void setLastName(String lastName1){
		lastName = lastName1;
	}	
	
	void setUserName(String username1){
		userName = username1;
	}

	void setPassword(String password1){
		password = password1;
	}

	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void getProfile(){					//will show Polymorphic behavior
		System.out.println("firstname");
	}
}

interface Student extends User
{
	// void viewMarks();
	// void viewResources();
	// void viewRoster();
	// void viewAssignments();
}

//StudentImplementation is a child class of UserImplementation (Inheritance)
class StudentImplementation extends UserImplementation implements Student 	//class implements Student interface
{
	String rollNo;
	String status;
	ArrayList<String> courses = new ArrayList<String>();	//an arraylist to store the courses a student is enrolled in
	static ArrayList<StudentImplementation> students = new ArrayList<StudentImplementation>(); 		//an arraylist to store all student records
	HashMap<String, Float> marks = new HashMap<String, Float>();	//A hashmap to store each student's marks

	public StudentImplementation(String firstname1, String lastName1, String username1, String password1, String rollNo1, String status1) {
		super(firstname1, lastName1, username1, password1);		//will call parameterized constructor of super i.e., UserImplementation class
		setRollNo(rollNo1);
		setStatus(status1);
	}

	public void setRollNo(String rollNo1) {
		rollNo = rollNo1;
	}

	public void setStatus(String status1) {
		status = status1;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getStatus() {
		return status;
	}

	// void addCourse(String courseName1, String rollNo1) {

	// 	if (CourseImplementation.getCourseCapacity() <= 0) {
	// 		System.out.println("Course Capcity is Full");
	// 	}

	// 	else {
	// 		int index = students.indexOf(rollNo1);
	// 		students.get(index).	
	// 		CourseImplementation.decreaseCapacity(courseName1);
	// 		courses.add(courseName1);
	// 	}
	// }

	static void addStudent(StudentImplementation student) {		//add student in the students arraylist
		students.add(student);
	}

	static void showStudent(){						//displays the information of all students
		for(int i=0; i<students.size(); i++){
			System.out.println(students.get(i).getFirstName());
			System.out.println(students.get(i).getLastName());
			System.out.println(students.get(i).getUserName());
			System.out.println(students.get(i).getPassword());
			System.out.println(students.get(i).getRollNo());
			System.out.println(students.get(i).getStatus());
			System.out.println("\n");
		}
	}

	// public void addMarks(String courseName1, fload marks1)
	// {

	// }

	public void getProfile() {				//Polymorphism
		System.out.println(super.getFirstName() + "is a " + getStatus());
	}

	static boolean searchStudent(String username1, String password1) {	//search a student based on username and password
		for(int i=0; i<students.size(); i++){
			if(students.get(i).getUserName().equals(username1) && students.get(i).getPassword().equals(password1)) {
				return true;
			}
		}

		return false;
	}

	static void displayStudent(String username1, String password1) { 	//display the data of a single student
		for(int i=0; i<students.size(); i++){
			if(students.get(i).getUserName().equals(username1) && students.get(i).getPassword().equals(password1)) {
				System.out.println(students.get(i).getFirstName());
				System.out.println(students.get(i).getLastName());
				System.out.println(students.get(i).getUserName());
				System.out.println(students.get(i).getPassword());
				System.out.println(students.get(i).getRollNo());
				System.out.println(students.get(i).getStatus());
				System.out.println("\n");
			}
		}
	}
}

interface Professor extends User
{
	// void addMarks();
	// void viewMarks();
	// void addResources();
	// void viewResources();
	// void viewRoster();
	// void addAssignments();
	// void viewAssignments();
}

//ProfessorImplementation is a child class of UserImplementation (Inheritance)
class ProfessorImplementation extends UserImplementation implements Professor {  //class that implements Professor interface
	
	String designation;
	String qualification;
	ArrayList<String> courses = new ArrayList<String>();
	static ArrayList<ProfessorImplementation> professors = new ArrayList<ProfessorImplementation>();

	public ProfessorImplementation(String firstname1, String lastName1, String username1, String password1, String designation1, String qualification1) {
		super(firstname1, lastName1, username1, password1);
		setDesignation(designation1);
		setQualification(qualification1);
	}

	public void setDesignation(String designation1) {
		designation = designation1;
	}

	public void setQualification(String qualification1) {
		qualification = qualification1;
	}

	public String getDesignation() {
		return designation;
	}

	public String getQualification() {
		return qualification;
	}

	static void showProfessors(){			//show the data of all professors
		for(int i=0; i<professors.size(); i++){
			System.out.println(professors.get(i).getFirstName());
			System.out.println(professors.get(i).getLastName());
			System.out.println(professors.get(i).getUserName());
			System.out.println(professors.get(i).getPassword());
			System.out.println(professors.get(i).getDesignation());
			System.out.println(professors.get(i).getQualification());
			System.out.println("\n");
		}
	}

	static void addProfesssor(ProfessorImplementation professor) {		//adds a Professor in the "professors" arraylist
		professors.add(professor);
	}

	public void getProfile() {			//Polymorphism
		System.out.println(getFirstName() + "is a " + getDesignation());
	}

	static boolean searchProfessor(String username1, String password1) {		//search a single professor
		for(int i=0; i<professors.size(); i++){
			if(professors.get(i).getUserName().equals(username1) && professors.get(i).getPassword().equals(password1)) {
				return true;
			}
		}

		return false;
	}

	static void displayProfessor(String username1, String password1) { 		//display data of a single professor
		for(int i=0; i<professors.size(); i++){
			if(professors.get(i).getUserName().equals(username1) && professors.get(i).getPassword().equals(password1)) {
				System.out.println(professors.get(i).getFirstName());
				System.out.println(professors.get(i).getLastName());
				System.out.println(professors.get(i).getUserName());
				System.out.println(professors.get(i).getPassword());
				System.out.println(professors.get(i).getDesignation());
				System.out.println(professors.get(i).getQualification());
				System.out.println("\n");
			}
		}
	}
}

interface Course
{

}

class CourseImplementation implements Course {

	String courseName;
	String offeringSchool;
	String id;
	int capacity;
	static ArrayList<CourseImplementation> courses = new ArrayList<CourseImplementation>();

	public CourseImplementation(String courseName1, String offeringSchool1, String id1, int capacity1) {
		courseName = courseName1;
		offeringSchool = offeringSchool1;
		id = id1;
		capacity = capacity1;
	}

	static void decreaseCapacity(String courseName1) {
		// int index = courses.indexOf(courseName1);
		// courses.set(index, (courses.get(index)-1));

		for (int i=0; i<courses.size(); i++) {
			if(courses.get(i).getCourseName().equals(courseName1)){
				courses.get(i).setCapacity((courses.get(i).getCapacity())-1);
			}
		}
	}

	static int getCourseCapacity(String courseName1) {
		int index = courses.indexOf(courseName1);
		return courses.get(index).getCapacity();	
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCapacity(int capacity1) {
		capacity = capacity1;
	}

	public int getCapacity() {
		return capacity;
	}
}

public class Driver {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String choice = "";
		Boolean flag = true;

		while(flag == true)				//will iterate until quit option is selected
		{
			System.out.println("1. Signup");
			System.out.println("2. Login");
			System.out.println("3. Quit");

		    System.out.print("Enter choice");

	        choice = myObj.nextLine();  // Read user input
	        System.out.println("choice is: " + choice);  

	        if(choice.equals("1")){

	        	System.out.println("1. Signup as Teacher");
				System.out.println("2. Signup as Student");

		        System.out.print("Enter choice: ");

		        choice = myObj.nextLine();  // Read user input
		        System.out.println("Choice is: " + choice);

		        if(choice.equals("2")) {

		        	System.out.print("Enter firstname: ");
		        	String fname = myObj.nextLine();  // Read user input
		        	
		        	System.out.print("Enter lastname: ");
		        	String lname = myObj.nextLine();  // Read user input

		        	System.out.print("Enter username: ");
		        	String uname = myObj.nextLine();  // Read user input

		        	System.out.print("Enter password: ");
		        	String password = myObj.nextLine();  // Read user input

		        	System.out.print("Enter roll number: ");
		        	String rollno = myObj.nextLine();  // Read user input

		        	System.out.println("Select status");
		        	System.out.println("1. Freshman");
		        	System.out.println("2. Sophomore");
		        	System.out.println("3. Junior");
		        	System.out.println("4. Senior");
		        	String status = myObj.nextLine();  // Read user input
		        	
		        	switch(status) {
		        		case "1":
		        			status = "Freshman";
		        			break;

		        		case "2":
		        			status = "Sophomore";
		        			break;

		        		case "3":
		        			status = "Junior";
		        			break;

		        		case "4":
		        			status = "Senior";
		        			break;

		        		default:
		        			System.out.println("Choose the correct option");
		        	}

		        	StudentImplementation student = new StudentImplementation(fname, lname, uname, password, rollno, status);
		        	StudentImplementation.addStudent(student);
		        }

		        else if(choice.equals("1")) {

		        	System.out.print("Enter firstname: ");
		        	String fname = myObj.nextLine();  // Read user input
		        	
		        	System.out.print("Enter lastname: ");
		        	String lname = myObj.nextLine();  // Read user input

		        	System.out.print("Enter username: ");
		        	String uname = myObj.nextLine();  // Read user input

		        	System.out.print("Enter password: ");
		        	String password = myObj.nextLine();  // Read user input

		        	System.out.print("Enter designation: ");
		        	String designation = myObj.nextLine();  // Read user input

		        	System.out.print("Enter qualification: ");
		        	String qualification = myObj.nextLine();  // Read user input
		        	
		        	ProfessorImplementation professor = new ProfessorImplementation(fname, lname, uname, password, designation, qualification);
		        	ProfessorImplementation.addProfesssor(professor);
		        }
	        }

	        else if(choice.equals("2")){
	        	System.out.println("1. Login as Teacher");
				System.out.println("2. Login as Student");

		        System.out.print("Enter choice: ");

		        choice = myObj.nextLine();  // Read user input
		        System.out.println("Choice is: " + choice);

		        if(choice.equals("2")) {

		        	System.out.print("Enter username: ");
		        	String uname = myObj.nextLine();  // Read user input

		        	System.out.print("Enter password: ");
		        	String password = myObj.nextLine();  // Read user input

		        	if(StudentImplementation.searchStudent(uname,password)) {
		        		System.out.println("Logged In");
		        		StudentImplementation.displayStudent(uname,password);
		        	}

		        	else {
		        		System.out.println("Incorrect Credentials");
		        	}
		        }

		        else if(choice.equals("1")) {

		        	System.out.print("Enter username: ");
		        	String uname = myObj.nextLine();  // Read user input

		        	System.out.print("Enter password: ");
		        	String password = myObj.nextLine();  // Read user input

		        	if(ProfessorImplementation.searchProfessor(uname,password)) {
		        		System.out.println("Logged In");
		        		ProfessorImplementation.displayProfessor(uname,password);
		        	}

		        	else {
		        		System.out.println("Incorrect Credentials");
		        	}
		        }
	        }

	        else if(choice.equals("3")){
	        	flag = false;
	        }

		}

	}
}