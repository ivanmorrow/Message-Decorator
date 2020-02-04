public class SMSMessageDecorator extends MessageDecorator {
    public int msgSize = 3;

    public SMSMessageDecorator(Message newMessage) {
        super(newMessage);

        System.out.println("Changing message to SMS");
    }

    public String segment(String s){
        String temp = "";
        int i = 0;
        while (i <= s.length()){
            for (int n = 0; i <= 2; i++){
                temp += s.charAt(i);
            }
            temp+="...\n";
        }
        return temp;
    }

    @Override
    public String getMessage() {
        return segment(m.getMessage());
    }

    @Override
    public void Message(String s) {

    }
}
