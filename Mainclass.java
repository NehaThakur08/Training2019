package com.neha.table;

	import java.awt.event.*;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;
	import javax.swing.*;

	public class Mainclass extends JFrame{
	 JLabel JL_fname,JL_lname,JL_phone,JL_id;
	 JTextField JT_fname,JT_lname,JT_phone,JT_id;
	 JButton btn_insert,btn_update,btn_delete;
	 
	 public Mainclass() {
	     super("INSERT UPDATE DELETE");
	     JL_id = new JLabel("Id:");
	     JL_fname = new JLabel("Fname:");
	     JL_lname = new JLabel("Lname:");
	     JL_phone = new JLabel("Phone:");
	     JL_id.setBounds(20, 20, 100, 20);
	     JL_fname.setBounds(20, 50, 100, 20);
	     JL_lname.setBounds(20, 80, 100, 20);
	     JL_phone.setBounds(20, 110, 100, 20);
	     
	     JT_id = new JTextField(20);
	     JT_fname = new JTextField(20);
	     JT_lname = new JTextField(20);
	     JT_phone = new JTextField(20);
	     JT_id.setBounds(130,20,150,20);
	     JT_fname.setBounds(130, 50, 150, 20);
	     JT_lname.setBounds(130, 80, 150, 20);
	     JT_phone.setBounds(130, 110, 150, 20);
	     btn_insert = new JButton("Insert");
	     btn_update = new JButton("Update");
	     btn_delete = new JButton("Delete");
	     btn_insert.setBounds(300, 50, 80, 20);
	     btn_update.setBounds(300, 80, 80, 20);
	     btn_delete.setBounds(300, 110, 80, 20);
	     
	     
	     setLayout(null);
	     add(JL_id);
	     add(JL_fname);
	     add(JL_lname);
	     add(JL_phone);
	     add(JT_id);
	     add(JT_fname);
	     add(JT_lname);
	     add(JT_phone);
	     add(btn_insert);
	     add(btn_update);
	     add(btn_delete);
	     
	     

	   //button insert
	    btn_insert.addActionListener(new  ActionListener() {

	         public void actionPerformed(ActionEvent e) {
	         try{
	             theQuery("insert into customerdetails (fname,lname,phone) values('"+JT_fname.getText()+"','"+JT_lname.getText()+"',"+JT_phone.getText()+")");
	         }
	         catch(Exception ex){}
	         }
	     });
	    
	        //button update
	        btn_update.addActionListener(new  ActionListener() {

	         public void actionPerformed(ActionEvent e) {
	         try{
	         
	           theQuery("update customerdetails set fname = '"+JT_fname.getText()+"',lname = '"+JT_lname.getText()+"', phone = "+JT_phone.getText()+" where id = "+JT_id.getText());
	         }
	         catch(Exception ex){}
	         }
	     });
	       
	         //button delete
	        btn_delete.addActionListener(new  ActionListener() {

	         public void actionPerformed(ActionEvent e) {
	         try{
	          
	             theQuery("delete from customerdetails where id = "+JT_id.getText());
	         }
	         catch(Exception ex){}
	         }
	     });
	     
	     
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setVisible(true);
	     setLocationRelativeTo(null);
	     setSize(500,200);
	    
	 }
	 


	 //function to execute the insert update delete query
	  public void theQuery(String query){
	      Connection con = null;
	      Statement st = null;
	      try{
	          con = DriverManager.getConnection("jdbc:mysql://localhost/auribisestraining2019","root","");
	          st = con.createStatement();
	          st.executeUpdate(query);
	          JOptionPane.showMessageDialog(null,"Query Executed");
	      }catch(Exception ex){
	          JOptionPane.showMessageDialog(null,ex.getMessage());
	      }
	  }
	 
	 
	     public static void main(String[] args){
	     
	         new  Mainclass();
	     }
	}

