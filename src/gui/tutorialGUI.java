package gui;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class tutorialGUI extends JFrame implements ActionListener{ //declaração da classe e extendendo todos as caracteristicas do JFrame
	
	private JButton btnExibeMsg;
	
	public tutorialGUI(){
		//chamando o construtor da classe que está sendo herdada JFRAME
		//passando como parametro o titulo da janela	
		super("Tutorial Interface gráfica em JAVA");	
		
		//container para receber os futuros componentes da interface
		Container container = getContentPane();		
		
		/*//configurando o layout do container, no flow layout os componentes serão posicionandos da esquerda pra direita
		container.setLayout(new FlowLayout());		
		//adicionando alguns botoes
		container.add(new JButton("Botao 1"));
		container.add(new JButton("Botao 2"));
		container.add(new JButton("Botao 3"));
		container.add(new JButton("Botao 4"));*/
		
/*		//configurando o layout do container com border laoyout
		//onde consigo setar os botoes com regioes norte,sul leste oeste
		container.setLayout(new BorderLayout());
		container.add(new JButton("Região Norte"), BorderLayout.NORTH);
		container.add(new JButton("Regiao sul"),BorderLayout.SOUTH);
		container.add(new JButton("Regiao oeste"), BorderLayout.WEST);
		container.add(new JButton("Regiao leste"), BorderLayout.EAST);
		container.add(new JButton("regiao central"), BorderLayout.CENTER);*/
		
//		//configurando o layout do container com grid layout
//		//onde eu posso definir um grid com quandos espaços quiser para posicionar os componentes
//		container.setLayout(new GridLayout(2, 2));
//		container.add(new JButton("Botao 1"));
//		container.add(new JButton("Botao 2"));
//		container.add(new JButton("Botao 3"));
//		container.add(new JButton("Botao 4"));
		
//		//alterando aparecencia das janelas com o LOOK and FEEL
//		container.setLayout(new FlowLayout());
//		container.add(new Label("LOOK And FEEL"));
//		container.add(new JTextField(20));
//		container.add(new JButton("Clique aqui"));
		
		// no parametro desse metodo passamos o estilo que foi criado previamente, no caso estarei utilizando
		//alguns estilo já criados existentes na classe swing, abaixo os parametros que podem ser utilizados
//		javax.swing.plaf.metal.MetalLookAndFeel;
//		com.sun.java.swing.plaf.motif.MotifLookAndFeel;
//		avax.swing.plaf.nimbus.NimbusLookAndFeel;		o mais bonitinho
//		com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
//		try{
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
//			SwingUtilities.updateComponentTreeUI(this);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		
		
		//setando um evento, evento sao quando o usuario clica em algum botao, aciona uma tecla, fecha uma janelas etc
		//se faz necessário a criaçao de um metodo para ouvir esses eventos "listener" esse metodo chamasse
		//actionPerformed que irá ouvir o evento solicitado pelo usuario e executaçãoa alguma ação
		
		//interface simples 
		btnExibeMsg = new JButton("Clique aqui");
		btnExibeMsg.addActionListener(this);	//informando que o botao vai receber um evento que será tratado depois
		container.add(btnExibeMsg);
		
		setSize(400, 400);								//tamanho janela
		//sem esse metodo ao clicar no x, apenas escondemos a janela
		//com o metodo estamos encerrando a aplicação por completo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//esse metodo define uma posição para posicionar a janela, poderia ser um objeto qualquer
		//com o parametro null, a janela irá se posicional ao centro do monitor
		setLocationRelativeTo(null);
		//toda janela criada fica invisivel por padrao, entao temos que alterar isso no momento de sua criaçao
		setVisible(true);	
	}

	public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == btnExibeMsg)
		{
			JOptionPane.showMessageDialog(null, "O event click foir adicionado");
		}
		
	}
}
