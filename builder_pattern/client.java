package builder_pattern;

public class client {
    public static void main(String[] args) {
        System.out.println("le type de pizza ");
        buildpizza buildpizzareine =new buildpizzareine();
        buildpizza buildpizzapiquante =new buildpizzapiquante();
        directeur d = new directeur();
        System.out.println("Construction de la pizza piquante");
        d.setmonteur(buildpizzapiquante);
        d.constructpizza();
        d.getpizza();

        System.out.println("Construction de la pizza reine");
        d.setmonteur(buildpizzareine);
        d.constructpizza();
        d.getpizza();
    }

}
