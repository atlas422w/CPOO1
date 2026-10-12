error id: file://<WORKSPACE>/src/main/java/velo/Velo.java:java/util/Collections#unmodifiableList().
file://<WORKSPACE>/src/main/java/velo/Velo.java
empty definition using pc, found symbol in pc: java/util/Collections#unmodifiableList().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 816
uri: file://<WORKSPACE>/src/main/java/velo/Velo.java
text:
```scala
package velo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import 

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
    public List<Roue> getRoues(){
            return  this.roues;
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
        return Collections.unmo@@difiableList(roues);
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
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Collections#unmodifiableList().