




class mymain{
    private int id;
    private String name;
    public mymain(String myname){
      id=43;;
      name="myname";
    }
    public String getname(){return name;}
    public void setName(String n){this.name=n;}
    public void setid(int i){this.id=i;}
    public int getid(){return id;}
}



public class constructores {
    public static void main(String[] args) {
        mymain rb =new mymain("ronakpatel");
        rb.setName("ronakpatel");
        rb.setid(34);

        System.out.println(rb.getid());
        System.out.println(rb.getname());
    }
}
