error id: file://<WORKSPACE>/src/test/java/velo/VeloTest.java:_empty_/Velo#
file://<WORKSPACE>/src/test/java/velo/VeloTest.java
empty definition using pc, found symbol in pc: _empty_/Velo#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 400
uri: file://<WORKSPACE>/src/test/java/velo/VeloTest.java
text:
```scala
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
    void  setGuidon(null){
           @@Velo velo = new Velo(new Selle());
    Guidon guidon = new Guidon();
    velo.setGuidon(guidon);
    assertSame(guidon, velo.getGuidon());
    assertSame(velo, guidon.getVelo());
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Velo#