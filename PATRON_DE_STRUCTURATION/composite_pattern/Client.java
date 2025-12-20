package PATRON_DE_STRUCTURATION.composite_pattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== SYSTÈME DE GESTION DE FICHIERS ===\n");
        
        // Création de fichiers (feuilles)
        Composant fichier1 = new FichierTXT("rapport");
        Composant fichier2 = new FichierPDF("presentation");
        Composant fichier3 = new FichierTXT("notes");
        Composant fichier4 = new FichierPDF("contrat");
        
        // Création de dossiers (composites)
        Composant dossier1 = new Dossier("Documents");
        Composant dossier2 = new Dossier("Projets");
        Composant dossier3 = new Dossier("Administratif");
        
        // Test 1: Description de fichiers
        System.out.println("1. DESCRIPTION DES FICHIERS:");
        fichier1.decrire();
        fichier2.decrire();
        System.out.println();
        
        // Test 2: Ajout d'éléments aux dossiers
        System.out.println("2. AJOUT D'ÉLÉMENTS AUX DOSSIERS:");
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);
        dossier1.ajouter(dossier2);
        
        dossier2.ajouter(fichier3);
        dossier3.ajouter(fichier4);
        System.out.println();
        
        // Test 3: Description des dossiers (récursif)
        System.out.println("3. DESCRIPTION DES DOSSIERS:");
        dossier1.decrire();
        System.out.println();
        dossier3.decrire();
        System.out.println();
        
        // Test 4: Obtention d'un élément spécifique
        System.out.println("4. OBTENTION D'UN ÉLÉMENT:");
        Composant element = dossier1.getElement(1);
        if (element != null) {
            System.out.print("Élément à l'index 1: ");
            element.decrire();
        }
        System.out.println();
        
        // Test 5: Suppression d'un élément
        System.out.println("5. SUPPRESSION D'UN ÉLÉMENT:");
        dossier1.supprimer(fichier2);
        System.out.println();
        
        // Test 6: Description finale
        System.out.println("6. DESCRIPTION FINALE:");
        dossier1.decrire();
        
        System.out.println("\n=== FIN DU SYSTÈME ===");
    }
}
