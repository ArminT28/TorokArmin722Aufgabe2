package views;

import java.util.Scanner;

public class MainView {
    public void startup()
    {
        System.out.println("what would you like to do?");
        System.out.println("1.) Add Zutat\n" +
                "2.)Delete Zutat\n" +
                "3.)Update Zutat\n" +
                "4.)Add Speise\n" +
                "5.)Delete Speise\n" +
                "6.)Update Speise\n" +
                "7.)Filter nach Menge\n" +
                "8.)Finde Speise die einen Zutat haben" +
                "9.)Sehe gesamtbetrag der Zutaten in alle Spiesen");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                String zutatName = sc.next();
                int zutatPreis = sc.nextInt();
                int zutatMenge = sc.nextInt();
            }
            case 2:
            {

            }
            case 3:
            {

            }
            case 4:
            {

            }
            case 5:
            {

            }
            case 6:
            {

            }
            case 7:
            {

            }
            case 8:
            {

            }
            case 9:
            {

            }
            default:
            {
                System.out.println("Unfortunately you have not given a valid choice , please try again");
                startup();
            }
        }
    }
}
