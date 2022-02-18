import java.util.Scanner;
//Определяем, является ли слово палиндромом
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String s = in.nextLine();
        System.out.println("Ответ: "+isPalindrome(s));
    }
    //Метод,"переворачивающий" строку
    public static String reverseString(String s){
        String line = "";
        for (int j = s.length()-1; j >= 0; j--){
            line += s.charAt(j);
        }
        return line;
    }
    //Метод проверяющий является ли словом палиндромом
    public static boolean isPalindrome(String s){
        String types = s.toLowerCase();
        return types.equals(reverseString(types));
    }
}
