import org.junit.Assert;
import org.junit.Test;

public class FinderTests {
    @Test
    public void normalMaxArray1(){
        int[] intArray = new int[1,2,3,4,5];
        expected = 5;
        actual = findMax(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void normalMaxArray2(){
        int[] intArray = new int[6,4,3,2,0];
        expected = 6;
        actual = findMax(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void normalMaxArray3(){
        int[] intArray = new int[8,6,7,5,3,0,9];
        expected = 9;
        actual = findMax(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void emptyMaxArray1(){
        int[] intArray = new int[];
        expected = null;
        actual = findMax(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void nullMaxArray1(){
        int[] intArray = null;
        expected = null;
        actual = findMax(int[] intArray);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void normalMinArray1(){
        int[] intArray = new int[1,2,3,4,5];
        expected = 1;
        actual = findMin(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void normalMinArray2(){
        int[] intArray = new int[6,4,3,2,0];
        expected = 0;
        actual = findMin(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void normalMaxArray3(){
        int[] intArray = new int[8,6,7,5,3,0,9];
        expected = 0;
        actual = findMin(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void emptyMinArray1(){
        int[] intArray = new int[];
        expected = null;
        actual = findMin(int[] intArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void nullMinArray1(){
        int[] intArray = null;
        expected = null;
        actual = findMin(int[] intArray);
        Assert.assertEquals(actual, expected);
    }
}
