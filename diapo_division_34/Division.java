package diapo_division_34;

public class Division
{
    double nume, deno;

    public Division(double a, double b)
    {
        this.nume=a;
        this.deno=b;
    }
    public String diveIns()
    {
        if(this.deno == 0)
        {
            return "Erreur";
        }
        double resultat = this.nume / this.deno;
        return "\n Resultat instnace :" + resultat ;
    }
    public static String diveSta(double nume, double deno)
    {
        if(deno == 0)
        {
            return "Erreur";
        }
        double resultat = nume / deno;
        return  " "+resultat;
    }
}