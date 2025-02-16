public class AnimatedText {
    public static void main(String[] args) throws InterruptedException {
        String message = "Hello, this is an animated text!";

        for (char c : message.toCharArray()) {
            System.out.print(c);
            Thread.sleep(110); // Delay of 100ms between characters
            System.out.flush(); // Ensures smooth printing
        }
        System.out.println(); // Move to next line after printing
    }
}
