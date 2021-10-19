package Chatty;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;




public class Forum {
    //Declare GUI vars
    public JFrame frame;
    public JPanel messagePanel;
    public JPanel inputPanel;
    public JTextArea textArea;
    public JButton button;
    public JScrollPane scroll;

    


    public Forum(User u){
        //initalize variable
        scroll = new JScrollPane();

        //main frame
        frame = new JFrame("Chatty");

        //message panel
        messagePanel = new JPanel();
        messagePanel.setBackground(Color.white);
        messagePanel.add(scroll);


        //message pannel
        inputPanel = new JPanel();
        inputPanel.setBackground(Color.white);
        inputPanel.add(textArea);

        //button
        button = new JButton("Send");
        button.setBounds(50,100,80,30);   

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                u.sendMessage(textArea.getText());
                textArea.setText("");
                Server.GetServer().Process();;
            }
        });
        
        

    }
    


    
}
