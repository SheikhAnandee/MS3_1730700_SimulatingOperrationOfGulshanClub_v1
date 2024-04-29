/*   package cls.employee;

import cls.user.User;
import java.io.Serializable;

public class Employee extends User implements Serializable{
    private String joiningDate;
    private int employeeId;

    public String getJoiningDate() {
        return joiningDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee(String joiningDate,int employeeId, String name, String email, String password, String userType, String gender, int age) {
        super(name, email, password, userType, gender, age);
        this.joiningDate = joiningDate;
        
        this.employeeId = employeeId;
    } 
}  */

 package cls.employee;


import cls.user.User;
import java.io.Serializable;

public class Employee extends User implements Serializable{
    private int id;
    private String desig;
    private double salary;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(double salary, String desig, int id, String name, String email, String password, String userType, String gender, int age) {
        super(name, email, password, userType, gender, age);
        this.desig=desig;
        this.id=id;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + "," + ", desig=" + desig + ", salary=" + salary + "}\n";
    }
}
