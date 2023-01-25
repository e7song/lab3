import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 2, 3, 4};
    double[] input2 = {1};
    double[] input3 = {};
    double[] input4 = {1, 1, 2, 3, 4, 5};
    assertEquals("Test 1 Element", 0.0, 
        ArrayExamples.averageWithoutLowest(input2), 
        0.01);
    assertEquals("Test No Element", 0.0, 
        ArrayExamples.averageWithoutLowest(input3), 
        0.01);
    assertEquals("Test Unique Array", 3.0, 
        ArrayExamples.averageWithoutLowest(input1), 
        0.01);
    assertEquals("Test Duplicate Lowest", 3.0, 
        ArrayExamples.averageWithoutLowest(input4), 
        0.01);
  }
}
