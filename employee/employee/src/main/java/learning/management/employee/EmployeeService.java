package learning.management.employee;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String empName(){
        String name = "Abhishek";
        int age = 30;
        return name +" is "+age+" years old.";
    }

    public String empSalary(){
        return "Berozgar no salary";
    }

}
