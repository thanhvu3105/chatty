package Chatty;


import java.util.ArrayList;



public class Server {
    private ArrayList<User> users;
    private static Server server;

    //constructor
    public Server(){
        users = new ArrayList<User>();
        Server.server = this;
    }

    //Get instance of the server
    public static Server GetServer(){
        return server;
    }

    //Add users to the server system
    public void AddUser(User u){
        users.add(u);
    }

    //Process will check if each user's message list,
    //if message is availabe, get the most recent message.
    //and send it to everybody with DisplayText as helper
    public void Process(){
        for(int i = 0; i < users.size();i++){
            if(users.get(i).getSendMessage().size() > 0){
                DisplayText(users.get(i).getMessage());
            }
        }
    }

    //Iterate through every user's chatbox again to print all of the messages 
    public void DisplayText(String text){
        for(int i = 0; i < users.size();i++){
            users.get(i).DisplayToBox(text);
        }
    }




    
}
