package newtestpakage;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
public class calc2 extends Frame implements ActionListener ,WindowListener{
	Frame f;
	TextField v1,v2,r;
	Button b1,b2,b3,b4,cl,o0,o1,o2,o3,o4,o5,o6,o7,o8,o9,o11,o12,o13,o14,l;
	StringBuffer s = new StringBuffer();
	int ex = 0;
	int b = 0;
	calc2(){
	f = new Frame();
	b1 = new Button(" + ");
	b2 = new Button(" - ");
	b3 = new Button(" * ");
	b4 = new Button(" / ");
	o0 = new Button(" 0 ");
	o1 = new Button(" 1 ");
	o2 = new Button(" 2 ");
	o3 = new Button(" 3 ");
	o4 = new Button(" 4 ");
	o5 = new Button(" 5 ");
	o6 = new Button(" 6 ");
	o7 = new Button(" 7 ");
	o8 = new Button(" 8 ");
	o9 = new Button(" 9 ");
	o11 = new Button(" = ");
	o12 = new Button(" ( ");
	o13 = new Button(" ) ");
	o14 = new Button(" Back ");
	cl = new Button(" Clear ");
	l = new Button(" Made By Avik Bachhar");
	v1 = new TextField();
	v2 = new TextField();
	r = new TextField();
	v1.setBounds(20,50,300,30);/*x,y,length,height*/
	v2.setBounds(20,90,300,30);/*x,y,length,height*/
	b1.setBounds(200,130,60,60);
	o12.setBounds(260,130,60,60);
	b2.setBounds(200,190,60,60);
	o13.setBounds(260,190,60,60);
	b3.setBounds(200,250,60,60);
	o14.setBounds(260,250,60,60);
	cl.setBounds(260,310,60,60);
	b4.setBounds(200,310,60,60);
	o1.setBounds(20,130,60,60);
	o2.setBounds(80,130,60,60);
	o3.setBounds(140,130,60,60);
	o4.setBounds(20,190,60,60);
	o5.setBounds(80,190,60,60);
	o6.setBounds(140,190,60,60);
	o7.setBounds(20,250,60,60);
	o8.setBounds(80,250,60,60);
	o9.setBounds(140,250,60,60);
	o0.setBounds(20,310,120,60);
	o11.setBounds(140,310,60,60);
	l.setBounds(20,370,300,30);
	f.add(v1);
	f.add(v2);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(cl);
	f.add(o0);
	f.add(o1);
	f.add(o2);
	f.add(o3);
	f.add(o4);
	f.add(o5);
	f.add(o6);
	f.add(o7);
	f.add(o8);
	f.add(o9);
	f.add(o11);
	f.add(o12);
	f.add(o13);
	f.add(o14);
	f.add(l);
	f.setSize(350,420); 
	f.setTitle("Calculator");
	f.setLayout(null);
	f.setVisible(true);
	f.setBackground(Color.DARK_GRAY);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	o0.addActionListener(this);
	o1.addActionListener(this);
	o2.addActionListener(this);
	o3.addActionListener(this);
	o4.addActionListener(this);
	o5.addActionListener(this);
	o6.addActionListener(this);
	o7.addActionListener(this);
	o8.addActionListener(this);
	o9.addActionListener(this);
	o11.addActionListener(this);
	o12.addActionListener(this);
	o13.addActionListener(this);
	o14.addActionListener(this);
	cl.addActionListener(this);
	f.addWindowListener(this);
}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	public void windowActivated(WindowEvent e) {}    
	public void windowClosed(WindowEvent e) {}        
	public void windowDeactivated(WindowEvent e) {}    
	public void windowDeiconified(WindowEvent e) {}    
	public void windowIconified(WindowEvent e) {}    
	public void windowOpened(WindowEvent arg0) {}  



