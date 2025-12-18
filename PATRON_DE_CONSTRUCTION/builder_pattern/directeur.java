package builder_pattern;

public class directeur {
    
 private buildpizza monteur ;

  public void  DirecteurPizza(buildpizza monteur) {
        this.monteur = monteur;
    }
    public void setmonteur(buildpizza monteur) {
        this.monteur = monteur;
    }

    public void constructpizza(){
        monteur.creenouvelpizza();
        monteur.buildpate();
        monteur.buildsauce();
        monteur.buildgarniture();
    }

    public pizza  getpizza(){
       return  monteur.getPizza();

    }

}
