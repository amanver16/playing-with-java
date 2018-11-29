# Java 8: Parallel Array Sorting
Java provides a new additional feature in Array class which is used to sort array elements parallel.New methods has added to java.util.Arrays package that use the JSR 166 Fork/Join parallelism common pool to provide sorting of arrays in parallel.The methods are called parallelSort() and are overloaded for all the primitive data types and Comparable objects.  

![Parallel Array Sorting](https://github.com/amanver16/ebooks_cheatsheets/blob/master/Images/Parallel%20Array%20Sorting%20Java%208.jpg)  
    
## About Project
The project describes uses of **Parallel Array Sorting** in different scenarios.  

## How to Run 
Compile and run using provided main classes.  

## Arrays.parallelSort() Overloaded Methods
| **Method** | **Description** |
| ------------- | --------------- |
| public static void parallelSort(byte[] a) | It sorts the specified array into ascending numerical order. |
| public static void parallelSort(byte[] a, int fromIndex, int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static void parallelSort(char[] a) | It sorts the specified array into ascending numerical order. |
| public static void parallelSort(char[] a, int fromIndex, int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static void parallelSort(double[] a) | It sorts the specified array into ascending numerical order. |
| public static void parallelSort(double[] a, int fromIndex, int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static void parallelSort(float[] a) | It sorts the specified array into ascending numerical order. |
| public static void parallelSort(float[] a, int fromIndex, int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static void parallelSort(int[] a) | It sorts the specified array into ascending numerical order. |
| public static void parallelSort(int[] a,int fromIndex, int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static void parallelSort(long[] a) | It sorts the specified array into ascending numerical order. |
| public static void parallelSort(long[] a, int fromIndex, int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static void parallelSort(short[] a) | It sorts the specified array into ascending numerical order. |
public static void parallelSort(short[] a,int fromIndex,int toIndex) | It sorts the specified range of the array into ascending numerical order. The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive. If fromIndex == toIndex, the range to be sorted is empty. |
| public static <T extends Comparable<? super T>> void parallelSort(T[] a) | Sorts the specified array of objects into ascending order, according to the natural ordering of its elements. All elements in the array must implement the Comparable interface. Furthermore, all elements in the array must be mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the array). |
| public static <T7gt; void parallelSort(T[] a,Comparator<? super T> cmp) | It sorts the specified array of objects according to the order induced by the specified comparator. All elements in the array must be mutually comparable by the specified comparator (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the array). |
| public static <T extends Comparable<? super T>> void parallelSort(T[] a,int fromIndex, int toIndex) | It sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements. The range to be sorted extends from index fromIndex, inclusive, to index toIndex, exclusive. (If fromIndex==toIndex, the range to be sorted is empty.) All elements in this range must implement the Comparable interface. Furthermore, all elements in this range must be mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the array). |
| public static <T> void parallelSort(T[] a, int fromIndex, int toIndex, Comparator<? super T> cmp) | It sorts the specified range of the specified array of objects according to the order induced by the specified comparator. The range to be sorted extends from index fromIndex, inclusive, to index toIndex, exclusive. (If fromIndex==toIndex, the range to be sorted is empty.) All elements in the range must be mutually comparable by the specified comparator (that is, c.compare(e1, e2) must not throw a ClassCastException for any elements e1 and e2 in the range). |