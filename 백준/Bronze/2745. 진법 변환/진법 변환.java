import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int base = sc.nextInt();
        
        long result = convertToDecimal(input, base);
        System.out.println(result);
    }
    
    static long convertToDecimal(String input, int base) {
        long result = 0;
        int length = input.length();
        
        for (int i = 0; i < length; i++) {
            char character = input.charAt(i);
            int digitValue;
            
            if (Character.isDigit(character)) {
                digitValue = character - '0';
            } else if (Character.isUpperCase(character)) {
                digitValue = character - 'A' + 10;
            } else {
                throw new IllegalArgumentException("오류 " + character);
            }
            
            if (digitValue >= base) {
                throw new IllegalArgumentException("오류 " + base + ": " + character);
            }
            
            result = result * base + digitValue;
        }
        
        return result;
    }
}
