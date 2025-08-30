public class methodCode{
    int id;
    String name;

     methodCode() {
        id=111;
        name="preeti";

    }
    public void displayMethod(){
        System.out.println("Hello from display method");
        System.out.println("details are " +id +" " +name);
    }
    public static void main(String[] args) {
      methodCode m1= new methodCode();
      m1.id=101;
      m1.name="preeti";
      m1.displayMethod();  
    }
}