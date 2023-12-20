
package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// for using on click event we use an interface is ActionListner
public class Login extends JFrame implements ActionListener{
    JButton Back,rules;
     JTextField tframe;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/quize2.jpg"));
        // by using od add function we add the iamge on screen 
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,400,400);
        add(image);
     
        JLabel heading = new JLabel("Simple Mind");
        heading.setBounds(700,40,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
                heading.setForeground(new Color(30,144,254));
        add(heading);
        
         JLabel name = new JLabel("Enter your Name");
          name.setBounds(700,100,250,40);
         name.setFont(new Font("Monoglian Baiti",Font.BOLD,15));
                name.setForeground(new Color(30,144,254));
          add(name);
          // text
           tframe= new JTextField();
          tframe.setBounds(630,150,300,25);
          tframe.setFont(new Font("Times new Roman",Font.BOLD,20));
          add(tframe);
          // Button
          rules =new JButton("RULES");
          rules.setBounds(630,180,120,25);
            rules.setBackground(new Color(30,144,254));
            rules.setForeground(Color.YELLOW);
            rules.addActionListener(this);
          add(rules);
          
            Back =new JButton(" Back");
           Back.setBounds(813,180,115,25);
             Back.setBackground(new Color(30,144,254));
             Back.setForeground(Color.YELLOW);
             //this event is use for click ob button 
             Back.addActionListener(this);
          add( Back);
        setSize(1200,400);
        setLocation(200,150);
        
    setVisible(true);
   
   
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            // wo value nikalna hai jo user ne enter kiya hai for this process we get .getText
            String name = tframe.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==Back){
            setVisible(false);
            
        }
    }
public static void main(String[]args){
    new Login();
    }
}