package PATRON_DE_STRUCTURATION.adapter_pattern.example_sur_les_carre;

public class AdaptRectangle implements Carre {
    private Rectangle rectangle;

    public AdaptRectangle(float side) {
        this.rectangle = new Rectangle(side, side);
    }

    public float perimeter(float side) {
        return rectangle.perimeter();
    }

    public float area(float side) {
        return rectangle.area();
    }

}
