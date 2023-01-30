package day3;

public class EmployeeDetails {
public void printEmployeeName(String empName,int empId) {
	System.out.println("EMPLOYEE NAME = "+empName);
	System.out.println("EMPLOYEE ID = "+empId);
}
public void getEmployeeAddress(String empAddress) {
	System.out.println("EMPLOYEE ADDRESS = "+empAddress);
}
public void printEmployeeSalary(double empSalary) {
	System.out.println("EMPLOYEE SALARY = "+empSalary);
}
public void printEmployeeMobileNumber(long mobNum) {
	System.out.println("EMPLOYEE PHONE NUMBER = "+mobNum);
}
public static void main(String[] args) {
	EmployeeDetails information  =new EmployeeDetails();
	information.printEmployeeName("Divya", 1675);
	information.getEmployeeAddress("Chennai");
	information.printEmployeeSalary(80000);
	information.printEmployeeMobileNumber(99404573585L);
}
}
