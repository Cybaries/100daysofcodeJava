import java.util.*;
public class Arraylist {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(8);
        arr.add(10);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        newJava hi = new newJava();
        ArrayList<newJava> objarr = new ArrayList<newJava>();
        objarr.add(hi);
        System.out.println(objarr);
        objarr.remove(hi);
        System.out.println(objarr);
    }
}
