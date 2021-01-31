package practice;
import java.util.TreeSet;

public class SetDigit {
    
    public TreeSet<Integer> combination = new TreeSet<Integer>();
    int actual;
    public int findNextHighest(int n) {
        actual=n;
        permutation("", Integer.toString(n));
        return getNextHighestNumber();
    }

    /*
     * Recursive method to get all combination of digits
     */
    public void permutation(String prefix, String str) {
        int len = str.length();
        if (len == 0) {
            int temp=Integer.valueOf(prefix);
            if(temp>actual)
                combination.add(temp);
        } else {
            for (int i = 0; i < len; i++) {

                String p = prefix + str.charAt(i);
                String s = str.substring(0, i) + str.substring(i + 1, len);
                permutation(p, s);
            }
        }
    }

    /*
     * Get the next number from combination collection TreeSet
     */
    public int getNextHighestNumber() {
        return combination.first();
    }

    public static void main(String[] args) {

        Integer n = 546793;
        SetDigit obj = new SetDigit();
        int nxtNumber = obj.findNextHighest(n);
        System.out.println(nxtNumber);
    }

}
