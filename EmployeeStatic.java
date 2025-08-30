public class EmployeeStatic{
    int Emp_ID;
    static String Org="Kiet" ;

    void details(){
        System.out.println("ID: " +Emp_ID +" Organisation is: " +Org);

    }

    static void StaticMethod(){
        System.out.println("Name: " +Org);
    }
    
    public static void main(String[] args) {
        // EmployeeStatic.Org="Kiet";

        EmployeeStatic e1= new EmployeeStatic();
        e1.Emp_ID=101;

        e1.details();

        EmployeeStatic e2=new EmployeeStatic();
        e2.Emp_ID=102;

        e2.details();
        
    }
}