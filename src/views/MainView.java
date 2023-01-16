package views;

import controllers.SpeiseController;
import controllers.ZutatController;
import models.Speise;
import models.Zutat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainView {
    private SpeiseController speiseController;
    private ZutatController zutatController;

    public MainView(SpeiseController speiseController, ZutatController zutatController) {
        this.speiseController = speiseController;
        this.zutatController = zutatController;
    }

    public void startup()
    {
        System.out.println("what would you like to do?");
        System.out.println("1.)Add Zutat\n" +
                "2.)Delete Zutat\n" +
                "3.)Update Zutat\n" +
                "4.)Add Speise\n" +
                "5.)Delete Speise\n" +
                "6.)Update Speise\n" +
                "7.)Filter nach Menge\n" +
                "8.)Finde Speise die einen Zutat haben\n" +
                "9.)Sehe gesamtbetrag der Zutaten in alle Spiesen\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give choice:");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                String zutatName = sc.next();
                int zutatPreis = sc.nextInt();
                int zutatMenge = sc.nextInt();
                zutatController.addZutat(new Zutat(zutatName,zutatPreis,zutatMenge));
                System.out.println("Zutat created succesfully");
                startup();
                break;
            }
            case 2:
            {
                String zutatName = sc.next();
                zutatController.deleteZutat(zutatName);
                System.out.println("Zutat deleted succesfully");
                startup();
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
                String speiseName = sc.next();
                int speiseId = sc.nextInt();
                List<Zutat> listeDerZutaten = new ArrayList<>();
                speiseController.addSpeise(new Speise(speiseId,speiseName,listeDerZutaten));
                System.out.println("Speise created succesfully");
                startup();
                break;
            }
            case 5:
            {
                String speiseName = sc.next();
                speiseController.deleteSpeise(speiseName);
                System.out.println("Speise deleted succesfully");
            }
            case 6:
            {
                break;
            }
            case 7:
            {
                int mengeBenutzere = sc.nextInt();
                System.out.println(zutatController.getZutatenNachMenge(mengeBenutzere));
                startup();
                break;
            }
            case 8:
            {
                String zutatName = sc.next();
                int zutatPreis = sc.nextInt();
                int zutatMenge = sc.nextInt();
                System.out.println(speiseController.getSpeiseThatContainZutat(new Zutat(zutatName,zutatPreis,zutatMenge)));
            }
            case 9:
            {
                var speisen = speiseController.getGesamtbetragFurHerstelungDerSpeise();
                System.out.println(speisen);
                startup();
                break;
            }
            default:
            {
                System.out.println("Unfortunately you have not given a valid choice , please try again");
                startup();
                break;
            }
        }
    }
}
