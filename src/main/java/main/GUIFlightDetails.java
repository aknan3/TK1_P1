package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.Box;
import java.awt.Component;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIFlightDetails {

	public JFrame frame;
	private JTextField txtAs;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Create the application.
	 */
	
//	public static void main(String[] args) {
//		
//	
//		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUIFlightDetails window = new GUIFlightDetails();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}
	
	public GUIFlightDetails() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		
		frame = new JFrame("Flight Details");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTest = new JLabel("IATA Code:");
		lblTest.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTest.setBounds(15, 16, 107, 20);
		frame.getContentPane().add(lblTest);
		
		txtAs = new JTextField();
		txtAs.setBounds(234, 13, 170, 26);
		frame.getContentPane().add(txtAs);
		txtAs.setColumns(10);
		
		JLabel lblAircraftModelName = new JLabel("Aircraft Model Name:");
		lblAircraftModelName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAircraftModelName.setBounds(15, 56, 180, 20);
		frame.getContentPane().add(lblAircraftModelName);
		
		JLabel lblTrackingNumber = new JLabel("Tracking Number:");
		lblTrackingNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrackingNumber.setBounds(15, 92, 180, 20);
		frame.getContentPane().add(lblTrackingNumber);
		
		JLabel lblDepartureAirport = new JLabel("Departure Airport:");
		lblDepartureAirport.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartureAirport.setBounds(15, 128, 180, 20);
		frame.getContentPane().add(lblDepartureAirport);
		
		JLabel lblOriginDate = new JLabel("Origin Date:");
		lblOriginDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOriginDate.setBounds(15, 164, 180, 20);
		frame.getContentPane().add(lblOriginDate);
		
		JLabel lblScheduleDeparture = new JLabel("Schedule Departure:");
		lblScheduleDeparture.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScheduleDeparture.setBounds(15, 200, 180, 20);
		frame.getContentPane().add(lblScheduleDeparture);
		
		JLabel lblDepartureTerminal = new JLabel("Departure Terminal:");
		lblDepartureTerminal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartureTerminal.setBounds(15, 236, 180, 20);
		frame.getContentPane().add(lblDepartureTerminal);
		
		JLabel lblDepartureGates = new JLabel("Departure Gates:");
		lblDepartureGates.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartureGates.setBounds(15, 272, 180, 20);
		frame.getContentPane().add(lblDepartureGates);
		
		JLabel lblEstimatedDeparture = new JLabel("Estimated Departure:");
		lblEstimatedDeparture.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstimatedDeparture.setBounds(15, 308, 180, 20);
		frame.getContentPane().add(lblEstimatedDeparture);
		
		JLabel lblLocation = new JLabel("Check-in Location:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLocation.setBounds(15, 344, 180, 20);
		frame.getContentPane().add(lblLocation);
		
		JLabel lblTrackingNumber_1 = new JLabel("Check-in Counter:");
		lblTrackingNumber_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTrackingNumber_1.setBounds(15, 380, 180, 20);
		frame.getContentPane().add(lblTrackingNumber_1);
		
		JLabel lblCheckinStart = new JLabel("Check-in Start:");
		lblCheckinStart.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCheckinStart.setBounds(15, 416, 180, 20);
		frame.getContentPane().add(lblCheckinStart);
		
		JLabel lblFlightStatus = new JLabel("Flight Status:");
		lblFlightStatus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFlightStatus.setBounds(15, 452, 180, 20);
		frame.getContentPane().add(lblFlightStatus);
		
		JLabel lblOperatingAirline = new JLabel("Operating Airline:");
		lblOperatingAirline.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOperatingAirline.setBounds(419, 16, 180, 20);
		frame.getContentPane().add(lblOperatingAirline);
		
		JLabel lblDepartureAirport_1 = new JLabel("Departure Airport:");
		lblDepartureAirport_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDepartureAirport_1.setBounds(419, 128, 180, 20);
		frame.getContentPane().add(lblDepartureAirport_1);
		
		JLabel lblScheduleArrival = new JLabel("Schedule Arrival:");
		lblScheduleArrival.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScheduleArrival.setBounds(419, 200, 180, 20);
		frame.getContentPane().add(lblScheduleArrival);
		
		JLabel lblArrivalTerminal = new JLabel("Arrival Terminal:");
		lblArrivalTerminal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblArrivalTerminal.setBounds(419, 236, 180, 20);
		frame.getContentPane().add(lblArrivalTerminal);
		
		JLabel lblArrivalGates = new JLabel("Arrival Gates:");
		lblArrivalGates.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblArrivalGates.setBounds(419, 272, 180, 20);
		frame.getContentPane().add(lblArrivalGates);
		
		JLabel lblEstimatedArrival = new JLabel("Estimated Arrival:");
		lblEstimatedArrival.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEstimatedArrival.setBounds(419, 308, 180, 20);
		frame.getContentPane().add(lblEstimatedArrival);
		
		JLabel lblCheckinEnd = new JLabel("Check-in End:");
		lblCheckinEnd.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCheckinEnd.setBounds(419, 416, 180, 20);
		frame.getContentPane().add(lblCheckinEnd);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(234, 53, 170, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 89, 170, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(234, 125, 170, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(234, 161, 170, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(234, 197, 170, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(234, 233, 170, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(234, 269, 170, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(234, 305, 170, 26);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(234, 341, 170, 26);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(234, 377, 170, 26);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(234, 413, 170, 26);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(593, 13, 170, 26);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(593, 125, 170, 26);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(593, 197, 170, 26);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(593, 233, 170, 26);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(593, 269, 170, 26);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(593, 305, 170, 26);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(593, 413, 170, 26);
		frame.getContentPane().add(textField_17);
		
		String comboBoxList[] = {"B", "D", "I", "L", "M", "S", "X", "Y", "Z"};
		JComboBox comboBox = new JComboBox(comboBoxList);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-", "B", "D", "I", "L", "M", "S", "X", "Y", "Z"}));
		comboBox.setBounds(234, 449, 529, 23);
		frame.getContentPane().add(comboBox);
		//String comboBoxList[] = {"B", "D", "I", "L", "M", "S", "X", "Y", "Z"};
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		btnCancel.setBounds(484, 499, 115, 29);
		frame.getContentPane().add(btnCancel);
		
		JButton btnSave = new JButton("Save");
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnSave.setBounds(648, 499, 115, 29);
		frame.getContentPane().add(btnSave);
	}
}
