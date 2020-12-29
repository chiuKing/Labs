import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        ArrayList <Integer> arrayListEvenNumber = new ArrayList<>();
        ArrayList <Integer> arrayListOddNumber = new ArrayList<>();

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int input_int = Integer.parseInt(input);
        arrayList.add(input_int);

        while (!input.equals("stop")) {
            try {
                input = reader.nextLine();
                input_int = Integer.parseInt(input);
                arrayList.add(input_int);
            }
            catch (NumberFormatException numberFormatException) {
                System.out.println("I'm done");
            }
        }
        int n = arrayList.size();

        for (int i = 0; i < n; i = i + 1 ) {
            if (arrayList.get(i) % 2 == 0) {
                arrayListEvenNumber.add(arrayList.get(i));
            }
            else {
                arrayListOddNumber.add(arrayList.get(i));
            }
        }
        System.out.println(arrayList);
        System.out.println(n);

        System.out.println("Even numbers:" + arrayListEvenNumber);
        System.out.println("Odd numbers:" + arrayListOddNumber);
    }
}
