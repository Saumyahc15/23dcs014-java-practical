public class sup2 {
    public static void main(String[] args) {
        String str = "resource";
        System.out.println("The given string is: " + str);
        System.out.println("The duplicate characters and counts are:");
        countDuplicates(str);
    }

    public static void countDuplicates(String str) {
        char[] charArray = str.toCharArray();
        boolean[] printed = new boolean[256]; // assuming ASCII characters

        for (char c : charArray) {
            int count = 0;
            for (char d : charArray) {
                if (c == d) {
                    count++;
                }
            }
            if (count > 1 && !printed[c]) {
                System.out.println(c + " appears " + count + " times");
                printed[c] = true;
            }
        }
    }
}
