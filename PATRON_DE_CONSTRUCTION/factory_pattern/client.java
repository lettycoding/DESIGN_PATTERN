public class client {

    public static void main(String[] args) {
        productfactory productfactory1 = new productfactory1();
        productfactory productfactory2 = new productfactory2();
        productfactory productfactory3 = new productfactory3();

        productA productA = null;

        System.out.println("utilisation de la premiere fabique");
        productA = productfactory1.getproductA();
        System.out.println(productA);

        System.out.println("utilisation de la deuxieme fabique");
        productA = productfactory2.getproductA();
        System.out.println(productA);

        System.out.println("utilisation de la troisieme fabique");
        productA = productfactory3.getproductA();
        System.out.println(productA);
    }
}
