package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestaoCinco {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Character> list = new ArrayList<>();
       
        System.out.print("Enter the word you want to reverse: ");
        String text = scanner.next();

        for (char letra : text.toCharArray()) {
            list.add(letra);
        }

        reverseCharacters(list);

        scanner.close();
    }

    public static void reverseCharacters(List<Character> list){
        List<Character> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        ReversePrint(reversedList);
    }

    public static void ReversePrint(List<Character> list){
        System.out.print("Reversed word: ");
        for (Character character : list) {
            System.out.print(character);
        }
        System.out.println();
    }
}
