package map103lab3;
import java.util.Scanner;
public class MAP103Lab3 {
public static void main(String[] args) 
{Employee emArr[] = new Employee[3];
emArr[0] = new Employee(1,"ROBERT", "DOWNEY", "01/01/1965", 54);
emArr[1] = new Employee(32,"JENIT", "DARULA", "02/02/1986", 33);
emArr[2] = new Employee(24,"WILL", "SMITH", "03/03/1983", 36);
emArr[1].setEmployeeNumber(777);
emArr[1].setFirstName("JENIT");
emArr[1].setLastName("DARULA");
Scanner sc  = new Scanner(System.in);
int n = sc.nextInt();
while(n!=0){
if(n<=emArr.length)
{System.out.println("Employee No:" + emArr[n-1].getEmployeeNumber());
System.out.println("Employee Firts Name:" + emArr[n-1].getFirstName());
System.out.println("Employee Last Name:" + emArr[n-1].getLastName());
System.out.println("Employee Birth Date :" + emArr[n-1].getBirthDate());
System.out.println("Press Type 0 to Exit");}
else{System.out.println("Employee Position is Wrong");
System.out.println("Press Type 0 to Exit");}
n = sc.nextInt();}}}
