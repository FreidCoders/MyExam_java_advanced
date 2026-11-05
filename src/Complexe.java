public class Complexe extends ObjetMathematique implements ComparableModule {
    private double reel;
    private double imaginaire;

    public double getReel() {
        return reel;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    @Override
    public double module() {
        double res = (this.reel * this.reel) + (this.imaginaire * this.imaginaire);
        return Math.sqrt(res);
    }

    public void afficher()
    {
        if(this.imaginaire < 0){
            System.out.println(this.reel + "-" + "i"+ this.imaginaire);
        }else {
            System.out.println(this.reel + "+" + "i" + this.imaginaire);
        }
    }

    @Override
    public boolean aUnModuleuperieurA(ObjetMathematique autre) {
        if(module() > autre.module()){
            return true;
        }else {
            return false;
        }

    }
}
