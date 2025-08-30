class EmployeePoly{
    String Emp_name;
     void details(){
        System.out.println("Name: "+Emp_name);
     }


void details(int salary, String company){
    System.out.println("Salary: "+salary);

}
void details(String company, int salary){
    System.out.println("Institute name: "+company);

}
}
class Faculty extends EmployeePoly{
    void details(){
        super.details();
        System.out.println("Welcome Faculties.");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        /*EmployeePoly ep= new EmployeePoly();
        ep.Emp_name="Arun";
        ep.details();
        ep.details(100000);
        ep.details("KIET");
        */
       Faculty f= new Faculty();
       f.Emp_name="Arun";
       f.details();
        
            }

}

