package bank.management.system;

/**
 *
 * @author kavya
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Transactions extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,mstatement,pinchange,fastcash,balance,exit;
    String pinnumber;
    Transactions(String pinnumber){
        
        this.pinnumber=pinnumber;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction...");
        text.setBounds(200,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,380,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash withdrawl");
        withdrawl.setBounds(355,380,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,415,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        mstatement = new JButton("Mini Statement");
        mstatement.setBounds(355,415,150,30);
        mstatement.addActionListener(this);
        image.add(mstatement);
        
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,450,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balance = new JButton("Balance Enquiry");
        balance.setBounds(355,450,150,30);
        balance.addActionListener(this);
        image.add(balance);
        
        exit = new JButton("Exit");
        exit.setBounds(355,485,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setTitle("ATM");
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource() == fastcash){
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource() == balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource() == mstatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Transactions("");
    }
}
