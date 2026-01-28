package abstract_factory_pattern;

public class productfactoryluxe implements productfactory {
    @Override
    public smartphone creesmartphone() {
        System.out.println("type de smartphone");
        return new smartphoneluxe();
    }

    @Override
    public tablette creetablette(){
        System.out.println("produit tablette de luxe");
        return new tabletteluxe();
    }

}