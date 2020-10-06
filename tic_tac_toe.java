import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class tic_tac_toe extends Applet implements ActionListener
{
  String msg;
  TextField information;
   String turn_on="player1";
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
  Color mine;
  Font f1=new Font("Helvetica",Font.BOLD,20);
  public void init()
  {

    Frame f= new Frame("TIC-TAC-TOE");
    Frame f1= new Frame("Player Information");
    Panel container =new Panel(); //Panel creation 
  	Panel container1 =new Panel(); //Panel creation 
    
    container.setBounds(40,80,200,200); 
    container1.setBounds(40,80,200,200); 
    information=new TextField(35);
    information.setText("Player 1-X");
    information.setEditable(false);
    b1=new Button( );  
  	b2=new Button( );   
  	b3=new Button( );
  	b4=new Button( );
  	b5=new Button( );     //Button creation
  	b6=new Button( );
  	b7=new Button( );
  	b8=new Button( );
  	b9=new Button( );  
   	
    container.setLayout(new GridLayout(3,3));
    
    f.add(container);  
    f.setSize(300,300);        
    f.setVisible(true);    
    f1.add(container1);
    f1.setSize(300,300);
    f1.setVisible(true);
  	   //grid layout set
    

  	b1.setPreferredSize(new Dimension(40, 40));
  	b2.setPreferredSize(new Dimension(40, 40));
  	b3.setPreferredSize(new Dimension(40, 40));
  	b4.setPreferredSize(new Dimension(40, 40));
  	b5.setPreferredSize(new Dimension(40, 40));      //Button size
  	b6.setPreferredSize(new Dimension(40, 40));   
  	b7.setPreferredSize(new Dimension(40, 40));
  	b8.setPreferredSize(new Dimension(40, 40));
  	b9.setPreferredSize(new Dimension(40, 40));
  	

    container.add(b1);
  	container.add(b2);
  	container.add(b3);
  	container.add(b4);       //add button
  	container.add(b5);
  	container.add(b6);
  	container.add(b7);
  	container.add(b8);
  	container.add(b9); 
    container1.add(information);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);


    b1.setFont(this.f1);
    b2.setFont(this.f1);
    b3.setFont(this.f1);
    b4.setFont(this.f1);
    b5.setFont(this.f1);
    b6.setFont(this.f1);
    b7.setFont(this.f1);
    b8.setFont(this.f1);
    b9.setFont(this.f1);
   }
