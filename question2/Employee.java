import java.util.ArrayList;
import java.util.List;
//64050030 นาย กิติภูมิ หน่อเนื้อ
public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> subordinate;
    
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinate = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String dept) {
        this.position = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }
    
    //added methods

    public void addSubordinate(Employee employee){
        subordinate.add(employee);
    }

    public void removeSubordinate(Employee employee){
        subordinate.remove(employee);
    }

    public List<Employee> getSubordinate(){
        return subordinate;
    }

    public void printSubordinate(){
        //System.out.println(this.toString());
        if(this.position.equals("CEO")){
            System.out.println(this.toString());
        }else if(this.position.equals("Head Sales") || this.position.equals("Head Marketing")){
            System.out.println("\t"+this.toString());
        }else{
            System.out.println("\t\t"+this.toString());
        }
        for(Employee employee : subordinate){
            employee.printSubordinate();
        }
    }
}