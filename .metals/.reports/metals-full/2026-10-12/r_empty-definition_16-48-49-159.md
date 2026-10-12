error id: file://<WORKSPACE>/chessball-etd/src/main/java/chessball/moteur/Piece.java:TypePiece#
file://<WORKSPACE>/chessball-etd/src/main/java/chessball/moteur/Piece.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 131
uri: file://<WORKSPACE>/chessball-etd/src/main/java/chessball/moteur/Piece.java
text:
```scala
package chessball.moteur;

import java.util.Objects;

public class Piece {
    private  Equipe equipes;
    private final TypePiece@@ typiece;
    public Piece(TypePiece type){
            this.type = Objects.requireNonNull(type, "Le type de pièce ne peut pas être null");            equipes=null;
    }
    public TypePiece type(){
        return typiece;
    }
    public Equipe equipe(){
        return equipes;
    }
    public Couleur couleur() {
        if(equipes==null){
            return null;
        }
        return  equipes.couleur();
    }
    void setEquipe(Equipe equipe) {
        this.equipes = equipe;
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 