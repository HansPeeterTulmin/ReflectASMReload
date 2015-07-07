import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;

import java.util.Arrays;

/**
 * Created by hans on 4.06.15.
 */


public class Main {

    public static void main(String[] args) throws InterruptedException {
        ReflectedClass ref = new ReflectedClass();
        ref.pubField = "1337";

        FieldAccess fa = FieldAccess.get(ReflectedClass.class);
        MethodAccess ma = MethodAccess.get(ReflectedClass.class);
        //String [] ar = new String[1];
        //ar[0]  = fa.get(ref, "pubField").toString();
        System.out.println(fa.get(ref, "pubField"));


        //MethodAccess ma = MethodAccess.get(ReflectedClass.class);
        //String [] ar = ma.getMethodNames();
        int count = 0;
        while (true) {
            System.out.println(count);
            doWork(ref, ma);
            count++;
        }



        //System.out.println(fa.get(ref, "pubField"));
    }

    private static void doWork(ReflectedClass ref, MethodAccess cma) throws InterruptedException {
        Thread.sleep(5000);
        MethodAccess ma = MethodAccess.get(ReflectedClass.class);
        System.out.println(Arrays.toString(ma.getMethodNames()));
        try {
            System.out.print("Cached MA: ");
            cma.invoke(ref, "c", new Object[]{});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.print("New MA: ");
            ma.invoke(ref, "c", new Object[]{});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
