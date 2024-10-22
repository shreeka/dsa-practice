package problems;

public class StringCreationAB {

    public static String solution(int a, int b) {
        StringBuilder resultStr = new StringBuilder(a+b);
        while(a+b > 0) {
            if(a > b) {
                if (a >= 2) {
                    resultStr.append("aa");
                    a -= 2;
                }else{
                    resultStr.append("a");
                    a--;
                }
                if (b >= 1) {
                    resultStr.append("b");
                    b--;
                }

            } else if (b > a) {
                if (b >= 2) {
                    resultStr.append("bb");
                    b -= 2;
                }else{
                    resultStr.append("b");
                    b--;
                }
                if (a >= 1) {
                    resultStr.append("a");
                    a--;
                }
            } else {
                if (a > 0) {
                    resultStr.append("a");
                    a--;
                }
                if (b > 0) {
                    resultStr.append("b");
                    b --;
                }
            }
        }

        return resultStr.toString();

    }
}
