package diapo_division_34;

public class TestDivision
{
    public static void main(String [] args)
    {
        Division operation1 = new Division(10, 5);
        System.out.print(operation1.diveIns());
        Division operation2 = new Division(40, 10);
        System.out.println( operation2.diveIns());
        
        operation2.nume = 59;
        System.out.print(" Apres modification :"+ operation2.diveIns());

        System.out.print("\n Resultat statique :"+Division.diveSta(15.0, 6));
    }
}