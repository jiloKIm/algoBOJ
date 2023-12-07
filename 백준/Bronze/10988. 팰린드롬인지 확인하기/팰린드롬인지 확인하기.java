import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] list = input.split("");
        int length=input.length()/2;
        int fail=0;
        for(int i=0;i<length;i++){
            if (list[i].equals(list[input.length() - i - 1])) {
                continue;
            } else {
                fail += 1;
                break;
            }

            }
        if(fail>0)
        {

            System.out.println("0");
        }
        else{
            System.out.println("1");
        }

        }

    }
