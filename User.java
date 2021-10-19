package Chatty;


import java.util.ArrayList;

public class User {
    public String name;
    public String msg;
    public ArrayList<String> send_messages;
    public ArrayList<String> received_messages;
    
    public User(String name){
        this.name = name;
        send_messages = new ArrayList<String>();
        received_messages = new ArrayList<String>();

    }

    public void sendMessage(String text){
        send_messages.add(text);
    }

    public String getMessage(){
        return send_messages.get(0);
    }
    public boolean hasMessage(){
        if(send_messages.size() == 0){
            return false;
        }
        else{
            return true;
        }
    }


}
