error id: file://<WORKSPACE>/src/test/java/point/TestMyPoint.java:_empty_/EPSILON#
file://<WORKSPACE>/src/test/java/point/TestMyPoint.java
empty definition using pc, found symbol in pc: _empty_/EPSILON#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 596
uri: file://<WORKSPACE>/src/test/java/point/TestMyPoint.java
text:
```scala
package point;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(4.0, copie.getY(), E@@PSILON);
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
	void testSetXNan(){
		MyPoint pt = new MyPoint(2.5,4.0);
		pt.setX(2.5);
		assertEquals(2.5, pt.getX(), 0.0001);
	}
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/EPSILON#