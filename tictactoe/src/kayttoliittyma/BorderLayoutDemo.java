package kayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame {
	private JPanel paPisteet = new JPanel(new FlowLayout());
	private JLabel lbPisteet = new JLabel("Pisteet:");
	private JPanel paKortit = new JPanel(new GridLayout(6,6));
	private ArrayList<JButton> kortit = new ArrayList<JButton>();
	private JButton btKortti;
	
	public BorderLayoutDemo() {
		setSize(500, 500);
		// ei voi muuttaa ikkunan kokoa
		setResizable(false);
		for (int i = 0; i < 36; i++) {
			btKortti = new JButton();
			// T�SS� PIT�ISI LIITT�� BUTTONIIN MY�S ACTIONLISTENER
			kortit.add(btKortti);
		}
		asetteleKomponentit();
	}
	public void asetteleKomponentit() {
		Container sisalto = this.getContentPane();
		sisalto.setLayout(new BorderLayout());
		paPisteet.add(lbPisteet);
		sisalto.add(paPisteet, BorderLayout.NORTH);
		for (int i = 0; i < 36; i++) {
			paKortit.add(kortit.get(i));
		}
		// T�SS� PIT�ISI LIS�T� PAKORTTEIHIN BUTTONIT
		sisalto.add(paKortit);
	}
	public static void main(String[] args) {
		BorderLayoutDemo ikkuna = new BorderLayoutDemo();
		ikkuna.setVisible(true);
	}
}
