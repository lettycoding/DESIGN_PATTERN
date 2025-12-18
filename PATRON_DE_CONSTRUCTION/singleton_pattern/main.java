package singleton_pattern;

public class main {
    public static void main(String[] args) {

        singleton.resetinstance();
        
        System.out.println("le constructeur sans parametre");
        singleton s1 = singleton.getinstance();
        System.out.println("constructeur par defaut s1:" +s1);

        System.out.println("le constructeur avec parametre, qui vas retourner linstance existant car elle esr deja cree");

        singleton s2 = singleton.getinstance(2,3);
        System.out.println("constructeur avec parametre s2:" +s2);

        System.out.println("constructeur avec x,y et nom , ici on vas reinitialiser linstance pour voir si la creation dune nouvelle instance est effective");
        singleton.resetinstance();
        singleton s3 = singleton.getinstance(5,6,"mickey");
        System.out.println("constructeur avec x,y et nom s3:" +s3);
    }

}
