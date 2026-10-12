error id: file://<WORKSPACE>/src/main/java/velo/Velo.java:_empty_/Selle#
file://<WORKSPACE>/src/main/java/velo/Velo.java
empty definition using pc, found symbol in pc: _empty_/Selle#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 115
uri: file://<WORKSPACE>/src/main/java/velo/Velo.java
text:
```scala
package velo;

public class Velo {
    private Guidon guidon;
    private final Selle selle;


    public Velo(Sell@@e selle) {
        selle=new Selle();
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

empty definition using pc, found symbol in pc: _empty_/Selle#