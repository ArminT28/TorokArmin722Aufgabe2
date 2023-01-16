import controllers.SpeiseController;
import controllers.ZutatController;
import models.Speise;
import models.Zutat;
import repositories.SpeiseRepository;
import repositories.ZutatRepository;
import views.MainView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SpeiseRepository speiseRepository = new SpeiseRepository(new ArrayList<Speise>());
        SpeiseController speiseController = new SpeiseController(speiseRepository);

        ZutatRepository zutatRepository = new ZutatRepository(new ArrayList<Zutat>());
        ZutatController zutatController = new ZutatController(zutatRepository);

        MainView mainView = new MainView(speiseController,zutatController);

        mainView.startup();
    }
}