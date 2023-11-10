package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.color.ColorSpace;

import javax.swing.border.LineBorder;

public class payroll {

	private JFrame frmPayrollCalculator;
	private JTextField textFieldName;
	private JTextField textFieldHour;
	private JTextField textFieldDay;
	private JTextField textFieldNoDay;
	private JTextField textFieldTax;
	private JTextField textFieldHealth;
	private JTextField textFieldSSS;
	private JTextField textFieldGross;
	private JTextField textFieldDeduct;
	private JTextField textFieldGrossB;
	private JTextField textFieldTotalD;
	private JTextField textFieldNet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll window = new payroll();
					window.frmPayrollCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPayrollCalculator = new JFrame();
		frmPayrollCalculator.setTitle("payroll calculator");
		frmPayrollCalculator.setVisible(true);
		frmPayrollCalculator.setForeground(new Color(255, 255, 255));
		frmPayrollCalculator.setBackground(new Color(0, 51, 255));
		frmPayrollCalculator.getContentPane().setBounds(new Rectangle(4, 4, 4, 4));
		frmPayrollCalculator.getContentPane().setBackground(new Color(255, 255, 255));
		frmPayrollCalculator.getContentPane().setForeground(new Color(0, 255, 255));
		frmPayrollCalculator.setBounds(100, 100, 1090, 660);
		frmPayrollCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPayrollCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(335, 28, 391, 42);
		frmPayrollCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rate Per Hour");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(56, 199, 152, 24);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(56, 195, 49, 0);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hour Per Day");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(56, 269, 152, 24);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number Of Days Worked");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 337, 198, 24);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Employee Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(56, 131, 152, 24);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_5);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(218, 135, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldHour = new JTextField();
		textFieldHour.setBounds(218, 203, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldDay = new JTextField();
		textFieldDay.setBounds(218, 273, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldDay);
		textFieldDay.setColumns(10);
		
		textFieldNoDay = new JTextField();
		textFieldNoDay.setBounds(218, 341, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldNoDay);
		textFieldNoDay.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY");
		lblNewLabel_6.setForeground(new Color(128, 0, 0));
		lblNewLabel_6.setBackground(new Color(128, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(430, 135, 296, 30);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Tax 15% of Monthly Wage");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(422, 204, 198, 14);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setBounds(422, 274, 198, 14);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(422, 342, 198, 14);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_9);
		
		textFieldTax = new JTextField();
		textFieldTax.setEditable(false);
		textFieldTax.setBounds(630, 203, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldTax);
		textFieldTax.setColumns(10);
		
		textFieldHealth = new JTextField();
		textFieldHealth.setEditable(false);
		textFieldHealth.setBounds(630, 268, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldHealth);
		textFieldHealth.setColumns(10);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(630, 341, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gross Salary");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setBounds(826, 136, 120, 14);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Deduction");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(826, 204, 120, 14);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_11);
		
		textFieldGross = new JTextField();
		textFieldGross.setEditable(false);
		textFieldGross.setBounds(956, 135, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldGross);
		textFieldGross.setColumns(10);
		
		textFieldDeduct = new JTextField();
		textFieldDeduct.setEditable(false);
		textFieldDeduct.setBounds(956, 203, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldDeduct);
		textFieldDeduct.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("GROSS SALARY");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_12.setBounds(35, 463, 173, 21);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_12);
		
		textFieldGrossB = new JTextField();
		textFieldGrossB.setEditable(false);
		textFieldGrossB.setBounds(218, 466, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldGrossB);
		textFieldGrossB.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("TOTAL DEDUCTION");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_13.setBounds(430, 466, 190, 14);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_13);
		
		textFieldTotalD = new JTextField();
		textFieldTotalD.setEditable(false);
		textFieldTotalD.setBounds(630, 466, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldTotalD);
		textFieldTotalD.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("NET SALARY");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_14.setBounds(768, 463, 178, 21);
		frmPayrollCalculator.getContentPane().add(lblNewLabel_14);
		
		textFieldNet = new JTextField();
		textFieldNet.setEditable(false);
		textFieldNet.setBounds(956, 466, 96, 20);
		frmPayrollCalculator.getContentPane().add(textFieldNet);
		textFieldNet.setColumns(10);
		
		JButton btnNewButton = new JButton("Compute");
		btnNewButton.setBorder(new LineBorder(new Color(51, 51, 204), 4, true));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name;
				int  monthlyWage;
				int hour, day, NoDay, Tax, Health, sss, gross, deduct, net;
				name=textFieldName.getText();
				hour=Integer.valueOf(textFieldHour.getText());
				day=Integer.valueOf(textFieldDay.getText());
				NoDay=Integer.valueOf(textFieldNoDay.getText());
				
				monthlyWage=(hour*day*NoDay);
				Tax=(int) (0.15*monthlyWage);
				Health=(int) (0.05*monthlyWage);
				sss=(int) (0.02*monthlyWage);
				deduct=Tax+Health+sss;
				gross=monthlyWage-deduct;
				
				textFieldTax.setText(String.valueOf(Tax));
				textFieldHealth.setText(String.valueOf(Health));
				textFieldSSS.setText(String.valueOf(sss));
				textFieldGross.setText(String.valueOf(monthlyWage));
				textFieldDeduct.setText(String.valueOf(deduct));
				textFieldGrossB.setText(String.valueOf(monthlyWage));
				textFieldTotalD.setText(String.valueOf(deduct));
				textFieldDeduct.setText(String.valueOf(deduct));
				textFieldNet.setText(String.valueOf(gross));
				
				
				
				
			}
		});
		btnNewButton.setBounds(452, 536, 227, 52);
		frmPayrollCalculator.getContentPane().add(btnNewButton);
	}

}
