package PC;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.FlowLayout;

public class menuPesquisar extends JFrame {
	
	String[] coluna= {"Nome","Cidade","Estado","Endereço","Bairro","CEP","Telefone","Celular","RG","CPF","Sexo"};
	
	String[][] dados= {{"Eduardo Jorge","Salvador","Bahia","Rua sla","Kemel","8000-80","25674970","9879895","30002123","981293892","Masculino"},
	{"Gustavo Neves","Caetité","Bahia","Rua aaa","Kemel 2","323-80","32342243","98792123","42342343","234234324","Masculino"},
			{"Tarcísio Araújo","Mutuípe","Bahia","Rua bbb","Kemel 3","12423-80","23423432","92343242123","324324","768678234","Femininp"}};
	
	private JTable listEstados= new JTable(dados,coluna);
	private JScrollPane scrollpane= new JScrollPane(listEstados);
	
	public menuPesquisar() {
		super("PESQUISAR");
		Container paine=this.getContentPane();
		paine.add(scrollpane);
		scrollpane.setBounds(0,0,600,330);
		this.setSize(228, 322);
		this.setVisible(true);
		this.setResizable(true);
	}
	

}