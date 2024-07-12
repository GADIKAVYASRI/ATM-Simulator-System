/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author kavya
 */

public class SignUpTwo extends JFrame implements ActionListener {
    
  
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser dateChooser;
    JComboBox religion,category,occupation,education,income;
    String formno;
    SignUpTwo(String formno){
        
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        
        JLabel AdditionalDetails =new JLabel("2.ADDITIONAL DETAILS: ");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,25));
        AdditionalDetails.setBounds(290,80,350,30);
        add(AdditionalDetails);
        
        JLabel name =new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Christian","Other"};
        religion =new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname =new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCat[]={"General","OBC","SC","ST","Other"};
        category =new JComboBox(valCat);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);     
                                
        JLabel dob =new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,100,30);
        add(dob);
        
        String IncomeCat[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income =new JComboBox(IncomeCat);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender =new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
            
        JLabel email =new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String EduVal[]={"Graduate","Under-Graduate","Post-Graduate","Doctrate","Other"};
        education =new JComboBox(EduVal);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        
        JLabel mStatus =new JLabel("Occupation:");
        mStatus.setFont(new Font("Raleway",Font.BOLD,20));
        mStatus.setBounds(100,390,200,30);
        add(mStatus);
        
        String OccVal[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation =new JComboBox(OccVal);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
       
        JLabel address =new JLabel("PAN No:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel city =new JLabel("Aadhar no:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        
        JLabel state =new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
        
        JLabel pincode =new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
        
        
        next =new JButton("Next");
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      
       
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation= (String) education.getSelectedItem();
        String soccupation= (String) occupation.getSelectedItem();
        String seniorcitizen= null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }else if(eno.isSelected()){
            existingaccount="No";
        }
        String span=panTextField.getText();
        String saadhar=aadharTextField.getText();
        
        
        try{
                Conn c=new Conn();
                String query = "insert into signuptwo values('"+ formno +"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                //'" "'->considers the following variable as a strng.
                c.s.executeUpdate(query);
                //SignUpThree object
                setVisible(false);
                new SignUpThree(formno).setVisible(true); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignUpTwo("");
        
    }
}
