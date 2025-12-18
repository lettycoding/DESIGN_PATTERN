package builder_pattern;

public abstract class buildpizza {

    protected pizza pizza;
    public pizza getPizza(){
        return pizza ;
    }
    public void creenouvelpizza(){
        pizza= new pizza();
    }
    public abstract void buildpate();
    public abstract void buildsauce();
    public abstract void buildgarniture();
}
