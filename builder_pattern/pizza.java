package builder_pattern;

public class pizza {
    public String pate = "";
    public String sauce   = "";
    public String garniture = "";

    public void setPate(String pate) {
        this.pate=pate ;
    }

    public void setSauce(String sauce){
        this.sauce=sauce;
    }

    public void setGarniture(String garniture){
        this.garniture=garniture;
    }
    

public void printpizza(){

    System.out.println(this.toString());
    System.out.println("pate :" + pate + "\nsauce : " + sauce + "\ngarniture : " + garniture);
}
}
