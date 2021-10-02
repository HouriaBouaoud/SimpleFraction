public class Main {

    public static void main(String[] args) {
        System.out.println("helllllo");
        Fraction f = new Fraction();
        f.setD(-2);
        f.setN(-6);
        Fraction f2 = new Fraction(3, 5);
        System.out.println("la fraction F1 = "+f.toString());
        System.out.println("la fraction F2 = "+f2.toString());
    }
}