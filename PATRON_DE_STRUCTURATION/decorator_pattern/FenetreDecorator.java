package PATRON_DE_STRUCTURATION.decorator_pattern;

public class FenetreDecorator implements Fenetre {
    private Fenetre fenetre;
    public FenetreDecorator(Fenetre fenetre) {
        this.fenetre = fenetre;
    }

    public void desinner() {
        fenetre.desinner();
}

    public void decrire() {
        fenetre.decrire();
    }
}