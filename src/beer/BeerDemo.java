package beer;

public class BeerDemo {
    public static void main(String[] args) {
        Beer tyskie = new Beer("Tyskie","Lager",5.2,500);
        Beer EB = new Beer("EB", "Lager", 5.2,500);
        Beer tyskieAgain = new Beer("Tyskie","Lager",5.2,500);
        Beer tyskieOnceMore =new Beer("Tyskie","Lager",5.2,500);

        System.out.println(tyskie.equals(EB));
        System.out.println("Reflexivity: ");
        System.out.println(EB.equals(EB));
        System.out.println("Symmetry: ");
        System.out.println(tyskie.equals(tyskieAgain));
        System.out.println(tyskieAgain.equals(tyskie));
        System.out.println("Transitivity: ");
        System.out.println(tyskieAgain.equals(tyskieOnceMore));
        System.out.println(tyskie.equals(tyskieOnceMore));
        System.out.println("Consistency: ");
        for (int i = 0; i <10 ; i++) {
            System.out.println(tyskie.equals(EB));
        }
        System.out.println("Equals null: ");
        System.out.println(tyskie.equals(null));
        System.out.println("HashCodes:");
        System.out.println(tyskie.hashCode());
        System.out.println(EB.hashCode());
        System.out.println(tyskieAgain.hashCode());
    }

}
