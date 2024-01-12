public class occurance {
    public static void main(String[] args) {
        count("janshiiscuteandintelligant", 0, 'a');
    }

    public static int first = -1;
    public static int last = -1;

    public static void count(String str, int idx, char element) {
        if (idx == str.length()) {
            if (first != -1) {
                System.out.println("first element is " + first);
                System.out.println("last element is " + last);
            } else {
                System.out.println("Element not found in the string.");
            }
        } else {
            char curr = str.charAt(idx);
            if (curr == element) {
                if (first == -1) {
                    first = idx;
                }
                last = idx;
            }
            count(str, idx + 1, element);
        }
    }
}
