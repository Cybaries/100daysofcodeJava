class simpleDotcomTester {
    double arr = (Math.random() * 10)%4;
    int hitCount = 0;

    public void checking(String s) {
        int x = Integer.parseInt(s);
        if (x == arr || x == arr + 1 || x == arr + 2) {
            if (hitCount < 3) {
                System.out.println("HIT!");
            } else {
                System.out.println("Kill! You have succeeded in sinking ");
                return;
            }
            hitCount++;
        } else {
            System.out.println("Miss!");
        }
    }
    

}