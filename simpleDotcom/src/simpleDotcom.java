import java.io.*;

public class simpleDotcom {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter the index of the grid to be hit: ");
        String s = br.readLine();
        simpleDotcomTester dot = new simpleDotcomTester();
        dot.checking(s);
    }
}
