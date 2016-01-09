package com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Gui  extends JFrame{
 
	private JTextField answerfield;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton add;
	private JButton subtract;
	private JButton multiply;
	private JButton divide;
	private JButton equals;
	private String stemp1;
	private String stemp2;
	private String sanswer;
	private double answer=0.0;
	private JPanel contentpanel;
	private boolean opchosen=false,upchosen=false,equalsClicked=false;
	private char operation;
	public Gui() { 
		super("Calculator");
		
		answerfield=new JTextField(null,20);
		one=new JButton("1");
		two=new JButton("2");
		three=new JButton("3");
		four=new JButton("4");
		five=new JButton("5");
		six=new JButton("6");
		seven=new JButton("7");
		eight=new JButton("8");
		nine=new JButton("9");
		divide=new JButton("/");
		zero=new JButton("0");
		multiply =new JButton("*");
		subtract=new JButton("-");
		add=new JButton("+");
		equals=new JButton("=");
		
		
		Numbers n=new Numbers();
		Calc c=new Calc();
		
		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		zero.addActionListener(n);
		
		add.addActionListener(c);
		subtract.addActionListener(c);
		multiply.addActionListener(c);
		divide.addActionListener(c);
		equals.addActionListener(c);
		
		Dimension d=new Dimension(75,25);
		one.setPreferredSize(d);
		two.setPreferredSize(d);
		three.setPreferredSize(d);
		four.setPreferredSize(d);
		five.setPreferredSize(d);
		six.setPreferredSize(d);
		seven.setPreferredSize(d);
		eight.setPreferredSize(d);
		nine.setPreferredSize(d);
		zero.setPreferredSize(new Dimension(210,25));
		add.setPreferredSize(new Dimension(100,25));
		subtract.setPreferredSize(new Dimension(100,25));
		multiply.setPreferredSize(new Dimension(100,25));
		divide.setPreferredSize(new Dimension(100,25));
		equals.setPreferredSize(new Dimension(200,25));
		contentpanel=new JPanel();
		
		contentpanel.setLayout(new FlowLayout());
		
		contentpanel.add(answerfield,BorderLayout.NORTH);
		contentpanel.add(one);
		contentpanel.add(two);
		contentpanel.add(three);
		contentpanel.add(four);
		contentpanel.add(five);
		contentpanel.add(six);
		contentpanel.add(seven);
		contentpanel.add(eight);
		contentpanel.add(nine);
		contentpanel.add(zero);
		contentpanel.add(add);
		contentpanel.add(subtract);
		contentpanel.add(multiply);
		contentpanel.add(divide);
		contentpanel.add(equals);
		
		this.setContentPane(contentpanel);
	}

private class Numbers   implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("In Numbers Action Performed *** ");
		JButton src =(JButton) e.getSource();
		
		if(src.equals(one)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="1";
					}
				else{
					stemp1+="1";
					}
			}
			else{
				if(stemp2==null){
					stemp2="1";
				}
				else{
					stemp2+="1";
				}
			}
		}
		if(src.equals(two)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="2";
				}
				else{
					stemp1+="2";
				}
			}
			else{
				if(stemp2==null){
					stemp2="2";
				}
				else{
					stemp2+="2";
				}
			}
		}
		if(src.equals(three)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="3";
				}
				else{
					stemp1+="3";
				}
			}
			else{
				if(stemp2==null){
					stemp2="3";
				}
				else{
					stemp2+="3";
				}
			}
		}
		
		if(src.equals(four)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="4";
				}
				else{
					stemp1+="4";
				}
			}
			else{
				if(stemp2==null){
					stemp2="4";
				}
				else{
					stemp2+="4";
				}
			}
		}if(src.equals(five)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="5";
				}
				else{
					stemp1+="5";
				}
			}
			else{
				if(stemp2==null){
					stemp2="5";
				}
				else{
					stemp2+="5";
				}
			}
		}if(src.equals(six)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="6";
				}
				else{
					stemp1+="6";
				}
			}
			else{
				if(stemp2==null){
					stemp2="6";
				}
				else{
					stemp2+="6";
				}
			}
		}if(src.equals(seven)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="7";
				}
				else{
					stemp1+="7";
				}
			}
			else{
				if(stemp2==null){
					stemp2="7";
				}
				else{
					stemp2+="7";
				}
			}
		}if(src.equals(eight)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="8";
				}
				else{
					stemp1+="8";
				}
			}
			else{
				if(stemp2==null){
					stemp2="8";
				}
				else{
					stemp2+="8";
				}
			}
		}
		if(src.equals(nine)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="9";
				}
				else{
					stemp1+="9";
				}
			}
			else{
				if(stemp2==null){
					stemp2="9";
				}
				else{
					stemp2+="9";
				}
			}
		}
		if(src.equals(zero)){
			if(opchosen==false){
				if(stemp1==null){
					stemp1="0";
				}
				else{
					stemp1+="0";
				}
			}
			else{
				if(stemp2==null){
					stemp2="0";
				}
				else{
					stemp2+="0";
				}
			}
		}
		if(equalsClicked==false){
		if(opchosen==false){
			answerfield.setText(stemp1);
		}
		else{
			answerfield.setText(stemp2);
		}
		}
		else{
			
		}
	}

}
private class Calc implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("In Calc action performed ** ");
	JButton src=(JButton) e.getSource();
		if(src.equals(add)){
			if(stemp1==null){
				System.out.println("Please choose the number");
			}
			else if(stemp2==null && stemp1!=null){
				opchosen=true;
				System.out.println("+ Clicked");
				operation='+';
			}
		}
		if(src.equals(subtract)){
			if(stemp1==null){
				System.out.println("Please choose the number");
			}
			else if(stemp2==null && stemp1!=null){
				opchosen=true;
				System.out.println("- Clicked");
				operation='-';
			}
		}if(src.equals(multiply)){
			if(stemp1==null){
				System.out.println("Please choose the number");
			}
			else if(stemp2==null && stemp1!=null){
				opchosen=true;
				System.out.println("* Clicked");
				operation='*';
			}
		}if(src.equals(divide)){
			if(stemp1==null){
				System.out.println("Please choose the number");
			}
			else if(stemp2==null && stemp1!=null){
				opchosen=true;
				System.out.println("/ Clicked");
				operation='/';
			}
		}if(src.equals(equals)){
			if(stemp1==null){
				System.out.println("Please choose the number");
			}
			else if(stemp2==null && stemp1==null){
				System.out.println("Please select both the nos.");
			}
			if(stemp1!=null && stemp2!=null){
				double d1=Double.parseDouble(stemp1);
				double d2=Double.parseDouble(stemp2);
				if(d2!=0)
				{
					switch (operation) {
					case '+':
						answer=d1+d2;
							break;
					case '-':
						answer=d1-d2;
							break;
					case '*':
						answer=d1*d2;
							break;
					case '/':
						answer=d1/d2;
							break;
					default:
						break;
					}
					sanswer=Double.toString(answer);
				}
				else{
					sanswer="DIVIDE BY 0 ERROR";
				}
				System.out.println(sanswer);
				answerfield.setText(sanswer);
				stemp1="";
				stemp2="";
			}
		}
		
	}

}
}