//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        Complexe z1 = new Complexe(3,4);
        Complexe z2 = new Complexe(1,2);
        ImaginairePur z3 = new ImaginairePur(0,5);


        z1.afficher();
        z2.afficher();
        z3.afficher();

        System.out.println("Module de z1 :" +z1.module());
        System.out.println("Module de z3 : "+z3.module());

        System.out.println("Verifie si Z1 est nul : " + z1.EstNul());

        System.out.println("Compare z1 et z2 : "+ z1.aUnModuleuperieurA(z2));

        System.out.println("Ecart de Module entre z1 et z3 : "+z1.ecartDeModule(z3));

    }




}