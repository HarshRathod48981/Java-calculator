import java.util.Random;

public class RealisticTypingEffect {
    public static void main(String[] args) throws InterruptedException {
        String message = "This feels like real typing acc to chat gpt but idk if this feels like it thats why i am typing more to see it properly";
        Random rand = new Random();

        for (char c : message.toCharArray()) {
            System.out.print(c);
            Thread.sleep(30 + rand.nextInt(40)); // Varies between 30-70ms
            System.out.flush();
        }
        System.out.println();
    }
}