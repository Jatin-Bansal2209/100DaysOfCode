import java.util.*;

public class reverseWords {
    void revWords(String s) {
        s = s.trim();
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        s = "";
        String str = " ";
        for (int i = arr.length - 1; i >= 0; i--) {
            // System.out.println(arr[i]);
            arr[i] = arr[i].trim();
            if (arr[i].equals(""))
                continue;
            s = s + arr[i] + " ";
        }
        System.out.print(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseWords obj = new reverseWords();
        String s = sc.nextLine();
        obj.revWords(s);
    }
}
