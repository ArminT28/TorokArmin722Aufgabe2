package repositories;

import models.Speise;
import models.Zutat;

import java.util.List;

public class SpeiseRepository {
    public List<Speise> getAlleSpeisen() {
        return alleSpeisen;
    }

    public void setAlleSpeisen(List<Speise> alleSpeisen) {
        this.alleSpeisen = alleSpeisen;
    }

    public SpeiseRepository(List<Speise> alleSpeisen) {
        this.alleSpeisen = alleSpeisen;
    }

    private List<Speise> alleSpeisen;

    public void add(Speise speise)
    {
        alleSpeisen.add(speise);
    }

    public void delete(Speise speise)
    {
        alleSpeisen.remove(speise);
    }

    public void update(Speise oldSpeise,Speise newSpeise)
    {
        for(var speise:this.alleSpeisen)
        {
            if(speise.equals(oldSpeise)) {
                speise=newSpeise;
            }
        }
    }
}
