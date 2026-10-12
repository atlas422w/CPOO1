error id: file://<WORKSPACE>/src/test/java/point/TestMyPoint.java:_empty_/Test#
file://<WORKSPACE>/src/test/java/point/TestMyPoint.java
empty definition using pc, found symbol in pc: _empty_/Test#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 217
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

	@Tes@@t
	void constructorDefault() {
		final MyPoint pt = new MyPoint();
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

empty definition using pc, found symbol in pc: _empty_/Test#