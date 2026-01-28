package PATRON_DE_STRUCTURATION.adapter_pattern.example_sur_les_carre;

public class Rectangle {
    private float height;
    private float width;
    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }
    public float perimeter(){
        return 2 * (height + width);
    }
    public float area(){
        return height * width;
    }

}
