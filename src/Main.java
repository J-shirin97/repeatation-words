import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(Locale.ROOT);
        String words[] = str.split(" ");
        int count;
        for (int i = 0; i < words.length; i++) {     //first word keep
            count = 1;
            for (int j = 1 + i; j < words.length; j++) {   // check another words & equals
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i] + " " + count + " repeated");
            }
        }
    }
}
