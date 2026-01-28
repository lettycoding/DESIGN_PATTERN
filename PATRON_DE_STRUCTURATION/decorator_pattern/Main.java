package PATRON_DE_STRUCTURATION.decorator_pattern;

public class Main {
    public static void main(String[] args) {
        // 1. Une fenêtre simple
        Fenetre maFenetre = new Fenetresimple();
        
        // 2. On ajoute le scroll vertical
        maFenetre = new VerticalScroll(maFenetre);
        
        // 3. On ajoute aussi le scroll horizontal par-dessus
        maFenetre = new HorizontalScroll(maFenetre);

        System.out.println("Description : " );
        maFenetre.decrire();
        maFenetre.desinner();
    }
}
