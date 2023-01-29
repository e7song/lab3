import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 1, 1 }, input2);

    int[] input3 = {1, 3, 5, 3, 1};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{1, 3, 5, 3, 1}, input3);

    
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
