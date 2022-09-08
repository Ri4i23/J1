import java.util.Arrays;
import java.util.Objects;
public class dz1 {
    public static void main(String[] args) {
        String[] array = {"aaabb", "aabbb", "aaabb"};
        System.out.print("Массив " + Arrays.toString(array));
        System.out.println(" Префикс = " + longestPrefix(array));
    }

    private static String longestPrefix(String[] str) {
        if (str.length == 0)
            return "";
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}

















