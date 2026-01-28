package abstract_factory_pattern;

public class productfactorysimple implements productfactory {
    @Override
    public smartphone creesmartphone(){
        System.out.println("smart phone simple");
        return new smartphonesimple();
    }
    @Override
     public tablette creetablette(){
        System.out.println("tablette simple");
        return new tablettesimple();

     } 

}
