import java.util.Map;
public class Admin implements User
{
    static int id=0;
    @Override
    public void validate(int eid, String pin,Map<Integer,UserModel> mp)
    {
        if (mp.isEmpty())
        {
            System.out.println("Data is empty");
        }
        UserModel um=mp.get(eid);
        if(um!=null) {
            EmployeeModel emp = um.getEmp();
            if (emp.getPass().equals(pin))
                System.out.println("Enter the system");
            else
                System.out.println("Not validated");
        }
        return;
    }

    void addEmployee(EmployeeModel emp, Map<Integer,UserModel> mp) {
        UserModel um = new UserModel();
        if (mp.size()==0)
        {
            um.setEmp(emp);
            mp.put(id, um);
            System.out.println("Employee added succesfully" + id + emp);
            id++;
            return;
        }
        else {
            mp.forEach((integer, userModel) ->
            {
                if (userModel.getEmp().equals(emp)) {
                    System.out.println("Employee aldready exist");
                    return;
                }
            });
            um.setEmp(emp);
            mp.put(id, um);
            System.out.println("Employee added succesfully" + id + emp);
            id++;
        }
    }

    void delete(int eid, Map<Integer,UserModel> mp)
    {
        if(mp.containsKey(eid))
        {
            mp.remove(eid);
            System.out.println("Deleted sucessfully");
        }
        else
            System.out.println("Employee doesnot exist");
    }

    void changePrivelges(int eid,String priv,Map<Integer,UserModel> mp)
    {
        if(mp.isEmpty()) {
            System.out.println("Not an employee");
            return;
        }
        UserModel um= mp.get(eid);
        EmployeeModel emp=um.getEmp();
        emp.setPrivelges(priv);
        um.setEmp(emp);
        System.out.println("updated an employee");
        return;
    }

}
