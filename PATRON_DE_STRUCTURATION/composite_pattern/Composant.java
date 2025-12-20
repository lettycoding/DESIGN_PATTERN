package PATRON_DE_STRUCTURATION.composite_pattern;

public interface Composant {
    String getNom();
    String getType();
    void decrire();
    void ajouter(Composant composant);
    void supprimer(Composant composant);
    Composant getElement(int index);
}