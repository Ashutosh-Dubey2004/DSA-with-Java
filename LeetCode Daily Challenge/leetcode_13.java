public class leetcode_13 {
    static public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += getValue(s.charAt(i));
        }
        return sum;
    }

    static public int getValue(char ch) {
        if (ch == 'I' && ch == 'V') {
            return 4;
        }
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
