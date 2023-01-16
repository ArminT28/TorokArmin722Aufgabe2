package controllers;

import models.Zutat;
import repositories.ZutatRepository;

import java.util.ArrayList;
import java.util.List;

public class ZutatController {
    private ZutatRepository zutatRepository;

    public ZutatRepository getZutatRepository() {
        return zutatRepository;
    }

    public void setZutatRepository(ZutatRepository zutatRepository) {
        this.zutatRepository = zutatRepository;
    }

    public ZutatController(ZutatRepository zutatRepository) {
        this.zutatRepository = zutatRepository;
    }

    public void addZutat(Zutat newZutat)
    {
        zutatRepository.add(newZutat);
    }

    public void deleteZutat(Zutat zutat)
    {
        zutatRepository.delete(zutat);
    }

    public void updateZutat(Zutat oldZutat,Zutat newZutat)
    {
        zutatRepository.update(oldZutat,newZutat);
    }

    public List<Zutat> getZutatenNachMenge(int menge)
    {
        var alleZutaten = zutatRepository.getAlleZutaten();
        var guteZutaten = new ArrayList<Zutat>();
        for(var singleZutat:alleZutaten)
        {
            if(singleZutat.getMenge()==menge)
                guteZutaten.add(singleZutat);
        }
        return guteZutaten;
    }
}
