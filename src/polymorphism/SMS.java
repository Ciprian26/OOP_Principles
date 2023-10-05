package polymorphism;

class SMS extends Message {
    private String phoneNumber;

    public SMS(String phoneNumber, String content) {
        super(content);
        this.phoneNumber = phoneNumber;
    }

    public void display(boolean includePhoneNumber) {
        if (includePhoneNumber) {
            System.out.println("SMS to " + phoneNumber);
            super.display();
        } else {
            super.display();
        }
    }
}
