package repositories;

import models.Zutat;

import java.util.List;

public class ZutatRepository {
    public List<Zutat> getAlleZutaten() {
        return alleZutaten;
    }

    public void setAlleZutaten(List<Zutat> alleZutaten) {
        this.alleZutaten = alleZutaten;
    }

    public ZutatRepository(List<Zutat> alleZutaten) {
        this.alleZutaten = alleZutaten;
    }

    private List<Zutat> alleZutaten;

    public void add(Zutat zutat)
    {
        alleZutaten.add(zutat);
    }

    public void delete(Zutat zutat)
    {
        alleZutaten.remove(zutat);
    }

    public void update(Zutat oldZutat,Zutat newZutat)
    {
        for(var zutat:this.alleZutaten)
        {
            if(zutat.equals(oldZutat)) {
                zutat=newZutat;
            }
        }
    }
}
