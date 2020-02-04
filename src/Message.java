public class Message implements MessageInterface {

    public String theMessage;

    public void Message(String s){
        this.theMessage = s;
    }

    public String getMessage(){
        return theMessage;
    }
}
