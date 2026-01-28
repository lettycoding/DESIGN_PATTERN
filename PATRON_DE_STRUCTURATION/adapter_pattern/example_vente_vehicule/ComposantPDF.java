package PATRON_DE_STRUCTURATION.adapter_pattern.example_vente_vehicule;

public class ComposantPDF {
    public void pdfFixeContenu(String contenu){
        System.out.println("contenu PDF : "+ contenu);
    }
    public void pdfEnvoieImprimante(){
        System.out.println("imprime PDF");
    }
}
