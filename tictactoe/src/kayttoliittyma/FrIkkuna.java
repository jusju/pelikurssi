package kayttoliittyma;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// PERII LUOKASTA JFRAME ELI SAA JFRAMEN METODIT K�YTT��NS�
public class FrIkkuna extends JFrame{
	// ESITELL��N EKA BUTTONI JOKA TULEE VASEMPAAN YL�KULMAAN
	private JButton btVasenYlakulma = new JButton("");
	// KONSTRUKTORI AJETAAN AINA KUN LUOKASTA LUODAAN OLIO
	public FrIkkuna() {
		// IKKUNAN OTSIKKO, JOKA TULEE N�KYVILLE IKKUNAN OTSIKKOON
		setTitle("TicTacToe");
		// IKKUNAN KOKO PIKSELEISS�, ENSIN OIKEALLE JA SITTEN ALAS
		setSize(300, 300);
		// IKKUNAN SIJAINTI MONITORILLA, VASEMMASTA YL�KULMASTA LUKIEN
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
	// METODI, JOKA ASETTELEE KOMPONENTIT N�YT�LLE
	public void asetteleKomponentit() {
		// LUODAAN CONTAINER, JOKA TARVITAAN, ETT� IKKUNAAN VOI PIIRT�� BUTTONEITA TAI MUITA
		// K�YTT�LIITTYM�KOMPONENTTEJA
		Container sisalto = this.getContentPane();
		// ASETETAAN LAYOUT J�RJESTELM� ELI T�SS� TAPAUKSESSA NULL, JOKA VAATII KOMPONENTTIEN
		// KANSSA TARKAT KOORDINAATIT
		sisalto.setLayout(null);
		// ASETETAAN BUTTONIN SIJAINTI IKKUNASSA JA BUTTONIN KOKO
		btVasenYlakulma.setBounds(0, 0, 100, 100);
		// ASETETAAN BUTTONI CONTEINERIIN
		sisalto.add(btVasenYlakulma);
		// KYTKET��N BUTTONIIN TAPAHTUMANKUUNTELIJA
		btVasenYlakulma.addActionListener(new AlsVasenYlanurkka());
	}
	// LUODAAN SIS�LUOKKA, JOTA K�YTET��N BUTTONIN PAINALLUKSEN HAVAITSEMISEEN
	class AlsVasenYlanurkka implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// System.out.println tuloste - pikakeino tehd� on ett� kirjoittaa syso ja painaa ctrl+space
			System.out.println("Morjensta ollaan vasemman yl�kulman buttonissa.");
			// TULOSTETAAN MISS� OLLAAN OHJELMASSA ILMAN ETT� TARVII ITSE KIRJOITTAA
			// systr JA CONTROL+SPACE
			System.out.println("FrIkkuna.AlsVasenYlanurkka.actionPerformed()");
		}
		
	}
	
}
































