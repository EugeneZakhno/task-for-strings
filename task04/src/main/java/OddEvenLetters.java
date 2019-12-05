public class OddEvenLetters {
    public static void main(String[] args) {

        // 4. Сформировать строку из 10 символов.
        // На четных позициях должны находится четные цифры 2 4 6 8, на нечетных позициях - буквы. m l k g

        String str = "skvskvbjhjh";

        for (int i = 0; i < 8; i += 2) {
            for (int j = 1; j < i; j +=3) {
                System.out.print(i+"");
                System.out.print(str.charAt(j));
            }
        }
    }
}
