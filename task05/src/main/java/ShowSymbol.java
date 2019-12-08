public class ShowSymbol {
    public static void main(String[] args) {

        // 5. Дана строка. Показать номера символов, совпадающих с последним символом строки.

        String str = "hdeldlo d myd friend";

        for (int i = 0; i < str.length(); i++) {
                if(str.charAt(str.length()-1) == str.charAt(i))
                    System.out.print(str.indexOf(str.charAt(i)));
            }
        }
    }

