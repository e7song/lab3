

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] temp = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      temp[i] = arr[arr.length - i - 1];
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }

  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    //edge case, 1 element in array
    if(arr.length < 2) { return 0.0; }

    //finds the lowest value
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }

    //sums everything
    double sum = 0;
    boolean excluded = false;
    for(double num: arr) {
      //excludes the lowest value once
      if (num == lowest && excluded == false) {
        excluded = true;
        continue;
      }
      sum += num;
    }
    //returns average
    return sum / (arr.length - 1);
  }

}

