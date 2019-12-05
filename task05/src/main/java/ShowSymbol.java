public class ShowSymbol {
    public static void main(String[] args) {

       // 5. Дана строка. Показать номера символов, совпадающих с последним символом строки.

        String str = "hello d myd friend";

        System.out.println(str.indexOf('o'));
        for (int i=0; i<str.length();i++) {
            System.out.println(str.indexOf("d"));
            if (str.length() - 1 == str.charAt(i)) {

            }
        }
    }
}
