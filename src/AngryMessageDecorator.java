public class AngryMessageDecorator extends MessageDecorator {
    public AngryMessageDecorator(Message newMessage) {
        super(newMessage);

        System.out.println("Changing message to all uppercase\n");
    }

    @Override
    public void Message(String s) {

    }

    public String getMessage() {

        return m.getMessage().toUpperCase();
    }
}
