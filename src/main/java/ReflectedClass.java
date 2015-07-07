/**
 * Created by hans on 4.06.15.
 */
public class ReflectedClass {

    public String pubField;
    private int privField;
    public String testFiield;

    public String pubMethod() {
        return "pubMethod()";
    }

    public int getPrivField() {
        return privField;
    }

    public void setPrivField(int privField) {
        this.privField = privField;
    }


    //Comment method or methods in or out
    //Uncommenting a() seemed to work for example...
    public void _a() {
        System.out.println("_a()");
    }

    public void a() {
        System.out.println("a()");
    }

/*    public void b() {
        System.out.println("b()");
    }*/

    public void c() {
        System.out.println("c()");
    }

/*    public void d() {
        System.out.println("d()");
    }*/
}
