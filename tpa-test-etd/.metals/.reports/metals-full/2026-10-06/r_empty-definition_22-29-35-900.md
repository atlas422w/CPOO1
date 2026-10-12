error id: file://<WORKSPACE>/src/test/java/point/TestMyPoint.java:_empty_/MyPoint#getY#
file://<WORKSPACE>/src/test/java/point/TestMyPoint.java
empty definition using pc, found symbol in pc: _empty_/MyPoint#getY#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1551
uri: file://<WORKSPACE>/src/test/java/point/TestMyPoint.java
text:
```scala
package point;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMyPoint {
	// alt + insert

	@Test
	void constructorDefault() {
		final MyPoint pt = new MyPoint();
		assertEquals(0, pt.getX(), 0.001);
		assertEquals(0, pt.getY(), 0.001);
	}
	@Test
    void testConstructeurCopieNominal() {
        MyPoint original = new MyPoint(3.0, 4.0);
        MyPoint copie = new MyPoint(original);
        assertEquals(3.0, copie.getX(), 0.001);
        assertEquals(4.0, copie.getY(), 0.001);
    }
	@Test
	void constructorDefault2() {
		final MyPoint pt = new MyPoint(null);
		assertEquals(0, pt.getX(), 0.001);
		assertEquals(0, pt.getY(), 0.001);
	}
	@Test
	void setPointRandom() {
		final MyPoint pt = new MyPoint();
		final Random random = Mockito.mock(Random.class); //new Random();
		Mockito.when(random.nextInt()).thenReturn(1, 2);

		pt.setPoint(random, random);
		assertEquals(1, pt.getX(), 0.0001);
		assertEquals(2, pt.getY(), 0.0001);
	}

	@Test
    void testSetXNaN() {
        MyPoint p = new MyPoint(2.5, 4.0);
        p.setX(Double.NaN);
        assertEquals(2.5, p.getX(), 0.0001);
    }
	@Test
    void testHorizontalSymmetryNominal() {
        MyPoint p = new MyPoint(1.0, 2.0);
        MyPoint centre = new MyPoint(0.0, 0.0);
        MyPoint sym = p.horizontalSymmetry(centre);
        assertEquals(-1.0, sym.getX(), 0.0001;
        assertEquals(2.0, sym.getY@@(), EPSILON);
    }

    @Test
    void testHorizontalSymmetryNull() {
        MyPoint p = new MyPoint(1.0, 2.0);
        assertThrows(IllegalArgumentException.class, () -> {
            p.horizontalSymmetry(null);
        });
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/MyPoint#getY#