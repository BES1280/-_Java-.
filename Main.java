import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите два числа: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double a = 0, b = 0, result = 0;
            try {
                a = Integer.parseInt(reader.readLine());
                b = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Введите знак операции: ");
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String sing = "";
            try {
                sing = read.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            switch (sing) {
                case "+": {
                    result = a + b;
                    break;
                }
                case "-": {
                    result = a - b;
                    break;
                }
                case "*": {
                    result = a * b;
                    break;
                }
                case "/": {
                    result = a / b;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}