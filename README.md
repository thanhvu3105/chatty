 	

User1: Enter the chat
User2: Enter the chat





JAVA CHATTY ASSIGNMENT

DESIGN PATTERN: PUB / SUB 

CLASS TO HAVE: MAIN, SERVER, USER, FORUM

EACH USERS WOULD HAVE THEIR OWN DIFFERENCE MESSAGE BOX.
EVERY TIME USER INPUT THE MESSAGE, MESSAGE IS SEND TO SERVER
SERVER WILL ROUTE THOSE MESSAGE TO EVEY USER'S MESSAGE BOX THAT 
CONTAINS SENDER'S NAME AND ITS MESSAGE
              _____
        USER1      |
             \     |
              \    |
               \   |
                \  |
	      SERVER
                /  |           
	       /   |    
              /    |
             /     |
	USER3 _____|
	



CLASS DESGIN

   MAIN 
- CREATE SERVER INSTANCE
- CREATE CLIENT INSTANCE
   for eg.  Client a = new CLient("John"); 
	    Client b = new CLient("Cena");
- RUN SERVER AND CONNECT CLIENT. 

 
   USER
NOTE: every user will borrow object "chatbox" from FORUM class that implements GUI interface

- Variable: (string)name, (list)list of send_messages,(list)list of receive_messages, ChatBox
- Constructor:
    + initialize the name
    + initialize the list of send_messages
    + initlalize the list of receive_messages
    + message that "user" join the chatbox - let's call it JoinChat() for now
- Methods:
   + JoinChat() - return "user" join the chat.
   + send() - add message to list of send_messages.
   + get() - get message from list of send_messages.
   + hasMessage() - check if user has messages in the list of send_messages
   + display() - diplay send_messages back to user.
 
 
	 
  SERVER
- Variable: (list)list of users, Server(data type) server, 
- Constructor: 
  + Initalize server 
  + Initalize list of users
- Methods:
  + AddUsers() - add user create (User data type)
  + Process()
     - Loop through all clients check through the list of users, if user ith has message, User get() is implemented to get those message.
     - Call DisplayMessage with those message with parameter as get() method. 
  + DisplayMessage() 
     - display text string type back to User class
 

  FORUM
- Implements GUI shits. 







 