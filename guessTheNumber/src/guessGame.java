public class guessGame {
    player p1;
    player p2;
    player p3;

    public void startGame() {
        p1= new player();
        p2= new player();
        p3 = new player();
        
        int guessNum1 = 0;
        int guessNum2 = 0;
        int guessNum3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int target = (int) (Math.random() * 10);
        System.out.println("I'm guessing a number between 0 & 9...");
        
        while (true) {
            System.out.println("The number to guess is: " + target);
            p1.guess();
            p2.guess();
            p3.guess();

            guessNum1 = p1.number;
            guessNum2 = p2.number;
            guessNum3 = p3.number;
            
            if (guessNum1 == target) {
                p1isRight = true;
            }
            if (guessNum2 == target) {
                p2isRight = true;
            }
            if (guessNum3 == target) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We got a winner!");
                System.out.println("Player 1 got is right?" + p1isRight);
                System.out.println("Player 2 is right?" + p2isRight);
                System.out.println("Player 3 is right?" + p3isRight);
                break;
            }
            else {
                System.out.println("None got it right. Will have to play again ;-;");
            }
        }

    }

}
