import javax.lang.model.element.Name;

class employ {
    private int id;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }

    public void setid(String string) {
    }

    // public char[] getName() {
    //     return null;
    // }

}

public class modifiers {
    public static void main(String[] args) {
        employ rb = new employ();
        // rb.id=43;
        // rb.name="ronakpatel"; -->throws error bdue to private modifier
        rb.setName("ronakpatel");
        System.out.println(rb.getName());
        rb.setid(143);
        System.out.println(rb.getid());
    }
}
