package PATRON_DE_STRUCTURATION.decorator_pattern;

public class VerticalScroll extends FenetreDecorator {

    public VerticalScroll(Fenetre fenetre) {
        super(fenetre);
    }

    public void desinner() {
        super.desinner();
        System.out.println("Décoration verticale ajoutée.");
    }

    public void decrire() {
        super.decrire();
        System.out.println("Décoration verticale décrite.");
    }
}