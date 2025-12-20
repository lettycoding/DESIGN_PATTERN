package PATRON_DE_STRUCTURATION.composite_pattern;

public abstract class Fichier implements Composant {
    protected String nom;
    protected String type;
    
    public Fichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }
    
    @Override
    public String getNom() {
        return nom;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public void decrire() {
        System.out.println("Fichier: " + nom + " (Type: " + type + ")");
    }
    
    @Override
    public void ajouter(Composant composant) {
        throw new UnsupportedOperationException("Impossible d'ajouter à un fichier");
    }
    
    @Override
    public void supprimer(Composant composant) {
        throw new UnsupportedOperationException("Impossible de supprimer d'un fichier");
    }
    
    @Override
    public Composant getElement(int index) {
        throw new UnsupportedOperationException("Un fichier n'a pas d'éléments enfants");
    }
}
