package PATRON_DE_STRUCTURATION.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements Composant {
    private String nom;
    private List<Composant> enfants;
    
    public Dossier(String nom) {
        this.nom = nom;
        this.enfants = new ArrayList<>();
    }
    
    @Override
    public String getNom() {
        return nom;
    }
    
    @Override
    public String getType() {
        return "dossier";
    }
    
    @Override
    public void decrire() {
        System.out.println("Dossier: " + nom + " (Type: " + getType() + ")");
        System.out.println("Contenu (" + enfants.size() + " éléments):");
        
        for (int i = 0; i < enfants.size(); i++) {
            System.out.print("  " + (i+1) + ". ");
            enfants.get(i).decrire();
        }
    }
    
    @Override
    public void ajouter(Composant composant) {
        enfants.add(composant);
        System.out.println("Élément '" + composant.getNom() + "' ajouté au dossier '" + nom + "'");
    }
    
    @Override
    public void supprimer(Composant composant) {
        if (enfants.remove(composant)) {
            System.out.println("Élément '" + composant.getNom() + "' supprimé du dossier '" + nom + "'");
        } else {
            System.out.println("Élément non trouvé dans le dossier '" + nom + "'");
        }
    }
    
    @Override
    public Composant getElement(int index) {
        if (index >= 0 && index < enfants.size()) {
            return enfants.get(index);
        }
        System.out.println("Index " + index + " invalide. Le dossier a " + enfants.size() + " éléments.");
        return null;
    }
    
    public int getNombreElements() {
        return enfants.size();
    }
}
