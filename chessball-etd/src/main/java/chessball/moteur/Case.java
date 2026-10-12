import java.util.Objects;
import java.util.Optional;

public final class Case {
    private final Position position;
    private Piece piece; // null si vide
    private boolean aBallon; // Pour la question Q6

    // Constructeur de visibilité paquet : seul le Plateau instancie les cases
    Case(Position position) {
        this.position = Objects.requireNonNull(position);
        this.piece = null;
        this.aBallon = false;
    }

    public Position position() {
        return position;
    }

    public Optional<Piece> piece() {
        return Optional.ofNullable(piece);
    }

    public boolean occupee() {
        return piece != null;
    }

    public boolean porteBallon() {
        return aBallon;
    }

    // Méthodes de gestion de visibilité paquet, appelées uniquement par Plateau
    void placer(Piece piece) {
        this.piece = Objects.requireNonNull(piece);
    }

    void vider() {
        this.piece = null;
    }

    void setBallon(boolean aBallon) {
        this.aBallon = aBallon;
    }
}