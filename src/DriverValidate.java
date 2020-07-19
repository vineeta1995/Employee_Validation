import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class DriverValidate
{
    static Map<Integer, UserModel> users;
    public static void main(String args[]) {
        users =new HashMap<Integer, UserModel>();
        Admin ad = new Admin();
        Map<String, Object> mp = new HashMap<String, Object>();
        EmployeeModel emp = new EmployeeModel();
        emp.setEmpName("a");
        emp.setPass("123");
        emp.setPrivelges("Admin");
        ad.addEmployee(emp,users);
        EmployeeModel emp1 = new EmployeeModel();
        emp1.setEmpName("aa");
        emp1.setPass("1234");
        emp1.setPrivelges("Employee1");
        ad.addEmployee(emp1,users);
        EmployeeModel emp2 = new EmployeeModel();
        emp2.setEmpName("abc");
        emp2.setPass("456");
        emp2.setPrivelges("Employee2");
        ad.addEmployee(emp2,users);
        ad.validate(1,"1234",users);
        ad.validate(2,"1234",users);
        ad.validate(3,"1234",users);
        ad.changePrivelges(1,"director",users);
    }

}

