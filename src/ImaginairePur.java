public class ImaginairePur extends Complexe{
    public ImaginairePur(double reel, double imaginaire) {
        super(reel=0, imaginaire);
    }

    @Override
    public void afficher() {
        System.out.println("Forme bi : " + "i" + getImaginaire());
    }

    public double conjugue(){
        return - getImaginaire();
    }
}
