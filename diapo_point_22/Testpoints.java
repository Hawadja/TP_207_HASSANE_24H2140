package diapo_point_22;

public class Testpoints{
    public static void main(String [] rags){
        points p = new points(10, 15);
        System.out.println("Avant deplacement :");
        p.afficher();

        p.deplacer(05, 20);

        System.out.println("Apres le deplacement :");
        p.afficher();
    }
}