
class employee{
    int id;
    int salary;
    String name;


    public void printDetails(){
        System.out.println("my id is "+id);
        System.out.println("and my name is"+name);
    }
    public int getsalary(){
        return salary;
    }
}

public class oopinjava {
    public static void main(String[] args) {
        System.out.println("this is custom class");


        employee rb=new employee();//new employ obj
        employee john=new employee();
       //setting property 
        rb.id=50;
        rb.salary=335;
        rb.name="ronakpatel";

        john.id=43;
        john.salary=143;
        john.name="john abraham";

        rb.printDetails();
        john.printDetails();
        int salary=john.getsalary();
        System.out.println(salary);
        // System.out.println(rb.id);
        // System.out.println(rb.name);
    }
}
