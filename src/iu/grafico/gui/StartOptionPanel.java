package iu.grafico.gui;

import iu.grafico.ObservableGame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.io.*;
import logicaEstados.*;

public class StartOptionPanel extends JPanel implements Observer{

	ObservableGame game;
	
	JButton iniciar = new JButton("Iniciar");
	JButton sair = new JButton("Sair");
	
	String imageFiles ="imagens/paginaInicial.png";
    Image home;
	
	StartOptionPanel(ObservableGame g) {
		game = g;
		game.addObserver(this);
		
		setupComponentes();
		setupLayout();
		
		setVisible(game.getState() instanceof AwaitBeginning);
	}
	
	private void setupLayout()
    {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        iniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        sair.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        add(Box.createVerticalGlue());
        add(iniciar);
        
        add(Box.createVerticalStrut(20));
        add(sair);
        add(Box.createVerticalStrut(10));
       
        validate();
    }
     
     private void setupComponentes(){
      
         iniciar.addActionListener(new ActionListener(){
             @Override
            public void actionPerformed(ActionEvent ev) {
               game.ResolveStart();
               
            }
         });
         
         sair.addActionListener(new ActionListener(){
             @Override
            public void actionPerformed(ActionEvent ev) {
               System.exit(0); 
               
            }
         });
         
         
     }
	
     @Override
     public void paintComponent(Graphics g)
     {
         super.paintComponent(g);
         
         try {
             home = ImageIO.read(Resources.getResourceFile(imageFiles));
         } catch (IOException ex) {
             
         }
         g.drawImage(home,0,0,getWidth()-1,getHeight()-1,null);
     }
     
	@Override
    public void update(Observable o, Object arg) {
        setVisible(game.getState() instanceof AwaitBeginning);
        revalidate();
        repaint();
    }
}
