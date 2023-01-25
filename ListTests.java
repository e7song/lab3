import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {

    @Test
    public void testFilter() {
        String[] arrinput1 = {"123", "1234567", "12345", "1234", "123456"};
        String[] arrexpected1 = {"1234567", "12345", "123456"};
        List<String> input1 = new ArrayList<String>(Arrays.asList(arrinput1));
        List<String> expected1 = new ArrayList<String>(Arrays.asList(arrexpected1));
        StringChecker sc = new checkStringClass();
        assertArrayEquals(expected1.toArray(), ListExamples.filter(input1, sc).toArray());
    }

    @Test
    public void testMerge() {
        
    }



}