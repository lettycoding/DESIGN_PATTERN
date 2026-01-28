package PATRON_DE_STRUCTURATION.adapter_pattern.example_sur_les_carre;

public class Client {
    public static void main(String[] args) {
        Carre carre = new AdaptRectangle(4);
        float area = carre.area(4);
        System.out.println("Area: " + area);
        float perimeter = carre.perimeter(4);
        System.out.println("Perimeter: " + perimeter);
    }

}
