import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;


        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                String[] tt = s.split("");
                ArrayList<Integer> list = new ArrayList<>();
                for (String sf : tt) {
                    list.add(Integer.parseInt(sf));

                }
                Comparator<Integer> reverseOrder = Collections.reverseOrder();

                Collections.sort(list, reverseOrder);

                for (Integer num : list) {
                    System.out.print(num);
                }

            }
        }