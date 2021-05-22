public class player {
    int number = 0;
    public void guess()
    {
        this.number = (int) (Math.random() * 10);
        System.out.println("I'm guessing the number: "+number);
    }
}
