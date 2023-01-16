package controllers;

import models.Zutat;
import repositories.ZutatRepository;

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
}
