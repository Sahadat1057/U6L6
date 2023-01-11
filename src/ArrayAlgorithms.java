import java.util.Locale;

public class ArrayAlgorithms {

    /**
     * Returns true if ANY of the ints in numList are positive, otherwise,
     * returns false.
     * <p>
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of ints; does not get modified
     * @return true if any element of numList is positive, false otherwise
     */
    public static boolean containsPositive(int[] numList) {
        int counter = 0;
        for (int i = 0; i < numList.length - 1; i++) {
            int num = numList[i];
            if (num > 0) {
                counter++;
            }
        }
        if (counter > 0) {
            return true;
        } else return false;
    }


    /**
     * Returns true if ANY of the Strings in stringList contain searchStr,
     * otherwise, returns false. Your method should NOT be case sensitive, e.g.
     * searching for "ma" should be found in the String "Maddox" and searching
     * for "MA" should be found in String "mad"
     * <p>
     * Does NOT mutate (modify) stringList.
     * PRECONDITION: stringList.length > 0
     *
     * @param stringList original array of Strings; does not get modified
     * @param searchStr  the String to search each element of stringList
     * @return true if any element of stringList contains searchStr, otherwise
     * returns false
     */
    public static boolean containsString(String[] stringList, String searchStr) {
        searchStr = searchStr.toLowerCase();
        int counter = 0;
        for (int i = 0; i < stringList.length - 1; i++) {
            String word = stringList[i];
            word = word.toLowerCase();
            if (word.indexOf(searchStr) != -1) {
                counter++;
            }
        }
        if (counter > 0) {
            return true;
        } else return false;
    }


    /**
     * Returns a NEW array of Strings that contains all words from the original
     * array of strings in lowercase.
     * <p>
     * Does NOT mutate (modify) original wordList
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings, not modified by method
     * @return new array of Strings in all lowercase
     */

    public static String[] makeLowercase(String[] wordList) {
        String[] newList = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            String word = wordList[i].toLowerCase();
            newList[i] = word;
        }
        return newList;
    }


    /**
     * Returns a NEW array of ints that contains the higher value of each pair
     * of elements at the same index in two other equally-sized arrays of ints
     * For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     * this method returns the array {2, 7, 6, 1, 8}, where each value is the
     * higher of the two at that respective index in the two original arrays
     * <p>
     * Does NOT mutate (modify) EITHER array
     * PRECONDITION: intArr1.length == intArr2.length
     *
     * @param intArr1 first array of ints
     * @param intArr2 second array of ints, having the same length as intArr1
     * @return new array of ints representing the higher values
     */

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] intArr3 = new int[intArr1.length];
        for (int i = 0; i < intArr3.length; i++) {
            if (intArr1[i] > intArr2[i]) {
                intArr3[i] = intArr1[i];
            }
            else if (intArr1[i] < intArr2[i]) {
                intArr3[i] = intArr2[i];
            }
            else intArr3[i] = intArr1[i];
        }
        return intArr3;
    }


    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  number of Strings in stringList that end in "!"
     */
    public static int endsInExclamations(String[] stringList) {
        int counter = 0;
        for (int i = 0; i < stringList.length; i++) {
            String phrase = stringList[i];
            String eP = "!";
            int last = phrase.length() -1;
            if (phrase.indexOf(eP) == last) {
                counter++;
            }
        }
        return counter;
    }


    /** Returns the number of elements in the numList array that have the same
     *  value as the element immediately adjacent to the right in the array.
     *  (BE CAREFUL not to go out of bounds!)
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  number of elements in numList that are equal to the element
     *           adjacent to the right of the element in the array
     */
    public static int countConsecutiveDoubles(int[] numList)
    {
        int counter = 0;
        for ()
        if ()
    }


}



