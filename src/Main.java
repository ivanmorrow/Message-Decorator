import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("What file would you like to use:");
        String fileName = scan.nextLine();
        File inFile = new File("C:\\Documents\\boundedstrategy-ivanmorrow\\src\\"+fileName);
        Scanner sc = new Scanner(inFile);
        while (sc.hasNext()) {
            Message message = null;
            message.Message(sc.nextLine());
            //Message message = sc.nextLine();
            String[] decoratorType = sc.nextLine().split(" ");
            int key;


            if (decoratorType[0].equals("Encrypted")) {
                key = Integer.parseInt(decoratorType[1]);
                EncryptedMessageDecorator newMessage = new EncryptedMessageDecorator(message, key);
                System.out.println("Original Message: "+ message);
                System.out.println("\nNew Message: "+ newMessage);
            } else if (decoratorType[0].equals("Angry")) {
                AngryMessageDecorator newMessage = new AngryMessageDecorator(message);
                System.out.println("Original Message: "+ message);
                System.out.println("\nNew Message: "+ newMessage);
            } else if (decoratorType[0].equals("Binary")) {
                BinaryMessageDecorator newMessage = new BinaryMessageDecorator(message);
                System.out.println("Original Message: "+ message);
                System.out.println("\nNew Message: "+ newMessage);
            } else {
                SMSMessageDecorator newMessage = new SMSMessageDecorator(message);
                System.out.println("Original Message: "+ message);
                System.out.println("\nNew Message: "+ newMessage);
            }
        }
    }
}
