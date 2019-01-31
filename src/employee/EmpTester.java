/* Name: Samuel Sousa
 * Assignment: 
 * Program: Software Development & Network Engineering
 * Date: 
 * Description: 
 */
package employee;

public class EmpTester {
    public static void main(String[] args){
        
    Employee e1 = new Employee("bob",10000);
    Employee e2 = new Employee("jim",20000);
    Employee e3 = new Employee("sally",30000);
    
    Employee[] empList = new Employee[3];
    
        for(Employee e: empList){
        System.out.println(e.getName());
        
        }
    
    }
}
