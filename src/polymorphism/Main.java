package polymorphism;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("sender@example.com", "recipient@example.com", "Hello, how are you?");
        SMS sms = new SMS("+123456789", "Hi there!");

        email.display();

        sms.display(true);
        sms.display();
    }
}
