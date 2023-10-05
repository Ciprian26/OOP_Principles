package polymorphism;

class Email extends Message {
    private String sender;
    private String recipient;

    public Email(String sender, String recipient, String content) {
        super(content);
        this.sender = sender;
        this.recipient = recipient;
    }

    @Override
    public void display() {
        System.out.println("Email from " + sender + " to " + recipient);
        super.display();
    }
}
