public class ShowSymbol {
    public static void main(String[] args) {

        // 5. Дана строка. Показать номера символов, совпадающих с последним символом строки.

        String str = "heldlo d myd friend";


        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.indexOf('d'));
        }
    }
}
