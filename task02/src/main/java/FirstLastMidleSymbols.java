public class FirstLastMidleSymbols {
    public static void main(String[] args) {
        //2. Дана строка. Вывести первый, последний и средний (если он есть)) символы

        String str = "Hello my name is Zhenia";

          System.out.println(" First symbol " + str.charAt(0) +
                           "\n Last symbol " + str.charAt(str.length()-1)  +
                           "\n Middle symbol " + str.charAt(str.length()/2));
    }
}
