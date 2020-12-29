import java.util.ArrayList;
import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> gcdArrayList = new ArrayList<>();
        ArrayList<Integer> lcmArrayList = new ArrayList<>();

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int input_int = Integer.parseInt(input);
        arrayList.add(input_int);

        while (!input.equals("stop")) {
            try {
                input = reader.nextLine();
                input_int = Integer.parseInt(input);
                arrayList.add(input_int);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("I'm done");
            }
        }

        while (arrayList.size() != 2){
            try
            {
                for (int i = 0; i < 2; i++){
                    gcdArrayList.add((int) gcd(arrayList.get(i), arrayList.get(i+1)));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }


            arrayList.remove(0);
        }

        while (arrayList.size() != 2){
            try {
                for (int i = 0; i < 2; i++){
                    lcmArrayList.add((int) lcm(arrayList.get(i), arrayList.get(i+1)));
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            arrayList.remove(0);
        }

        int gcdLastE = (int) gcd(arrayList.get(0), arrayList.get(1));
        int gcdLastE1 = gcdArrayList.get(gcdArrayList.size()-1);


//        int lcmLastE = (int) lcm(arrayList.get(0), arrayList.get(1));
//        int lcmLastE1 = lcmArrayList.get(lcmArrayList.size()-1) ;

        System.out.println(gcdArrayList);
        System.out.println(lcmArrayList);
        System.out.println(arrayList);

        System.out.println(gcd(gcdLastE, gcdLastE1 ));
//        System.out.println(lcm(lcmLastE, lcmLastE1));
    }
    private static long gcd (long a, long b) {
        while (b > 0 ){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }


}
