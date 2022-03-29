package Chatty;

// Forum use for creating GUI chat box

import java.awt.BorderLayout;
import java.awt.Dimension;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Forum extends JFrame {
    //Declare GUI vars
    private JFrame frame;
    private JPanel messagePanel;
    private JPanel inputPanel;
    private JTextArea inputText;
    private JButton button;
    private JTextArea textBox;
    private JScrollPane scroll;


    
    public Forum(User u){
        frame = new JFrame(u.getName());
        messagePanel = new JPanel();
        inputPanel = new JPanel();
        inputText = new JTextArea();
        button = new JButton("Send");
        //textBox would receive message from user's send_message list
        textBox = new JTextArea();
        //add those messages into a scrollable pannel.
        scroll = new JScrollPane(textBox);


        //initalize variable
        //main frame
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        //Dispose of the frame object, but keep the application running
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //text box panel
        textBox.setEditable(false);
        scroll.setPreferredSize(new Dimension(400, 400));
        messagePanel.add(scroll);   
        frame.add(messagePanel,BorderLayout.CENTER);
    
        //intput message pannel
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputText, BorderLayout.CENTER);

        //button will implement sendMessage of user
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                //send messgae will take in  
                u.sendMessage(inputText.getText());
                inputText.setText(null);
                Server.GetServer().Process();
            }
        });
        button.setSize(150,150);
        inputPanel.add(button, BorderLayout.EAST);
        frame.add(inputPanel,BorderLayout.SOUTH);


    }

    //textBox will take all the messages from user 
    public void sendToBox(String str){
        textBox.append(str);
    }
    
    

    
}
