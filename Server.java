package Chatty;

import java.util.ArrayList;


public class Server {
    private ArrayList<User> users;
    private static Server server;
    private Forum c;
    //need forum data type here
    
    
    public Server(){
        users = new ArrayList<User>();
        this.server = this;
    }

    public static Server GetServer(){
        return server;
    }

    public void AddUser(User u){
        users.add(u);
    }

    public void Process(){
        for(int i = 0; i < users.size();i++){
            if(users.get(i).hasMessage()){
                DisplayText(users.get(i).getMessage());
            }
        }
    }

    public void DisplayText(String text){
        
    }


    
}
