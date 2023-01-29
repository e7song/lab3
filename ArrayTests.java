import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    //successful input
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 1, 1 }, input2);

    int[] input3 = {1, 3, 5, 3, 1};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{1, 3, 5, 3, 1}, input3);

    int[] input4 = {1, 2, 2, 1};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[] {1, 2, 2, 1}, input4);

    //faiure-inducing input
    int[] input5 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input5);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, input5);

    int[] input6 = {1, 3, 5, 2};
    ArrayExamples.reverseInPlace(input6);
    assertArrayEquals(new int[] {2, 5, 3, 1}, input6);

    
	}


  @Test
  public void testReversed() {
    //successful input
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    //failure-inducing input
    int[] input2 = {1, 3, 5, 2};
    assertArrayEquals(new int[] {2, 5, 3, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    //successful input
    double[] input1 = {1, 2, 3, 4, 5, 6};
    assertEquals(4.0, 
        ArrayExamples.averageWithoutLowest(input1), 0.001);

    //failure-inducing
    double[] input2 = {1, 1, 2, 3, 4, 5, 6};
    assertEquals(4.0, 
        ArrayExamples.averageWithoutLowest(input2), 0.001);
    
  }
}
