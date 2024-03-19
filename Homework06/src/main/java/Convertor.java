import java.util.Arrays;
import java.util.List;

public class Convertor{

    public static double convertCMInMM(String str) {
        double number  = Double.parseDouble(str.substring(0, str.indexOf("cm")));
        return  number * 10;
    }

    public static double convertDMInMM(String str) {
        double number  = Double.parseDouble(str.substring(0, str.indexOf("dm")));
        return  number * Math.pow(10, 2);
    }
    public static double convertMInMM(String str) {
        double number  = Double.parseDouble(str.substring(0, str.indexOf("m")));
        return  number * Math.pow(10, 3);
    }

    public static double convertKMInMM(String str) {
        double number  = Double.parseDouble(str.substring(0, str.indexOf("km")));
        return  number * Math.pow(10, 6);
    }

    public static double getMM(String string) {
        if(string.endsWith("mm")) {
            return Double.parseDouble(string.substring(0, string.indexOf("mm")));
        }
        if(string.endsWith("cm")) {
            return convertCMInMM(string);
        }
        if(string.endsWith("dm")) {
            return convertDMInMM(string);
        }
        if(string.contains("m") && !string.endsWith("mm")&& !string.endsWith("cm") && !string.endsWith("dm") && !string.endsWith("km")) {
            return convertMInMM(string);
        }
        if(string.endsWith("km")) {
            return convertKMInMM(string);
        }
        return 0;
    }
}
