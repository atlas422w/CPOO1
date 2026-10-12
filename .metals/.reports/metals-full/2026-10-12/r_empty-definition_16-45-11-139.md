error id: file://<WORKSPACE>/chessball-etd/src/main/java/chessball/moteur/Equipe.java:java/lang/IllegalStateException#
file://<WORKSPACE>/chessball-etd/src/main/java/chessball/moteur/Equipe.java
empty definition using pc, found symbol in pc: java/lang/IllegalStateException#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 686
uri: file://<WORKSPACE>/chessball-etd/src/main/java/chessball/moteur/Equipe.java
text:
```scala
import java.util.ArrayList;
import java.util.List;

public final class Equipe {
    public static final int EFFECTIF = 5;
    private  Couleur couleur;
    private  List<Piece> lstpieces;
    public Equipe(Couleur couleur){
        this.couleur=couleur;
        lstpieces= new ArrayList<>();
    }


    public Couleur couleur(){
        return  couleur;
    }
    public List<Piece> pieces(){
        return  lstpieces;
    }
    public void ajouter(Piece piece){
        if(!lstpieces.contains(piece)&&piece.equipe()==null){
            lstpieces.add(piece);
            piece.setEquipe(this);
        }
        else if(piece.equipe()!=null){
           throw new IllegalStateExceptio@@n("La pièce appartient déjà à une autre équipe.");
        }
    }

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/IllegalStateException#