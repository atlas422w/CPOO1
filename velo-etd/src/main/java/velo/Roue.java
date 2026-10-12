package velo;

public class Roue {
     private Velo velo;
     public Roue(){

     }
     public Velo getVelo(){
          return velo;
     }

    public void setVelo(Velo nouveauVelo) {
        if (this.velo == nouveauVelo) {
            return;
        }

        Velo ancien = this.velo;
        this.velo = nouveauVelo;

        if (ancien != null) {
            ancien.removeRoue(this);
        }

        if (nouveauVelo != null) {
            nouveauVelo.addRoue(this);
        }
    }
    
}
