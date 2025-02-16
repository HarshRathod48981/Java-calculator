public class TypingEffect {
    public static void main(String[] args) throws InterruptedException {
        String message = "Exiting calculator...";

        for (int i = 0; i <= message.length(); i++) {
            System.out.print("\r" + message.substring(0, i));
            Thread.sleep(90);
        }

        System.out.println(); // Move to next line after animation
    }

}
