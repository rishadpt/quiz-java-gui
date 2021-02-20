import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
    
    String[] questions = {
        "which company created cpp?",
        "which year was c++ Created",
        "what was java originally called",
        "who is credited with creating java"
                              };
    String[][] options = {
        {"sun mICROSYSTEm","starbucks","microsoft","Texki"},
        {"1954","1972","1902","1562"},
        {"apple","buttor","umbrella","cc+="},
        {"steve jobs","zuckerbegr","james","ema"},
    };      
       char[] answers = {
           
                'A',
                'B',
                'c'
                 
       } ;
       char guess;
       char answer;
       int index;
       int correct_guesses = 0;
       int total_questions = questions.length;
       int result;
       int seconds = 10;
    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();
    
    
    
    public Quiz(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setResizable(false);
        
        textfield.setBounds(0,0,650,50);
        textfield.setBackground(Color.blue);
        textfield.setForeground(Color.yellow);
        textfield.setFont(new Font("ink Free",Font.BOLD,30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);
        textarea.setText("sample test");
        
        
         
        textfield.setBounds(0,50,650,50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textfield.setBackground(Color.blue);
        textfield.setForeground(Color.yellow);
        textfield.setFont(new Font("MV Boli",Font.BOLD,25));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
 
        textfield.setEditable(false);
    
       buttonA.setBounds(0,100,100,100);
       buttonA.setFont(new Font("MV Boli",Font.BOLD,35));
       buttonA.setFocusable(false);
       buttonA.addActionListener(this);
       buttonA.setText("A");
       buttonB.setBounds(0,200,100,100);
       buttonB.setFont(new Font("MV Boli",Font.BOLD,35));
       buttonB.setFocusable(false);
       buttonB.addActionListener(this);
       buttonB.setText("B");
       buttonC.setBounds(0,300,100,100);
       buttonC.setFont(new Font("MV Boli",Font.BOLD,35));
       buttonC.setFocusable(false);
       buttonC.addActionListener(this);
       buttonC.setText("C");
       
       
       buttonD.setBounds(0,400,100,100);
       buttonD.setFont(new Font("MV Boli",Font.BOLD,35));
       buttonD.setFocusable(false);
       buttonD.addActionListener(this);
       buttonD.setText("D");
       
       answer_labelA.setBounds(125,100,00,100);
       answer_labelA.setBackground(Color.red);
       answer_labelA.setForeground(Color.blue);
       answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35)); 
       answer_labelA.setText("teesting label 1");
       
       answer_labelB.setBounds(125,200,00,100);
   
       answer_labelB.setBackground(Color.red);
       answer_labelB.setForeground(Color.blue);
       answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35)); 
       answer_labelB.setText("teesting label 2");
       
       
       answer_labelC.setBounds(125,300,00,100);
       answer_labelC.setBackground(Color.white);
       answer_labelC.setForeground(Color.green);
       answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35)); 
       answer_labelC.setText("label 1");   
       
       answer_labelD.setBounds(125,400,00,100);
       answer_labelD.setBackground(new Color(25,255,0));
       answer_labelD.setForeground(new Color(25,255,0));
       answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,30)); 
       answer_labelD.setText("teesting label 4");
  
       seconds_left.setBounds(535,510,100,100);
       seconds_left.setBackground(new Color(25,25,25));
       seconds_left.setForeground(new Color(255,0,0));
       seconds_left.setFont(new Font("Ink Free",Font.BOLD,60));
       seconds_left.setBorder(BorderFactory.createBevelBorder(1));
       seconds_left.setOpaque(true);
       seconds_left.setHorizontalAlignment(JTextField.CENTER);
       seconds_left.setText(String.valueOf(seconds));
      
       
       
       
        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
   
        
        
        
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);
        
    }
    public void nextQuestion(){

}
@Override
public void actionPerformed(ActionEvent e){
     
}
public void displayAnswer(){
    
}
public void results(){
    
}
}