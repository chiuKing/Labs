package Java_list;

public class Lab4_1 {
    public static void main(String[] args) {
        Animals []ani = new Animals[3];
        ani[0] = new Animals("Cat", 5);
        ani[1] = new Animals("Dog", 10);
        ani[2] = new Animals("Humster", 2);

        for (int i = 0; i < 3; i++){
            System.out.println(ani[i].name);
        }


        for (int i = 0; i < 3; i++){
            System.out.println(ani[i].age);
        }
    }


}

