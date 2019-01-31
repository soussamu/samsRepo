/* Name: Samuel Sousa
 * Assignment: 
 * Program: Software Development & Network Engineering
 * Date: 
 * Description: 
 */
package employee;

public class Employee {
    private String name;
    private double salary = 0;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
}