public void actionPerformed(ActionEvent ae)
 {
    int flag=0,flag1=1;
    this.mine =new Color(72, 61, 139);
    Object response=ae.getSource();
    

    
    //Button 1
    if(response==b1)
    { 
      if(turn_on=="player1")
      {
        b1.setLabel("X");
        b1.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b1.setBackground(Color.black);
      }
      else if(turn_on=="player2")
      {
        b1.setLabel("O");
        b1.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b1.setBackground(mine);
        }     
    }


    //Button-2
    if(response==b2)
    { 
      if(turn_on=="player1")
      {
        b2.setLabel("X");
        b2.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b2.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b2.setLabel("O");
        b2.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b2.setBackground(mine);
        
      }     
    }




    //Button-3
     
    if(response==b3)
    { 
      if(turn_on=="player1")
      {
        b3.setLabel("X");
        b3.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b3.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b3.setLabel("O");
        b3.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b3.setBackground(mine);
        
      }     
    }


    //Button-4

    if(response==b4)
    { 
      if(turn_on=="player1")
      {
        b4.setLabel("X");
        b4.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b4.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b4.setLabel("O");
        b4.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b4.setBackground(mine);
      }     
    }


    //Button-5

    if(response==b5)
    { 
      if(turn_on=="player1")
      {
        b5.setLabel("X");
        b5.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b5.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b5.setLabel("O");
        b5.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b5.setBackground(mine);
      }     
    }


   //Button-6
   
   if(response==b6)
    { 
      if(turn_on=="player1")
      {
        b6.setLabel("X");
        b6.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b6.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b6.setLabel("O");
        b6.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b6.setBackground(mine);
      }     
    }

   
   //Button-7
   
   if(response==b7)
    { 
      if(turn_on=="player1")
      {
        b7.setLabel("X");
        b7.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b7.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b7.setLabel("O");
        b7.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b7.setBackground(mine);
      }     
    }
   
   //Button-8
    
    if(response==b8)
    { 
      if(turn_on=="player1")
      {
        b8.setLabel("X");
        b8.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b8.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b8.setLabel("O");
        b8.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b8.setBackground(mine);
      }     
    }
   
   //Button-9
   
   if(response==b9)
    { 
      if(turn_on=="player1")
      {
        b9.setLabel("X");
        b9.setEnabled(false);
        information.setText("Player2-O");
        this.turn_on="player2";
        b9.setBackground(Color.black);
        
      }
      else if(turn_on=="player2")
      {
        b9.setLabel("O");
        b9.setEnabled(false);
        information.setText("Player1-X");
        this.turn_on="player1";
        b9.setBackground(mine);
      }     
    }



//Winning script

/**FIRST CHECK 1-4-7**/
 if((b1.getLabel()==b4.getLabel())&&(b4.getLabel()==b7.getLabel()))
 {
  information.setFont(this.f1);
  if((b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b1.getLabel()=="O"&&b4.getLabel()=="O"&&b7.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }

/**SECOND CHECK 1-5-9**/
else if((b1.getLabel()==b5.getLabel())&&(b5.getLabel()==b9.getLabel()))
 {
  information.setFont(this.f1);
  if((b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b1.getLabel()=="O"&&b5.getLabel()=="O"&&b9.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }

/**THIRD CHECK 1-2-3**/
 else if((b1.getLabel()==b2.getLabel())&&(b2.getLabel()==b3.getLabel()))
 {
  information.setFont(this.f1);
  if((b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b1.getLabel()=="O"&&b2.getLabel()=="O"&&b3.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }

/**FOURTH CHECK 2-5-6**/
else if((b2.getLabel()==b5.getLabel())&&(b5.getLabel()==b6.getLabel()))
 {
  information.setFont(this.f1);
  if((b2.getLabel()=="X"&&b5.getLabel()=="X"&&b6.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b2.getLabel()=="O"&&b5.getLabel()=="O"&&b6.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }
 //**FIFTH CHECK 4-5-6 **/
 else if((b4.getLabel()==b5.getLabel())&&(b5.getLabel()==b6.getLabel()))
 {
  information.setFont(this.f1);
  if((b4.getLabel()=="X"&&b5.getLabel()=="X"&&b6.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b4.getLabel()=="O"&&b5.getLabel()=="O"&&b6.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }
 //**SIXTH CHECK 7-8-9 **/
 else if((b7.getLabel()==b8.getLabel())&&(b8.getLabel()==b9.getLabel()))
 {
  information.setFont(this.f1);
  if((b7.getLabel()=="X"&&b8.getLabel()=="X"&&b9.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b7.getLabel()=="O"&&b8.getLabel()=="O"&&b9.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }

/**SEVENTH CHECK 3-6-9**/
else if((b3.getLabel()==b6.getLabel())&&(b6.getLabel()==b9.getLabel()))
 {
  information.setFont(this.f1);
  if((b3.getLabel()=="X"&&b6.getLabel()=="X"&&b9.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b3.getLabel()=="O"&&b6.getLabel()=="O"&&b9.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }
 /**EIGHT CHECK 7-5-3**/
 else if((b7.getLabel()==b5.getLabel())&&(b5.getLabel()==b3.getLabel()))
 {
  information.setFont(this.f1);
  if((b7.getLabel()=="X"&&b5.getLabel()=="X"&&b3.getLabel()=="X"))
  information.setText("Player 1 Won!!");
  else if((b7.getLabel()=="O"&&b5.getLabel()=="O"&&b3.getLabel()=="O"))
  information.setText("Player 2 WON!!");
 }
 }

}





/*<applet code=tic_tac_toe.class width=600 height=600> </applet>*/
