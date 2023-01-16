package controllers;

import models.Speise;
import repositories.SpeiseRepository;

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

    public void deleteSpeise(Speise zutat)
    {
        speiseRepository.delete(zutat);
    }

    public void updateSpeise(Speise oldZutat,Speise newZutat)
    {
        speiseRepository.update(oldZutat,newZutat);
    }
}
