package velo;

public class Guidon {
    private Velo velo;

    public Guidon() {}

    public Velo getVelo() {
        return velo;
    }

    public void setVelo(Velo nouveauVelo) {
        if (this.velo == nouveauVelo) {
            return;
        }

        Velo ancien = this.velo;
        this.velo = nouveauVelo;

        if (ancien != null) {
            ancien.setGuidon(null);
        }

        if (nouveauVelo != null) {
            nouveauVelo.setGuidon(this);
        }
    }
}