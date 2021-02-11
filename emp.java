import java.util.Scanner;
 
public class Employee {
 String name;
 int year;
 String address;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the year :: ");
  year = in.nextInt();
  System.out.print("Enter the address :: ");
  address = in.next();
 }
 
 public void display() {
  
  System.out.println("Name " + "Year of joining" + "Address");
  System.out.println( name + year + address);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[3];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("Employee details");
  
  for(int i=0; i<3; i++) {
   
   e[i].display();
  }
 }
}
