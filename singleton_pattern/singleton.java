package singleton_pattern;

public class singleton {
    private static singleton instance;

    private int x;
    private int y;
    private String nom;

    private singleton() {
        this.x=0;
        this.y=0;
        this.nom="default";
        System.out.println("singleton created");

    }

    private singleton(int x,int y) {

        this.x=x;
        this.y=y;
        this.nom="donald";
    
    }

    private singleton(int x,int y,String nom) {
        this.x=x;
        this.y=y;
        this.nom=nom;
    }

    public static singleton getinstance(){
        if (instance == null){
            instance = new singleton();

        }
         return instance;
    }

    public static singleton getinstance(int x,int y){

        if ( instance == null) {
            instance = new singleton(x,y);
        }
        return instance;

  }

  public static singleton getinstance(int x, int y,String nom){
    if (instance == null ){
        instance = new singleton(x,y,nom);
    }
    return instance;
  }

  public static void resetinstance(){
    instance = null;
  }
}