	public void actionPerformed(ActionEvent e) {
	String s1 = v1.getText();
	if(e.getSource()==o0) {
		s.append("0");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o1) {
		s.append("1");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o2) {
		s.append("2");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o3) {
		s.append("3");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o4) {
		s.append("4");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o5) {
		s.append("5");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o6) {
		s.append("6");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o7) {
		s.append("7");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o8) {
		s.append("8");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==o9) {
		s.append("9");
		v1.setText(s.toString());
		ex = 0;
	}
	else if(e.getSource()==b1) {
		if(ex==0) {
			s.append("+");
			v1.setText(s.toString());
			ex=1;
		}
		
	}
	else if(e.getSource()==b2){
		if(ex==0) {
		s.append("-");
		v1.setText(s.toString());
		ex=1;
	}
	}
	else if(e.getSource()==b3) {
		if(ex==0) {
		s.append("*");
		v1.setText(s.toString());
		ex=1;
	}
	}
	else if(e.getSource()==b4) {
		if(ex==0) {
		s.append("/");
		v1.setText(s.toString());
		ex=1;
	}

	}
	else if(e.getSource()==o12) {
		if(ex==1 && b == 0) {
		s.append("(");
		v1.setText(s.toString());
		b=1;
	}

	}
	else if(e.getSource()==o13) {
		if(ex==0 && b == 1) {
		s.append(")");
		v1.setText(s.toString());
		b=0;
	}

	}
	else if(e.getSource()==o11) {
		v2.setText(String.valueOf(evaluate(s1)));
	}
	else if(e.getSource()==cl) {
		v1.setText("");
		v2.setText("");
		s.setLength(0);
	}
	else if(e.getSource()==o14) {
		s.setLength(s.length()-1);
		v1.setText(s.toString());
	}
}
	
	 public static int evaluate(String expression)
	    {
	        char[] tokens = expression.toCharArray();
	        Stack<Integer> values = new Stack<Integer>();
	        Stack<Character> ops = new Stack<Character>();
	        for (int i = 0; i < tokens.length; i++)
	        {   if (tokens[i] == ' ')
	                continue;
	            if (tokens[i] >= '0' &&
	                 tokens[i] <= '9')
	            {
	                StringBuffer sbuf = new StringBuffer();
	                while (i < tokens.length &&
	                        tokens[i] >= '0' &&
	                          tokens[i] <= '9')
	                    sbuf.append(tokens[i++]);
	                values.push(Integer.parseInt(sbuf.toString()));
	                  i--;
	            }
	            else if (tokens[i] == '(')
	                ops.push(tokens[i]);
	            else if (tokens[i] == ')')
	            {
	                while (ops.peek() != '(')
	                  values.push(applyOp(ops.pop(),values.pop(),values.pop()));
	                ops.pop();
	            }
	            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' ||tokens[i] == '/')
	            {   while (!ops.empty() &&
	                       hasPrecedence(tokens[i],
	                                    ops.peek()))
	                  values.push(applyOp(ops.pop(),
	                                   values.pop(),
	                                 values.pop()));
	 
	   
	                ops.push(tokens[i]);
	            }
	        }
	 
	        while (!ops.empty())
	            values.push(applyOp(ops.pop(),
	                             values.pop(),
	                           values.pop()));
	 
	        return values.pop();
	    }
	    public static boolean hasPrecedence(
	                           char op1, char op2)
	    {
	        if (op2 == '(' || op2 == ')')
	            return false;
	        if ((op1 == '*' || op1 == '/') &&
	            (op2 == '+' || op2 == '-'))
	            return false;
	        else
	            return true;
	    }
	 
	    public static int applyOp(char op,int b, int a)
	    {
	        switch (op)
	        {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case '*':
	            return a * b;
	        case '/':
	            if (b == 0)
	                throw new
	                UnsupportedOperationException(
	                      "Cannot divide by zero");
	            return a / b;
	        }
	        return 0;
	    }

	public static void main(String[] args) {
	System.out.println("Starting Awt.........");
	calc2 f = new calc2();
}
}