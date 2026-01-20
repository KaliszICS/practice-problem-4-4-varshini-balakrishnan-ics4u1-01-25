public final class CampbellClass {
    private CampbellClass() {

    }
    //convertString
    public static String convertString(int num) {
        return "" + num;
    }
    public static String convertString(double num) {
        return "" + num;
    }
    public static String convertString(char ch) {
        return "" + ch;
    }
    public static String convertString(boolean b) {
        return "" + b;
    }
    //convertMetersToCenti 
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }
    public static double convertMetersToCenti(double meters) {
        return meters * 100;
    }
    //removeNonAlpha
    public static String removeNonAlpha(String str, boolean makeUpper) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (makeUpper == true) {
                    result = result + ("" + ch).toUpperCase();
                } else {
                    result = result +("" + ch).toLowerCase();
                }
            }
        }
        return result;
    }
}