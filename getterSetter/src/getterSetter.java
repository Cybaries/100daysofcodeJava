public class getterSetter {
    public static void main(String[] args) throws Exception {
        ant[] A = new ant[3];
        A[0] = new ant();
        A[0].setValues(2, "sugar", "red", "worker");
        A[2] = new ant();
        A[2].setValues(5, "cream", "black", "soldier");

        System.out.println(A[0].getSize()+" "+A[0].getFood()+" "+A[0].getRole()+" "+A[0].getColor());
        System.out.println(A[2].getSize()+" "+A[2].getFood()+" "+A[2].getRole()+" "+A[2].getColor());
    }
}
