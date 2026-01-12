package diapo_point_22;
public class points{
    double x,y;
    points(double a, double b){
        int n;
        x = a;
        y = b;
    }
    points(){
        x = 0;
        y = 0;
    }
    void deplacer(double dx, double dy){
        x = x+dx;
        y = y+dy;
    }
    void afficher(){
        System.out.println("position actuelle ("+ x +","+ y + ")");
    }
}