error id: file://<WORKSPACE>/src/test/java/velo/VeloTest.java:velo/VeloTest#assertSame#
file://<WORKSPACE>/src/test/java/velo/VeloTest.java
empty definition using pc, found symbol in pc: velo/VeloTest#assertSame#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 271
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
    asse@@rtSame(guidon, velo.getGuidon());
    assertSame(velo, guidon.getVelo());
    }
    @Test 
    void  setGuidon(null){
        
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: velo/VeloTest#assertSame#