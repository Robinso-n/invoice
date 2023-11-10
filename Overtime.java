package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Overtime {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField name;
	private JTextField hsalarly;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField fm;
	private JTextField ft;
	private JTextField fw;
	private JTextField fth;
	private JTextField ff;
	private JTextField fsa;
	private JTextField fsu;
	private JTextField sm;
	private JTextField st;
	private JTextField sw;
	private JTextField sth;
	private JTextField sf;
	private JTextField ssa;
	private JTextField ssu;
	private JLabel lblNewLabel_11;
	private JTextField rhour;
	private JTextField ohour;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JTextField ramount;
	private JTextField oamount;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JTextField netpay;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Overtime window = new Overtime();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Overtime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.setTitle("Georgetown cleaning Services - Employee Payroll");
		frmGeorgetownCleaningServices.getContentPane().setBackground(new Color(245, 245, 220));
		frmGeorgetownCleaningServices.setBounds(100, 100, 906, 555);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setForeground(new Color(245, 245, 220));
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 870, 89);
		frmGeorgetownCleaningServices.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(40, 35, 119, 14);
		panel.add(lblNewLabel);
		
		name = new JTextField();
		name.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		name.setBounds(169, 32, 240, 20);
		panel.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(419, 35, 128, 14);
		panel.add(lblNewLabel_1);
		
		hsalarly = new JTextField();
		hsalarly.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		hsalarly.setBounds(557, 32, 96, 20);
		panel.add(hsalarly);
		hsalarly.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 111, 870, 206);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Monday");
		lblNewLabel_2.setBounds(100, 42, 92, 20);
		panel_1.add(lblNewLabel_2);
		
		table = new JTable();
		table.setBounds(532, 28, 0, 0);
		panel_1.add(table);
		
		lblNewLabel_3 = new JLabel("Tuesday");
		lblNewLabel_3.setBounds(202, 45, 79, 14);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Wednesday");
		lblNewLabel_4.setBounds(311, 45, 96, 14);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Thursday");
		lblNewLabel_5.setBounds(417, 48, 84, 14);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Friday");
		lblNewLabel_6.setBounds(511, 45, 84, 14);
		panel_1.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Saturday");
		lblNewLabel_7.setBounds(629, 45, 84, 14);
		panel_1.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Sunday");
		lblNewLabel_8.setBounds(735, 45, 96, 14);
		panel_1.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("First Week:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(10, 91, 79, 14);
		panel_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Second Week:");
		lblNewLabel_10.setBounds(10, 146, 92, 14);
		panel_1.add(lblNewLabel_10);
		
		fm = new JTextField();
		fm.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		fm.setBounds(100, 88, 96, 20);
		panel_1.add(fm);
		fm.setColumns(10);
		
		ft = new JTextField();
		ft.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		ft.setBounds(205, 88, 96, 20);
		panel_1.add(ft);
		ft.setColumns(10);
		
		fw = new JTextField();
		fw.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		fw.setBounds(311, 88, 96, 20);
		panel_1.add(fw);
		fw.setColumns(10);
		
		fth = new JTextField();
		fth.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		fth.setBounds(417, 88, 96, 20);
		panel_1.add(fth);
		fth.setColumns(10);
		
		ff = new JTextField();
		ff.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		ff.setBounds(523, 88, 96, 20);
		panel_1.add(ff);
		ff.setColumns(10);
		
		fsa = new JTextField();
		fsa.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		fsa.setBounds(629, 88, 96, 20);
		panel_1.add(fsa);
		fsa.setColumns(10);
		
		fsu = new JTextField();
		fsu.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		fsu.setBounds(735, 88, 96, 20);
		panel_1.add(fsu);
		fsu.setColumns(10);
		
		sm = new JTextField();
		sm.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		sm.setBounds(100, 143, 96, 20);
		panel_1.add(sm);
		sm.setColumns(10);
		
		st = new JTextField();
		st.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		st.setBounds(205, 143, 96, 20);
		panel_1.add(st);
		st.setColumns(10);
		
		sw = new JTextField();
		sw.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		sw.setBounds(311, 143, 96, 20);
		panel_1.add(sw);
		sw.setColumns(10);
		
		sth = new JTextField();
		sth.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		sth.setBounds(417, 143, 96, 20);
		panel_1.add(sth);
		sth.setColumns(10);
		
		sf = new JTextField();
		sf.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		sf.setBounds(523, 143, 96, 20);
		panel_1.add(sf);
		sf.setColumns(10);
		
		ssa = new JTextField();
		ssa.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		ssa.setBounds(629, 143, 96, 20);
		panel_1.add(ssa);
		ssa.setColumns(10);
		
		ssu = new JTextField();
		ssu.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		ssu.setBounds(735, 143, 96, 20);
		panel_1.add(ssu);
		ssu.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 344, 870, 156);
		frmGeorgetownCleaningServices.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Process It");
		btnNewButton.setBackground(new Color(245, 245, 220));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name;
				double Hsalary,Rhour,Ramount,Ohour,Oamount,Netsalary;
				double week [][]= new double[2][7];
				Rhour=0;
				Ohour=0;
				
				
				Name=name.getText();
				Hsalary=Double.valueOf(hsalarly.getText());
				week [0][0]=Double.valueOf(fm.getText());
				week [0][1]=Double.valueOf(ft.getText());
				week [0][2]=Double.valueOf(fw.getText());
				week [0][3]=Double.valueOf(fth.getText());
				week [0][4]=Double.valueOf(ff.getText());
				week [0][5]=Double.valueOf(fsa.getText());
				week [0][6]=Double.valueOf(fsu.getText());
				week [1][0]=Double.valueOf(sm.getText());
				week [1][1]=Double.valueOf(st.getText());
				week [1][2]=Double.valueOf(sw.getText());
				week [1][3]=Double.valueOf(sth.getText());
				week [1][4]=Double.valueOf(sf.getText());
				week [1][5]=Double.valueOf(ssa.getText());
				week [1][6]=Double.valueOf(ssu.getText());
				
				for(int i=0; i<2; i++) {
					for(int j=0; j<7; j++) {
						if(week[i][j]<=8) {
							Rhour+=week[i][j];
				}
						else {Rhour+=8;
						Ohour+=(week[i][j]-8);
							
						}
					
				}
			}
				Ramount=Rhour*Hsalary;
				Oamount=Ohour*Hsalary;
				Netsalary=Ramount+Oamount;
				
				rhour.setText(String.valueOf(Rhour));
				ohour.setText(String.valueOf(Ohour));
				ramount.setText(String.valueOf(Ramount));
				oamount.setText(String.valueOf(Oamount));
				netpay.setText(String.valueOf(Netsalary));
				
				
			}}
		);
		btnNewButton.setBounds(22, 25, 119, 102);
		panel_2.add(btnNewButton);
		
		lblNewLabel_11 = new JLabel("Hours");
		lblNewLabel_11.setBounds(293, 41, 49, 14);
		panel_2.add(lblNewLabel_11);
		
		rhour = new JTextField();
		rhour.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		rhour.setBounds(275, 66, 96, 20);
		panel_2.add(rhour);
		rhour.setColumns(10);
		
		ohour = new JTextField();
		ohour.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		ohour.setBounds(275, 107, 96, 20);
		panel_2.add(ohour);
		ohour.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Regular");
		lblNewLabel_12.setBounds(195, 72, 49, 14);
		panel_2.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Overtime");
		lblNewLabel_13.setBounds(195, 110, 49, 14);
		panel_2.add(lblNewLabel_13);
		
		ramount = new JTextField();
		ramount.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		ramount.setBounds(381, 66, 96, 20);
		panel_2.add(ramount);
		ramount.setColumns(10);
		
		oamount = new JTextField();
		oamount.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 64, 64), null, null, null));
		oamount.setBounds(381, 107, 96, 20);
		panel_2.add(oamount);
		oamount.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Amount");
		lblNewLabel_14.setBounds(401, 41, 49, 14);
		panel_2.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Net Pay");
		lblNewLabel_15.setBounds(515, 88, 49, 14);
		panel_2.add(lblNewLabel_15);
		
		netpay = new JTextField();
		netpay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		netpay.setBounds(574, 85, 96, 20);
		panel_2.add(netpay);
		netpay.setColumns(10);
		
		btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBackground(new Color(245, 245, 220));
		btnNewButton_1.setBounds(710, 25, 127, 102);
		panel_2.add(btnNewButton_1);
	}
}
