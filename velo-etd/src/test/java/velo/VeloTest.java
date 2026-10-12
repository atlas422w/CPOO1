package velo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class VeloTest {
    @Test
    void guidonPoseDesDeuxCotes() {
    Velo velo = new Velo(new Selle());
    Guidon guidon = new Guidon();
    velo.setGuidon(guidon);
    assertSame(guidon, velo.getGuidon());
    assertSame(velo, guidon.getVelo());
    }
    @Test
    void testSetGuidonNullDissocieLesDeuxCotes() {
        Selle selle = new Selle();
        Velo velo = new Velo(selle);
        Guidon guidon = new Guidon();

        velo.setGuidon(guidon);

        velo.setGuidon(null);

        assertNull(velo.getGuidon(), "Le guidon du vélo doit être null");
        assertNull(guidon.getVelo(), "Le vélo du guidon doit être null");
    }

    @Test
    void testRemplacementGuidonMetAJourLesReferences() {
        Selle selle = new Selle();
        Velo velo = new Velo(selle);
        Guidon g1 = new Guidon();
        Guidon g2 = new Guidon();

        velo.setGuidon(g1);

        velo.setGuidon(g2);

        assertNull(g1.getVelo(), "L'ancien guidon (g1) ne doit plus être attaché au vélo");
        assertEquals(velo, g2.getVelo(), "Le nouveau guidon (g2) doit être attaché au vélo");
        assertEquals(g2, velo.getGuidon(), "Le vélo doit pointer sur le nouveau guidon (g2)");
    }

    @Test
    void testSetGuidonNullSansGuidonNeLeveRien() {
        Selle selle = new Selle();
        Velo velo = new Velo(selle);

        assertDoesNotThrow(() -> velo.setGuidon(null), 
            "setGuidon(null) sur un vélo sans guidon ne doit pas lever d'exception");
    }
    @Test
    void veloSansSelleRefuse() {
    assertThrows(IllegalArgumentException.class, () -> new Velo(null));
    }
}