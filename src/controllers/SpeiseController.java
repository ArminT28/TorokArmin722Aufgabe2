package controllers;

import models.Speise;
import models.Zutat;
import repositories.SpeiseRepository;
import repositories.ZutatRepository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeiseController {
    private SpeiseRepository speiseRepository;

    public SpeiseRepository getSpeiseRepository() {
        return speiseRepository;
    }

    public void setZutatRepository(SpeiseRepository speiseRepository) {
        this.speiseRepository = speiseRepository;
    }

    public SpeiseController(SpeiseRepository speiseRepository) {
        this.speiseRepository = speiseRepository;
    }

    public void addSpeise(Speise newZutat)
    {
        speiseRepository.add(newZutat);
    }

    public void deleteSpeise(String speiseName)
    {
        speiseRepository.delete(speiseName);
    }

    public void updateSpeise(int oldZutatId,Speise newZutat)
    {
        speiseRepository.update(oldZutatId,newZutat);
    }

    public List<Speise> getSpeiseThatContainZutat(Zutat searchedZutat)
    {
        var alleSpeisen = speiseRepository.getAlleSpeisen();
        var guteSpeisen = new ArrayList<Speise>();
        for(var singleSpeise:alleSpeisen)
        {
            if(singleSpeise.getListeDerZutaten().contains(searchedZutat))
                guteSpeisen.add(singleSpeise);
        }
        return guteSpeisen;
    }

    public Map<Speise,Integer> getGesamtbetragFurHerstelungDerSpeise()
    {
        var alleSpeisen = speiseRepository.getAlleSpeisen();
        Map<Speise,Integer> speisenUndGesamtbetrag = new HashMap<Speise,Integer>();
        for(var singleSpeise : alleSpeisen)
        {
            var gesamtbetrag=0;
            for(var singleZutat:singleSpeise.getListeDerZutaten())
            {
                gesamtbetrag+=singleZutat.getMenge();
            }
            speisenUndGesamtbetrag.put(singleSpeise,gesamtbetrag);
        }
        return speisenUndGesamtbetrag;
    }
}
