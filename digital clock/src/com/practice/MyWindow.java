package com.practice;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
public class MyWindow extends JFrame 
{
	private JLabel heading;

	private JLabel clocklabel;
		
	private Font font = new Font("",Font.BOLD,35);
	
	MyWindow()
	{
	   super.setTitle("MyClock");
	   super.setSize(400,400);
	   super.setLocation(300,300);
       this.createGUI();
       this.startClock();
	   super.setVisible(true);
	}
	public void createGUI() {
		heading = new JLabel("My Clock");
		clocklabel = new JLabel("clock");
		
		heading.setFont(font);
		clocklabel.setFont(font);
		
		this.setLayout(new GridLayout(3,1));
		this.add(heading);
		this.add(clocklabel);
		
	}
	public void startClock() 
	{
		Timer timer = new Timer(1000,(ActionListener) new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
		
		//	String dateTime = new Date().toString();
			Date d = new Date();
			
			SimpleDateFormat sfd= new SimpleDateFormat("hh : mm : ss : a :M:Y");
			
			String dateTime = sfd.format(d);
			clocklabel.setText(dateTime);
		}
		});
		timer.start();
	}
 


}
