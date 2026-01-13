package diapo_point_24;

public class TestPoint
{
    public static void main(String [] args)
    {
        Point P1 =new Point(3, 1);
        Point P2 = new Point();
        Point P3 = new Point(P1);
        System.out.println("p2: "+P2.x+","+P2.x);
        P3.afficher();
        System.out.println(P1.distance(P2));
        P3.deplacer(-3, -2);
        P3.afficher();
    }
}