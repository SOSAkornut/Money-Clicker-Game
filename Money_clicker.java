import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public abstract class Money_clicker implements ActionListener {
	private static boolean money_bool = false;
	private static double money = 0;
	private static double extra = 0.035;
	private static int num = 0;
	private static boolean blue = false;
	private static boolean red = false;
 	private static boolean yellow = false;	
	public static void main(String[] args) throws InterruptedException {

		String textLine1 = "#################";
		String textLine2 = "#MoneyMoneyMoney#";
		String textLine3 = "#HelloHelloHello#";
		String textLine4 = "#MoneyMoneyMoney#";
		String textLine5 = "#HelloHelloHello#";
		String textLine6 = "#################";
	        
		
			
		JFrame frame = new JFrame("Money_clicker");
		JPanel panel = new JPanel();
		JButton button_money = new JButton("Click me!");
		
		
       
		int width = 200;
		int height = 600;

		JLabel textArt_money1 = new JLabel(textLine1);
		JLabel textArt_money2 = new JLabel(textLine2);
		JLabel textArt_money3 = new JLabel(textLine3);
		JLabel textArt_money4 = new JLabel(textLine4);
		JLabel textArt_money5 = new JLabel(textLine5);
		JLabel textArt_money6 = new JLabel(textLine6);
	
		textArt_money1.setForeground(Color.gray);
		textArt_money2.setForeground(Color.gray);
		textArt_money3.setForeground(Color.gray);
		textArt_money4.setForeground(Color.gray);
		textArt_money5.setForeground(Color.gray);
		textArt_money6.setForeground(Color.gray);
		
		button_money.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {

			money_bool = true;
			if (money_bool == true) {
			
			
				textArt_money1.setForeground(Color.green);
                		textArt_money2.setForeground(Color.green);
                		textArt_money3.setForeground(Color.green);
                		textArt_money4.setForeground(Color.green);
                		textArt_money5.setForeground(Color.green);
                		textArt_money6.setForeground(Color.green);

				textArt_money1.setForeground(Color.green);
                                textArt_money2.setForeground(Color.green);
                                textArt_money3.setForeground(Color.green);
                                textArt_money4.setForeground(Color.green);
                                textArt_money5.setForeground(Color.green);
                                textArt_money6.setForeground(Color.green);
				textArt_money1.setForeground(Color.green);
                                textArt_money2.setForeground(Color.green);
                                textArt_money3.setForeground(Color.green);
                                textArt_money4.setForeground(Color.green);
                                textArt_money5.setForeground(Color.green);
                                textArt_money6.setForeground(Color.green);

				num++;
			}

			if (num == 2){
				textArt_money1.setForeground(Color.gray);
				textArt_money2.setForeground(Color.gray);
				textArt_money3.setForeground(Color.gray);
				textArt_money4.setForeground(Color.gray);
				textArt_money5.setForeground(Color.gray);
				textArt_money6.setForeground(Color.gray);

				num -= 2;
				
			
				
			       

				if (red == true) {
				
//					blue = false;
//					yellow = false;
					textArt_money1.setForeground(Color.red);
                                        textArt_money2.setForeground(Color.red);
                                        textArt_money3.setForeground(Color.red);
                                        textArt_money4.setForeground(Color.red);
                                        textArt_money5.setForeground(Color.red);
                                        textArt_money6.setForeground(Color.red);
					num -= 2;
				}

				if (yellow == true) {
					
//					red = false;
//					blue = false;
					textArt_money1.setForeground(Color.yellow);
	                                textArt_money2.setForeground(Color.yellow);
        	                        textArt_money3.setForeground(Color.yellow);
                	                textArt_money4.setForeground(Color.yellow);
                        	        textArt_money5.setForeground(Color.yellow);
                                	textArt_money6.setForeground(Color.yellow);
					num -= 2;
				}

				if (blue == true){
//                                      red = false;
//                                      yellow = false;


                                        textArt_money1.setForeground(Color.blue);
                                        textArt_money2.setForeground(Color.blue);
                                        textArt_money3.setForeground(Color.blue);
                                        textArt_money4.setForeground(Color.blue);
                                        textArt_money5.setForeground(Color.blue);
                                        textArt_money6.setForeground(Color.blue);
                                        num -= 2;
                                }


                	}	
                        //extra += 0.01;
                        money = money + extra;
                        System.out.println(money + "$");
                }
                });

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(width, height);
		frame.setVisible(true);
		panel.setBackground(Color.black);
		
		frame.add(panel);
		panel.add(textArt_money1);
		panel.add(textArt_money2);
		panel.add(textArt_money3);
		panel.add(textArt_money4);
		panel.add(textArt_money5);
		panel.add(textArt_money6);

		JButton button_blue = new JButton("blue color (1000$)");
		JButton button_red = new JButton("red color (10$)");
		JButton button_yellow = new JButton("yellow color (100$)");
		button_red.setBackground(Color.red);
		button_red.setForeground(Color.white);

		button_red.addActionListener(new ActionListener(){
               	public void actionPerformed(ActionEvent e) {
                        if (money > 10){
				extra += 0.1;
                                red = true;
                                money = money - 10;
		
                                textArt_money1.setForeground(Color.red);
                                textArt_money2.setForeground(Color.red);
                                textArt_money3.setForeground(Color.red);
                                textArt_money4.setForeground(Color.red);
                                textArt_money5.setForeground(Color.red);
                                textArt_money6.setForeground(Color.red);
                         } else {
                                System.out.println("Too expensive");
               		 }
                	}
                });

		button_blue.setBackground(Color.blue);
		button_blue.setForeground(Color.white);
                button_blue.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
			if (money > 1000){
			
				blue = true;
				money = money - 1000;
				extra += 1;
                        	textArt_money1.setForeground(Color.blue);
				textArt_money2.setForeground(Color.blue);
				textArt_money3.setForeground(Color.blue);
				textArt_money4.setForeground(Color.blue);
				textArt_money5.setForeground(Color.blue);
				textArt_money6.setForeground(Color.blue);
			} else {
				System.out.println("Too expensive");
                }
		}
                });
		
		button_yellow.setBackground(Color.yellow);
		button_yellow.setForeground(Color.gray);
		button_yellow.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if (money > 100) {
				yellow = true;
				money -= 100;
			        extra += 0.5;
		       		textArt_money1.setForeground(Color.yellow);
                                textArt_money2.setForeground(Color.yellow);
                                textArt_money3.setForeground(Color.yellow);
                                textArt_money4.setForeground(Color.yellow);
                                textArt_money5.setForeground(Color.yellow);
                                textArt_money6.setForeground(Color.yellow);
		       
			} else {
				System.out.println("Too expensive");
		}
		}
		});	
		panel.add(button_red);
		panel.add(button_yellow);
		panel.add(button_blue);
		panel.add(button_money);
	
	}
}
