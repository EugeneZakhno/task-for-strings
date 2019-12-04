import java.util.Scanner;

public class ShowSymbols {
    public static void main(String[] args) {
        //3. Дана  строка.  Вывести  первые  три  символа  и  последний  три  символа,  если
        //длина  строки  больше  5.  Иначе  вывести  первый  символ  столько  раз,  какова
        //длина строки.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(str.length() > 5) {
            System.out.println(" First three symbols: " + str.substring(0, 3) +
                    "\n Last three symbols: " + str.substring(str.length() - 3, str.length()));
        }
        else
            for (int i = 0; i < str.length(); i++){
                System.out.println(str.charAt(0));
            }
        scanner.close();
    }
}
