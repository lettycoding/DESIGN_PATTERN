package factory_pattern;

public abstract class productfactory {
    protected abstract productA createProductA();
    
    public productA getproductA() {
        return createProductA();
    }
}