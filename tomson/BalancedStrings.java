package tomson;

public class BalancedStrings {

    public static boolean isBalancedString(String s) {

        char[] _char = s.toCharArray();
        int a = 0, b = 0, c = 0, d = 0;
        for (char cc : _char) {
            switch (cc) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                case 'd':
                    d++;
                    break;

                default:
                    System.out.println("No es carac");
                    break;
            }
        }
        return (a == c && b == d) ? true : false;
    }

    public static void main(String args[]) {
        System.out.println("Start");
        String s = "abcdbacbdabcdabcdabdcabdcabdcadscbadcb";
        System.out.println(isBalancedString(s));
    }
}
