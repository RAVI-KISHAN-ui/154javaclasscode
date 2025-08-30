public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;

    // Parameterized constructor
    EmployeeCopyConstructor(int i, String name) {
        Emp_id = i;
        Emp_name = name;
    }

    // Copy constructor
    EmployeeCopyConstructor(EmployeeCopyConstructor obj) {
        Emp_id = obj.Emp_id;
        Emp_name = obj.Emp_name;
    }

    void printInfo() {
        System.out.println("Details of Employee are: " + Emp_id + " " + Emp_name);
    }

    public static void main(String[] args) {
        // Create original object
        EmployeeCopyConstructor ecc = new EmployeeCopyConstructor(101, "rahul");
        ecc.printInfo();

        
        EmployeeCopyConstructor copy1 = ecc;
            copy1.Emp_id = 2;
        copy1.Emp_name = "Saurabh";

        copy1.printInfo();
        ecc.printInfo(); 

        
        EmployeeCopyConstructor copy2 = new EmployeeCopyConstructor(ecc);
                copy2.printInfo();

        copy2.Emp_id = 200;
        copy2.Emp_name = "Ravi";

        
        copy2.printInfo();
        ecc.printInfo(); 
    }
}

