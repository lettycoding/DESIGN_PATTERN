package PATRON_DE_STRUCTURATION.adapter_pattern.example_vente_vehicule;

public class DocumentHtml implements Document {
    private String contenu;
    public DocumentHtml(String contenu){
        this.contenu = contenu;
    }

public String setContenu(String contenu){
        System.out.println("contenu HTML : "+ contenu);
        return "contenu HTML : "+ contenu;
    }

    public String dessine(){
        return "dessine HTML";
    }

    public String imprime(String contenu){
        return "imprime HTML";
    }
}
