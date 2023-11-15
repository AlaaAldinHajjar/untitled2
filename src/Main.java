
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);

            String[] input = new String(buffer).split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(a / b);
        } catch(FileNotFoundException e) {
            System.out.println("input file is not found");
        } catch(NumberFormatException e) {
            System.out.println("error during parsing integer");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("file has less than two integers");
        } catch(ArithmeticException e) {
            System.out.println("divide by zero");
        } catch(IOException e) {
            System.out.println("error during I/O operations");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
