package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */

public class Shouter {
    private String message;

    // Constructor
    public Shouter(String msg) {
        this.message = msg;
    }

    // Getter
    public String getMessage() {
        return this.message;
    }

    // Setter
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    // printMe
    public void printMe() {
        System.out.println(this.message);
    }

    // shout
    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hi");
        s.printMe();
        // System.out.println(s.getMessage());
        s.setMessage("This is a new message");
        s.printMe();
        // System.out.println(s.getMessage());
        s.shout();
    }
}
