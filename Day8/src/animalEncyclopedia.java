public class animalEncyclopedia {
    public static void main(String[] args) throws Exception {
        giraffe g = new giraffe();
        Lion l = new Lion();
        panther p = new panther();
        System.out.println(l.name +" "+ l.getSound());
        System.out.println(g.name +" "+ g.getSound());
        System.out.println(p.name +" "+ p.getSound());
    }
}
