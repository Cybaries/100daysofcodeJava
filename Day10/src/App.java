public class App extends Intermediate{
    public static void main(String[] args) throws Exception {
        
        New n = new Sub();
        Intermediate I = new Sub();
        Sub s = new Sub();
        n.method();
        I.method();
        s.method();

        I.run();
    }
}
