import java.lang.ProcessBuilder.Redirect.Type;

import javax.lang.model.element.TypeElement;

public class Day6 {
    public static void main(String[] args) throws Exception {
        int arr[] = { 3, 1, 2, 3, 4, 6 };
        for (var h : arr) {
            System.out.println(h);
        }

        String hell[] = { "1", "3", "390" };

        for (var e : hell) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
