public abstract class ObjetMathematique {
    public abstract double module();
    public boolean EstNul(){
        if(this.module() == 0.0){
            return true;
        }else {
            return false;
        }
    }
    public double ecartDeModule(ObjetMathematique autre){
        return Math.abs(this.module()-autre.module());
    }
}
