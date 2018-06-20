package iu.grafico.gui;


import iu.grafico.ObservableGame;
import logicaEstados.*;
import logicaJogo.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class NineCardSiegeView extends JFrame implements Observer{
	
	ObservableGame game;
	NineCardSiegeGamePanel panel;
	
	public NineCardSiegeView(ObservableGame observableGame){
		super("9 Card Siege");
		
		game = observableGame;
		game.addObserver(this);
		
		panel = new NineCardSiegeGamePanel(game);
		
		addComponents();
		menu();
		
		setVisible(true);
		this.setSize(1024,860);
	    this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	    this.setMinimumSize(new Dimension(700,600));
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    validate();
	}
	
	private void addComponents()
    {
        Container cp = getContentPane();
        
        cp.setLayout(new BorderLayout());
        cp.add(panel,BorderLayout.CENTER);
    }
	
	private void menu(){

	      JMenuBar menuBar = new JMenuBar();
	      setJMenuBar(menuBar);

	      JMenu gameMenu = new JMenu("Game");
	      
	      JMenuItem exitObjJMI = new JMenuItem("Exit");
	      
	      gameMenu.add(exitObjJMI);
	      menuBar.add(gameMenu);
	      
	      exitObjJMI.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                 JOptionPane.showMessageDialog(NineCardSiegeView.this, "Game Exit!","Exit",JOptionPane.PLAIN_MESSAGE);
	                 System.exit(0);
	            }
	        });
	}
	
	@Override
    public void update(Observable o, Object arg) {
        revalidate();
        repaint();
    }
}
