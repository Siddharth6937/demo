package learning.management.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/get-employees")
    public String getEmployee(){
        return employeeService.empName();
    }

    @GetMapping(value = "/get-salary")
    public String getSalary(){
        return employeeService.empSalary();
    }


}
