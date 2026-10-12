error id: file://<WORKSPACE>/src/main/java/velo/Velo.java:java/lang/IllegalArgumentException#
file://<WORKSPACE>/src/main/java/velo/Velo.java
empty definition using pc, found symbol in pc: java/lang/IllegalArgumentException#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 230
uri: file://<WORKSPACE>/src/main/java/velo/Velo.java
text:
```scala
package velo;

import javax.crypto.extObjectInputStream;
public class Velo {
    private Guidon guidon;
    private final Selle selle;


    public Velo(Selle selle2) {
        if(selle2==null){
            IllegalArgumentExceptio@@n
        }
        else{
            this.selle=selle2;

        }
        
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
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/IllegalArgumentException#