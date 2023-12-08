import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> li_x = new ArrayList<>();
        List<Integer> li_y = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            li_x.add(x);
            li_y.add(y);
        }

        int x = findNonDuplicate(li_x);
        int y = findNonDuplicate(li_y);

        System.out.println(x + " " + y);
    }

    private static int findNonDuplicate(List<Integer> list) {
        int nonDuplicate = 0;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            int value = list.get(i);
            for (int j = 0; j < 3; j++) {
                if (list.get(j) == value) {
                    count++;
                }
            }
            if (count == 1) {
                nonDuplicate = value;
                break;
            }
        }
        return nonDuplicate;
    }
}
