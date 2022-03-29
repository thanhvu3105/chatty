package Chatty;


//User name

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<String> send_messages;
    public Forum f;
    
    //Constructor takes in the user's name, create Forum instance that takes in User data type and initialize send_messages
    public User(String name){
        this.name = name;
        send_messages = new ArrayList<String>();
        f = new Forum(this);
    }

    public String getName(){
        return name;
    }
   

    public void sendMessage(String text){
        send_messages.add(name + " : " + text + "\n");
    }

    //send message accesor
    public ArrayList<String> getSendMessage(){
        return send_messages;
    }

    //every messages that sent would be display to every users.
    //so send_messages elements would be send to Forum GUI.
    public String getMessage(){
        String returnString = send_messages.get(0);
        send_messages.remove(0);
        return returnString;
    }
   
    //Send message to Forum class to implement in GUI.
    public void DisplayToBox(String text){
        f.sendToBox(text);
    }

}
