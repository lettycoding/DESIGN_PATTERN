package abstract_factory_pattern;

public class productmanager {
    private smartphone smartphone;
    private tablette tablette;
    public productmanager(productfactory factory){
         this.smartphone = factory.creesmartphone();
         this.tablette = factory.creetablette();

    }

    public void afficherProduits() {
        smartphone.getcharacteristics();
        tablette.getcharacteristics();
    }


    public static void main(String[] args) {
        productfactory factory = new productfactorysimple();
        productmanager manager = new productmanager(factory);
        manager.afficherProduits();
    }

    }

