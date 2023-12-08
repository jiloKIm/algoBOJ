import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Queue<String> q = new LinkedList<>();

        while (true){
            Set<Integer> uniqueElements = new HashSet<>();
            List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }
        int sum = numbers.stream()
                    .mapToInt(Integer::intValue) // 정수로 변환
                    .sum();
        if(sum==0){
            break;
        }



        int count = 0;

        for (Integer number : numbers) {
            if (!uniqueElements.add(number)) {
                count += 1;
            }
        }
        Collections.sort(numbers);


        if (numbers.get(2) < numbers.get(0) + numbers.get(1)) {

            if (count == 2) {
                q.add("Equilateral");


            } else if (count == 1) {
                q.add("Isosceles");

            } else {
                q.add("Scalene");
            }

        }
        else {
            q.add("Invalid");
        }
    }
        for (String s :q) {
            System.out.println(s);

        }








    }


}
