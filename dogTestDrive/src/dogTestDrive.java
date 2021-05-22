package dogTestDrive.src;
class dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.print("ruff! ruff!\n");
    }
}

class dogTestDrive {
        public static void main(String[] args) {
            dog d = new dog();
            d.size = 40;
            d.bark();
    }
}