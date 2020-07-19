import java.util.Map;

public class Employee implements User
{
    @Override
    public void validate(int id, String pin,Map<Integer,UserModel> mp)
    {
        UserModel um=mp.get(id);
        EmployeeModel emp=um.getEmp();
        if(emp.getPass().equals(pin))
            System.out.println("Enter the system");
        else
            System.out.println("Not validated");
        return;
    }
    public void editDetails(int eid, Map<Integer,UserModel> mp,Map<String, Object> val)
    {
        UserModel um=mp.get(eid);
        EmployeeModel emp=um.getEmp();
        String pin= (String) val.get("PIN");
        emp.setPass(pin);
        String pass= (String) val.get("PRIV");
        emp.setPass(pass);
        um.setEmp(emp);
    }
}
