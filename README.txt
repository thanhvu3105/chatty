 	

JAVA CHATTY ASSIGNMENT

DESIGN PATTERN: PUB / SUB 

CLASS TO HAVE: MAIN, SERVER, USER, FORUM

EACH USERS WOULD HAVE THEIR OWN DIFFERENCE MESSAGE BOX.
EVERY TIME USER INPUT THE MESSAGE, MESSAGE IS SEND TO SERVER THROUGH FORUM, SERVER WOULD START TO PROCESS AND PRINT OUT THE MESSAGE TO THE OUTPUT MESSAGE BOX.
     

      USER -------> FORUM 
         \             |
           \           |
             \         |
               \       ||
                 \
                   \ SEREVER



CLASS DESGIN

   MAIN 
- CREATE SERVER INSTANCE
- CREATE CLIENT INSTANCE
   for eg.  Client a = new CLient("John"); 
	    Client b = new CLient("Matt");


 
   USER
NOTE: every user will borrow object "chatbox" from FORUM class that implements GUI interface

- Variable: (string)name, (list)list of send_messages, Forum instance for each user
- Constructor:
    + initialize the name
    + initialize the list of send_messages
    + initlalize the list of receive_messages
    + create new instance of Forum class with that particular user as cosntructor parameter ->  everytime a user's instance is created, a new Jframe is created for that user.
- Methods:
   + sendMessage() - add message to list of send_messages.
   + getMessage() - get message from list of send_messages.
   + displayToBox() - send the user's message to the Forum.
 
   
	 
  SERVER
- Variable: (list)list of users, Server(data type) server, 
- Constructor: 
  + Initalize server 
  + Initalize list of users
- Methods:
  + AddUsers() - add user create (User data type)
  + static GetServer() - this would get a common instance across all classes.
  + Process()
     - Loop through all clients check through the list of users, if user ith has message, User get() is implemented to get those message.
  + DisplayMessage() 
      -  Loop through all the clients and print every messages to the box, 
   
 

  FORUM

- implements GUI components such as frame, panels, scroll. 
- Run the server withtin this GUI.







 