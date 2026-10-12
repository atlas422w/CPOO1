package velo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Velo {
    private Guidon guidon;
    private final Selle selle;

    private final List<Roue> roues= new ArrayList<>();

    public Velo(Selle selle2) {
        if(selle2==null){
            throw new IllegalArgumentException("Le constructeur selle est null");
        }
        else{
            this.selle=selle2;

        }
        
    }
    public List<Roue> getRoues() {
        return Collections.unmodifiableList(this.roues);
    }
    public  void addRoue(Roue roue){
        if (roue == null) return;
        roues.add(roue);


    }
    public  void removeRoue(Roue roue){
            if (roue == null) return;
            roues.remove(roue);
    }
    public Guidon getGuidon() {
        return guidon;
    }

    public void setGuidon(Guidon nouveauGuidon) {
        if (this.guidon == nouveauGuidon) {
            return;
        }

        Guidon ancien = this.guidon;
        this.guidon = nouveauGuidon;

        if (ancien != null) {
            ancien.setVelo(null);
        }

        if (nouveauGuidon != null) {
            nouveauGuidon.setVelo(this);
        }
    }
}