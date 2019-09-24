package map103lab3;
public class Employee extends Person{
private long employeeNumber;
public Employee(long employeeNumber, String firstName, String lastName, String birthDate, int age) {
this.employeeNumber = employeeNumber;
super.setFirstName(firstName); 
super.setLastName(lastName);
super.setBirthDate(birthDate);
super.setAge(age);
}
public long getEmployeeNumber() {
return employeeNumber;
}
public void setEmployeeNumber(long employeeNumber) {
this.employeeNumber = employeeNumber;
}  
}
