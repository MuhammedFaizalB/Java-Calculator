import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener {
	String oldvalue,oldvalue1,oldvalue2,oldvalue3;
	JLabel displaylabel;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button0;
	JButton buttondot;
	JButton buttonequal;
	JButton buttondivision;
	JButton buttonmultiple;
	JButton buttonsubstraction;
	JButton buttonaddition,clearbutton;
	boolean clickedOperator=false,clickedOperatorsub=false,clickedOperatoradd1=false,
			clickedOperatorsub1=false,clickedOperatormul=false,clickedOperatormul1=false;
	boolean clickedOperatordiv=false,clickedOperatordiv1=false;
	
	public Calculator() {
		JFrame jf=new JFrame("5c Calculator");
		jf.setLayout(null);
		jf.setSize(410, 450);
		jf.setLocation(320, 120);
		jf.getContentPane().setBackground(Color.DARK_GRAY);
		
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30, 20, 310, 50);
		displaylabel.setBackground(Color.DARK_GRAY);
		displaylabel.setForeground(Color.WHITE);
		displaylabel.setFont(new Font("Arial", Font.PLAIN, 40));
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setOpaque(true);
		jf.add(displaylabel);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(340, 10, 50, 70);
		clearbutton.setBackground(Color.DARK_GRAY);
		clearbutton.setForeground(Color.WHITE);
		clearbutton.setFont(new Font("Arial", Font.PLAIN, 40));
		clearbutton.setBorder(null);
		clearbutton.addActionListener(this);
		jf.add(clearbutton);
		
		button7=new JButton("7");
		button7.setBounds(30, 90, 70, 70);
		button7.setBackground(Color.GRAY);
		button7.setForeground(Color.WHITE);
		button7.setFont(new Font("Arial", Font.PLAIN, 40));
		button7.addActionListener(this);
		jf.add(button7);
		
		button8=new JButton("8");
		button8.setBounds(110, 90, 70, 70);
		button8.setBackground(Color.GRAY);
		button8.setForeground(Color.WHITE);
		button8.setFont(new Font("Arial", Font.PLAIN, 40));
		button8.addActionListener(this);
		jf.add(button8);
		
		button9=new JButton("9");
		button9.setBounds(190, 90, 70, 70);
		button9.setBackground(Color.GRAY);
		button9.setForeground(Color.WHITE);
		button9.setFont(new Font("Arial", Font.PLAIN, 40));
		button9.addActionListener(this);
		jf.add(button9);
		
		button4=new JButton("4");
		button4.setBounds(30, 170, 70, 70);
		button4.setBackground(Color.GRAY);
		button4.setForeground(Color.WHITE);
		button4.setFont(new Font("Arial", Font.PLAIN, 40));
		button4.addActionListener(this);
		jf.add(button4);
		
		button5=new JButton("5");
		button5.setBounds(110, 170, 70, 70);
		button5.setBackground(Color.GRAY);
		button5.setForeground(Color.WHITE);
		button5.setFont(new Font("Arial", Font.PLAIN, 40));
		button5.addActionListener(this);
		jf.add(button5);
		
		button6=new JButton("6");
		button6.setBounds(190, 170, 70, 70);
		button6.setBackground(Color.GRAY);
		button6.setForeground(Color.WHITE);
		button6.setFont(new Font("Arial", Font.PLAIN, 40));
		button6.addActionListener(this);
		jf.add(button6);
		
		button1=new JButton("1");
		button1.setBounds(30, 250, 70, 70);
		button1.setBackground(Color.GRAY);
		button1.setForeground(Color.WHITE);
		button1.setFont(new Font("Arial", Font.PLAIN, 40));
		button1.addActionListener(this);
		jf.add(button1);
		
		button2=new JButton("2");
		button2.setBounds(110, 250, 70, 70);
		button2.setBackground(Color.GRAY);
		button2.setForeground(Color.WHITE);
		button2.setFont(new Font("Arial", Font.PLAIN, 40));
		button2.addActionListener(this);
		jf.add(button2);
		
		button3=new JButton("3");
		button3.setBounds(190, 250, 70, 70);
		button3.setBackground(Color.GRAY);
		button3.setForeground(Color.WHITE);
		button3.setFont(new Font("Arial", Font.PLAIN, 40));
		button3.addActionListener(this);
		jf.add(button3);
		
		button0=new JButton("0");
		button0.setBounds(30, 330, 70, 70);
		button0.setBackground(Color.GRAY);
		button0.setForeground(Color.WHITE);
		button0.setFont(new Font("Arial", Font.PLAIN, 40));
		button0.addActionListener(this);
		jf.add(button0);
		
		buttondot=new JButton(".");
		buttondot.setBounds(110, 330, 70, 70);
		buttondot.setBackground(Color.GRAY);
		buttondot.setForeground(Color.WHITE);
		buttondot.setFont(new Font("Arial", Font.PLAIN, 40));
		buttondot.addActionListener(this);
		jf.add(buttondot);
		
		buttonequal=new JButton("=");
		buttonequal.setBounds(190, 330, 70, 70);
		buttonequal.setBackground(Color.GRAY);
		buttonequal.setForeground(Color.WHITE);
		buttonequal.setFont(new Font("Arial", Font.PLAIN, 40));
		buttonequal.addActionListener(this);
		jf.add(buttonequal);
		
		buttondivision=new JButton("÷");
		buttondivision.setBounds(270, 90, 70, 70);
		buttondivision.setBackground(Color.GRAY);
		buttondivision.setForeground(Color.WHITE);
		buttondivision.setFont(new Font("Arial", Font.PLAIN, 40));
		buttondivision.addActionListener(this);
		jf.add(buttondivision);
		
		buttonmultiple=new JButton("×");
		buttonmultiple.setBounds(270, 170, 70, 70);
		buttonmultiple.setBackground(Color.GRAY);
		buttonmultiple.setForeground(Color.WHITE);
		buttonmultiple.setFont(new Font("Arial", Font.PLAIN, 40));
		buttonmultiple.addActionListener(this);
		jf.add(buttonmultiple);
		
		buttonsubstraction=new JButton("-");
		buttonsubstraction.setBounds(270, 250, 70, 70);
		buttonsubstraction.setBackground(Color.GRAY);
		buttonsubstraction.setForeground(Color.WHITE);
		buttonsubstraction.setFont(new Font("Arial", Font.PLAIN, 40));
		buttonsubstraction.addActionListener(this);
		jf.add(buttonsubstraction);
		
		buttonaddition=new JButton("+");
		buttonaddition.setBounds(270, 330, 70, 70);
		buttonaddition.setBackground(Color.GRAY);
		buttonaddition.setForeground(Color.WHITE);
		buttonaddition.setFont(new Font("Arial", Font.PLAIN, 40));
		buttonaddition.addActionListener(this);
		jf.add(buttonaddition);
		
		
				
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button7){
			if(clickedOperator) {
				
				displaylabel.setText("7");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("7");
				clickedOperatorsub=false;
						
			}else if(clickedOperatormul){
				
				displaylabel.setText("7");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("7");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"7");
			}
				
		}else if(e.getSource()==button8){
			if(clickedOperator) {
				
				displaylabel.setText("8");
				clickedOperator=false;
			}else if(clickedOperatorsub) {
				
				displaylabel.setText("8");
				clickedOperatorsub=false;
			}
			else if(clickedOperatormul){
				
				displaylabel.setText("8");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("8");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"8");
			}
			
		}else if(e.getSource()==button9){
			if(clickedOperator) {
				
				displaylabel.setText("9");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("9");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("9");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("9");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"9");
			}
			
		}else if(e.getSource()==button4) {
			if(clickedOperator) {
				
				displaylabel.setText("4");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("4");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("4");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("4");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"4");
			}
			
		}else if(e.getSource()==button5) {
			if(clickedOperator) {
				
				displaylabel.setText("5");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("5");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("5");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("5");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"5");
			}
			
		}else if(e.getSource()==button6) {
			if(clickedOperator) {
				
				displaylabel.setText("6");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("6");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("6");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("6");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"6");
			}
			
		}else if(e.getSource()==button1) {
			if(clickedOperator) {
				
				displaylabel.setText("1");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("1");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("1");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("1");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"1");
			}
			
		}else if(e.getSource()==button2) {
			if(clickedOperator) {
				
				displaylabel.setText("2");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("2");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("2");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("2");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"2");
			}
			
		}else if(e.getSource()==button3) {
			if(clickedOperator) {
				
				displaylabel.setText("3");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("3");
				clickedOperatorsub=false;
			}else if(clickedOperatormul) {
				
				displaylabel.setText("3");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("3");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"3");
			}
			
		}else if(e.getSource()==button0) {
			if(clickedOperator) {
				
				displaylabel.setText("0");
				clickedOperator=false;
			}else if(clickedOperatorsub){
				
				displaylabel.setText("0");
				clickedOperatorsub=false;
			}else if(clickedOperatormul){
				
				displaylabel.setText("0");
				clickedOperatormul=false;
			}else if(clickedOperatordiv){
				
				displaylabel.setText("0");
				clickedOperatordiv=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"0");
			}
			
		}
		else if(e.getSource()==buttondot) {
			displaylabel.setText(displaylabel.getText()+".");
		}
		else if(e.getSource()==buttonequal) {
			if(clickedOperatoradd1) {
				String newvalue=displaylabel.getText();
				float oldvaluef=Float.parseFloat(oldvalue);
				float newvaluef=Float.parseFloat(newvalue);
			    float Result=oldvaluef+newvaluef;
			    displaylabel.setText(Result+"");	
			    clickedOperatoradd1=false;
				
			}else if(clickedOperatorsub1){
				String newvalue1=displaylabel.getText();
				float oldvaluef1=Float.parseFloat(oldvalue1);
				float newvaluef1=Float.parseFloat(newvalue1);
			    float Result=oldvaluef1-newvaluef1;
			    displaylabel.setText(Result+"");	
			    clickedOperatorsub1=false;
			}else if(clickedOperatormul1) {
				String newvalue2=displaylabel.getText();
				float oldvaluef2=Float.parseFloat(oldvalue2);
				float newvaluef2=Float.parseFloat(newvalue2);
				float Result=oldvaluef2*newvaluef2;
				displaylabel.setText(Result+"");
				clickedOperatormul1=false;
			}else if(clickedOperatordiv1) {
				String newvalue3=displaylabel.getText();
				float oldvaluef3=Float.parseFloat(oldvalue3);
				float newvaluef3=Float.parseFloat(newvalue3);
				float Result=oldvaluef3 / newvaluef3;
				displaylabel.setText(Result+"");
				clickedOperatordiv1=false;
			}
			
					
		
		}
		else if(e.getSource()==buttondivision) {
			clickedOperatordiv=true;
			oldvalue3=displaylabel.getText();
			
			clickedOperatordiv1=true;
		}
		else if(e.getSource()==buttonmultiple) {
			clickedOperatormul=true;
			oldvalue2=displaylabel.getText();
			
			clickedOperatormul1=true;
		}
		else if(e.getSource()==buttonsubstraction) {
			clickedOperatorsub=true;
			oldvalue1=displaylabel.getText();
			
			clickedOperatorsub1=true;
		}
		else if(e.getSource()==buttonaddition){
			clickedOperator=true;
			oldvalue=displaylabel.getText();
	
			clickedOperatoradd1=true;
			
			
		}
		else if(e.getSource()==clearbutton){
			displaylabel.setText("");
		}
	}

}

		
		
	
		
