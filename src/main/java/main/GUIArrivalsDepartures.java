package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import main.GUIFlightDetails;

public class GUIArrivalsDepartures {

	private JFrame frmTkAirportArrivals;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIArrivalsDepartures window = new GUIArrivalsDepartures();
					window.frmTkAirportArrivals.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIArrivalsDepartures() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTkAirportArrivals = new JFrame();
		frmTkAirportArrivals.setTitle("TK Airport Arrivals / Departures");
		frmTkAirportArrivals.getContentPane().setBackground(Color.WHITE);
		frmTkAirportArrivals.setBounds(100, 100, 800, 600);
		frmTkAirportArrivals.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblOperatingAirline = new JLabel("Operating Airline:");
		lblOperatingAirline.setForeground(Color.BLACK);
		lblOperatingAirline.setBackground(UIManager.getColor("Button.shadow"));
		
		JLabel lblIata = new JLabel("IATA Code:");
		
		table = new JTable();
		
		JButton btnNew = new JButton("New");
		btnNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIFlightDetails test = new GUIFlightDetails();
			//	test.initialize();
			//	test.frame.setVisible(true);
				
			}
		});
		
		JButton btnEdit = new JButton("Edit");
		
		JButton btnDelete = new JButton("Delete");
		GroupLayout groupLayout = new GroupLayout(frmTkAirportArrivals.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15)
							.addComponent(lblOperatingAirline)
							.addGap(25)
							.addComponent(lblIata, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(table, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(379, Short.MAX_VALUE)
					.addComponent(btnNew)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEdit)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDelete)
					.addGap(36))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblOperatingAirline)
						.addComponent(lblIata))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					.addGap(182)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNew)
						.addComponent(btnEdit)
						.addComponent(btnDelete))
					.addContainerGap())
		);
		frmTkAirportArrivals.getContentPane().setLayout(groupLayout);
	}
}
