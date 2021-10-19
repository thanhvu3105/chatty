package Chatty;

public class main{
    public static void main(String[] args){
        Server server = new Server();
        User user1 = new User("John");
        server.AddUser(user1);
        User user2 = new User("Matt");
        server.AddUser(user2);
        server.Process();
    }
}