package chessball.moteur;

import java.util.Objects;

public class Piece {
    private  Equipe equipes;
    private final TypePiece typiece;
    public Piece(TypePiece type){
            this.typiece= Objects.requireNonNull(type, "Le type de pièce ne peut pas être null");            
            equipes=null;
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
