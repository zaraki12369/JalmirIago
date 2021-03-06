package PC;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class InterfaceGrafica extends JFrame{
	private JMenuItem menuItemCadastrar = new JMenuItem("Cadastrar");
	private JMenuItem menuItemPesquisar = new JMenuItem("Pesquisar");
	private JMenuItem menuItemExcluir = new JMenuItem("Excluir");
	private JMenuItem menuItemFechar = new JMenuItem("Fechar");
	
	private JMenuItem menuItemAtualizar = new JMenuItem("Atualizar");
	//private JMenuItem menuItemCopiar = new JMenuItem("Copiar");
	//private JMenuItem menuItemRecortar = new JMenuItem("Recortar");
	
	//private JMenuItem menuItemSubstituir = new JMenuItem("Substituir");
	//private JMenuItem menuItemLocalizar = new JMenuItem("Localizar");
	
	private JMenu menuArquivo = new JMenu("Arquivo");
	
	private JMenu menuEditar = new JMenu("Editar");
	
	private JMenuBar menuBar = new JMenuBar();
	
	public InterfaceGrafica() {
		super("MENUS");
		
		//adiciona os JMenuItem no JMenu
		menuArquivo.add(menuItemCadastrar);
		menuArquivo.add(menuItemPesquisar);
		menuArquivo.add(menuItemExcluir);
		menuArquivo.addSeparator();
		menuArquivo.add(menuItemFechar);
		
		menuEditar.add(menuItemAtualizar);
		//menuEditar.add(menuItemCopiar);
		//menuEditar.add(menuItemRecortar);
		//menuEditar.addSeparator();
		//menuEditar.add(menuItemLocalizar);
		//menuEditar.add(menuItemSubstituir);
		
		//adiciona o JMenu no JMenuBar
		menuBar.add(menuArquivo);
		menuBar.add(menuEditar);
		
		this.setJMenuBar(menuBar); //atribui um JMenuBar para o frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(310,200);
		this.setVisible(true);
		
		//ActionListeners do menuArquivo
		menuItemCadastrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				PessoaFisica abrir = new PessoaFisica();
			}
		});
		menuItemPesquisar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				menuPesquisar novo = new menuPesquisar();
			}
		});
		menuItemExcluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				menuExcluir salvar = new menuExcluir();
			}
		});
		menuItemFechar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				menuFechar fechar = new menuFechar();
			}
		});
		
		//ActionListeners do menuEditar
		menuItemAtualizar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				menuAtualizar colar = new menuAtualizar();
			}
		});
		
		
		
		
	}
	public static void main(String[] args) {
		InterfaceGrafica exemplo = new InterfaceGrafica();
	}
}