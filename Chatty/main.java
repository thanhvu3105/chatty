package Chatty;


public class main{
    public static void main(String[] args){
        System.out.println("HELLOOO");
        Server server = new Server();
        User user1 = new User("Luke the Molester");
        server.AddUser(user1);
        User user2 = new User("Matt the Fucked");
        server.AddUser(user2);
        User user3 = new User("Gay Lord");
        server.AddUser(user3);
    }
}