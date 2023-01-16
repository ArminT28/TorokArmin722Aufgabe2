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

    public void delete(String speiseName)
    {
        alleSpeisen.remove(speiseName);
    }

    public void update(int oldSpeiseId,Speise newSpeise)
    {
        for(var speise:this.alleSpeisen)
        {
            if(speise.getId()==oldSpeiseId) {
                speise=newSpeise;
            }
        }
    }
}
