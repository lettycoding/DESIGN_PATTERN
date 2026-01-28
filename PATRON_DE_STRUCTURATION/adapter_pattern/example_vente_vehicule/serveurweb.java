package PATRON_DE_STRUCTURATION.adapter_pattern.example_vente_vehicule;

public class serveurweb {

    public static void main(String[] args) {
        String factureDonnees = "Facture #1234 - Véhicule : Tesla Model 3 - 45000€";

        // 1. Utilisation du document HTML classique
        Document docHtml = new DocumentHtml(factureDonnees);
        System.out.println("--- Impression Web ---");
        docHtml.imprime(factureDonnees);

        System.out.println();

        // 2. Utilisation du PDF via l'Adapter
        // Le serveur croit manipuler un "Document" standard
        Document docPdf = new Documentpdf();
        System.out.println("--- Impression PDF (via composant externe) ---");
        docPdf.imprime(factureDonnees);
    }

}
