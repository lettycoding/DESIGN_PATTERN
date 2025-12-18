package builder_pattern;

public class buildpizzapiquante extends buildpizza {

      public void buildpate(){
        pizza.setPate("feuilletee");
    }
    public void buildsauce(){
        pizza.setSauce("piquant");

    }
    public void buildgarniture(){
        pizza.setGarniture("pepperoni+salami");
    }

}
