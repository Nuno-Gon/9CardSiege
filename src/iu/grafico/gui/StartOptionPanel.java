package iu.grafico.gui;

import iu.grafico.ObservableGame;
import logicaJogo.estados.AwaitBeginning;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.io.*;

public class StartOptionPanel extends JPanel implements Observer{

	ObservableGame game;
	
	JButton iniciar = new JButton("Iniciar");
	JButton sair = new JButton("Sair");
	
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
    public void update(Observable o, Object arg) {
        setVisible(game.getEstado() instanceof AwaitBeginning);
        revalidate();
        repaint();
    }
}
