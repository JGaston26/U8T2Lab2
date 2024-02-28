import java.io.StringBufferInputStream;
import java.util.ArrayList;

public class Algorithm2DArrays {

    /**
     * Return the sum of all elements of arr that are in the one particular row,
     * specified by the row parameter
     * <p>
     * PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
     *
     * @param arr 2D array of ints
     * @param row the row to add up
     * @return the sum of all elements in row
     */
    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for(int r = 0; r < arr[row].length; r++) {
                sum += arr[row][r];
        }
        return sum;
    }
    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for(int r = 0; r < arr.length; r++) {
            sum += arr[r][col];
        }
        return sum;
    }
    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It then returns the number of changes that were made.
     *
     *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
     *  then this method modifies arr to be:
     *           {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
     *  and returns 8 (the number of even numbers replaced by 0)
     *
     * POSTCONDITION: this method modifies the original 2D array referenced by arr
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr)
    {
        int count = 0;
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[0].length; c++){
                if(arr[r][c] % 2 == 0){
                    arr[r][c] = 0;
                    count++;
                }
            }
        }
        return count;
    }
    /** Searches through the 2D array wordChart and finds all strings with
     *  length len; these strings are added to an ArrayList and returned.
     *  If no strings have that length, return an empty ArrayList
     *
     *  @param wordChart  2D array of Strings
     *  @parram len  the length of strings to search for
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> thing = new ArrayList<String>();
        for(String[] wordList : wordChart){
            for(String words: wordList){
                if(words.length() == len){
                    thing.add(words);
                }
            }
        }
        return thing;
    }
}