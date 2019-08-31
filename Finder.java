import java.util.Arrays;

public class Finder {

        //Finds and returns the biggest number in an array of integers.
        public static int findMax(int[] intArray){
            //Returns null in the case of a null or empty array
            if (intArray == null || intArray.length == 0) {
                return Integer.parseInt(null);
            }
            Arrays.sort(intArray);
            int max = intArray[(intArray.length)-1];
            return max;
        }

        //Finds and returns the smallest number in an array of integers.
        public static int findMin(int[] intArray){
            //Returns null in the case of a null or empty array
            if (intArray == null || intArray.length == 0) {
                return Integer.parseInt(null);
            }
            Arrays.sort(intArray);
            int min = intArray[0];
            return min;
        }
}
