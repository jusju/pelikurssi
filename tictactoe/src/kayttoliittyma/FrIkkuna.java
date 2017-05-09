package kayttoliittyma;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// PERII LUOKASTA JFRAME ELI SAA JFRAMEN METODIT KÄYTTÖÖNSÄ
public class FrIkkuna extends JFrame{
	// ESITELLÄÄN EKA BUTTONI JOKA TULEE VASEMPAAN YLÄKULMAAN
	private JButton btVasenYlakulma = new JButton("");
	// KONSTRUKTORI AJETAAN AINA KUN LUOKASTA LUODAAN OLIO
	public FrIkkuna() {
		// IKKUNAN OTSIKKO, JOKA TULEE NÄKYVILLE IKKUNAN OTSIKKOON
		setTitle("TicTacToe");
		// IKKUNAN KOKO PIKSELEISSÄ, ENSIN OIKEALLE JA SITTEN ALAS
		setSize(300, 300);
		// IKKUNAN SIJAINTI MONITORILLA, VASEMMASTA YLÄKULMASTA LUKIEN
		// ELI TAAS ENSIN OIKEALLE JA SITTEN ALAS
		setLocation(800, 800);
		// LUODAAN IKONI OLIO JA ANNETAAN TIEDOKSI IKONI-TIEDOSTON SIJAINTI
		ImageIcon img = new ImageIcon("images/icon.png");
		// ASETETAAN IKKUNALLE IKONI
		setIconImage(img.getImage());
		// IKKUNAN SULKEMINEN LOPETTAA OHJELMAN
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		asetteleKomponentit();
	}
	// METODI, JOKA ASETTELEE KOMPONENTIT NÄYTÖLLE
	public void asetteleKomponentit() {
		// LUODAAN CONTAINER, JOKA TARVITAAN, ETTÄ IKKUNAAN VOI PIIRTÄÄ BUTTONEITA TAI MUITA
		// KÄYTTÖLIITTYMÄKOMPONENTTEJA
		Container sisalto = this.getContentPane();
		// ASETETAAN LAYOUT JÄRJESTELMÄ ELI TÄSSÄ TAPAUKSESSA NULL, JOKA VAATII KOMPONENTTIEN
		// KANSSA TARKAT KOORDINAATIT
		sisalto.setLayout(null);
		// ASETETAAN BUTTONIN SIJAINTI IKKUNASSA JA BUTTONIN KOKO
		btVasenYlakulma.setBounds(0, 0, 100, 100);
		// ASETETAAN BUTTONI CONTEINERIIN
		sisalto.add(btVasenYlakulma);
		// KYTKETÄÄN BUTTONIIN TAPAHTUMANKUUNTELIJA
		btVasenYlakulma.addActionListener(new AlsVasenYlanurkka());
	}
	// LUODAAN SISÄLUOKKA, JOTA KÄYTETÄÄN BUTTONIN PAINALLUKSEN HAVAITSEMISEEN
	class AlsVasenYlanurkka implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// System.out.println tuloste - pikakeino tehdä on että kirjoittaa syso ja painaa ctrl+space
			System.out.println("Morjensta ollaan vasemman yläkulman buttonissa.");
			// TULOSTETAAN MISSÄ OLLAAN OHJELMASSA ILMAN ETTÄ TARVII ITSE KIRJOITTAA
			// systr JA CONTROL+SPACE
			System.out.println("FrIkkuna.AlsVasenYlanurkka.actionPerformed()");
		}
		
	}
	
}
































