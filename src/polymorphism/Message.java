package polymorphism;

class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Message: " + content);
    }
}
