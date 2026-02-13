import java.util.*;

public class JavaChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Chatbot: Hello! Ask me something.");

        while(true){
            input = sc.nextLine().toLowerCase();

            if(input.contains("hello"))
                System.out.println("Chatbot: Hi there!");

            else if(input.contains("name"))
                System.out.println("Chatbot: I am a Java Chatbot.");

            else if(input.contains("how are you"))
                System.out.println("Chatbot: I am fine!");

            else if(input.contains("bye")){
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            else
                System.out.println("Chatbot: I don't understand.");
        }
    }
}
