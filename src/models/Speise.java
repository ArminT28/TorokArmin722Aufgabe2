package models;

import java.util.List;

public class Speise {
    ///Speise(Id, Name,Liste der Zutaten)
    private int id;
    private String name;
    private List<Zutat> listeDerZutaten;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Zutat> getListeDerZutaten() {
        return listeDerZutaten;
    }

    public void setListeDerZutaten(List<Zutat> listeDerZutaten) {
        this.listeDerZutaten = listeDerZutaten;
    }

    public Speise(int id, String name, List<Zutat> listeDerZutaten) {
        this.id = id;
        this.name = name;
        this.listeDerZutaten = listeDerZutaten;
    }
}
