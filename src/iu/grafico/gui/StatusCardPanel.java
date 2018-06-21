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

public class StatusCardPanel extends JPanel implements Observer {

    ObservableGame game;
    String imageFiles[] ={"imagens/statusCard.png","imagens/piaoVerde.png","imagens/piaoPreto.png","imagens/piaoAmarelo.png"};
    Image imagem[]= new Image[imageFiles.length];
    boolean loaded = false;
    
    StatusCardPanel(ObservableGame g) {
        game = g;
        game.addObserver(this);
        
        setupLayout();
        setBackground(Color.darkGray);
        setVisible(game.getState() instanceof AwaitTopCard);
    }
    
    
     Image getImagem(ObservableGame game,int i)
    {

       if(!loaded){
           int j=0;
           loaded=true;
           for(String fileName:imageFiles){
               try {
                imagem[j] = ImageIO.read(Resources.getResourceFile(fileName));
                j++;
               } catch (IOException ex) {
           }
           }
       }
       
       return imagem[i];
    }
    
    
     @Override
    public void paintComponent(Graphics g)
    {
        
        int width_image =241;
        int height_image = 336;
       
        super.paintComponent(g);
            
        g.drawImage(getImagem(game,0),200,250,width_image,height_image,null);
        g.drawRect(200,250,width_image,height_image);
       

        switch(game.getWall()){
            case 4:
                g.drawImage(getImagem(game,1),213,261,40,40,null);
                g.drawRect(213,261,40,40);
                break;
            case 3:
                g.drawImage(getImagem(game,1),213,318,40,40,null);
                g.drawRect(213,318,40,40);
                break;
            case 2:
                g.drawImage(getImagem(game,1),213,372,40,40,null);
                g.drawRect(213,372,40,40);
                break;
            case 1:
                g.drawImage(getImagem(game,1),213,426,40,40,null);
                g.drawRect(213,426,40,40);
                break;
            case 0:
            default:
                g.drawImage(getImagem(game,1),290,484,40,40,null);
                g.drawRect(290,484,40,40);
                break;
        }
        
        switch(game.getMorale()){
            case 4:
              g.drawImage(getImagem(game,1),290,261,40,40,null);
              g.drawRect(290,261,40,40);
                break;
            case 3:
               g.drawImage(getImagem(game,1),290,317,40,40,null);
               g.drawRect(290,317,40,40);
                break;
            case 2:
                g.drawImage(getImagem(game,1),290,372,40,40,null);
                g.drawRect(290,372,40,40);
                break;
            case 1:
                g.drawImage(getImagem(game,1),290,426,40,40,null);
                g.drawRect(290,426,40,40);
                break;
            case 0:
            default:
                g.drawImage(getImagem(game,1),290,484,40,40,null);
                g.drawRect(290,484,40,40);
                break;
        }
        
        switch(game.getSupplies()){
            case 4:
                g.drawImage(getImagem(game,1),368,261,40,40,null);
                g.drawRect(368,261,40,40);
                break;
            case 3:
                g.drawImage(getImagem(game,1),368,317,40,40,null);
                g.drawRect(368,317,40,40);
                break;
            case 2:
                g.drawImage(getImagem(game,1),368,372,40,40,null);
                g.drawRect(368,372,40,40);
                break;
            case 1:
                g.drawImage(getImagem(game,1),368,426,40,40,null);
                g.drawRect(368,426,40,40);
                break;
            case 0:
            default:
                g.drawImage(getImagem(game,1),290,484,40,40,null);
                g.drawRect(290,484,40,40);
                break;
                
        }
        
        switch(game.getTunnel()){
            case 4:
                g.drawImage(getImagem(game,2),320,540,40,40,null);
                g.drawRect(320,540,40,40);
                break;
            case 3:
                g.drawImage(getImagem(game,2),280,540,40,40,null);
                g.drawRect(280,540,40,40);
                break;
            case 2:
                g.drawImage(getImagem(game,2),244,540,40,40,null);
                g.drawRect(244,540,40,40);
                break;
            case 1:
                g.drawImage(getImagem(game,2),204,540,40,40,null);
                g.drawRect(204,540,40,40);
                break;
        }
        
        switch(game.getRaidSupplies()){
            case 2:
                g.drawImage(getImagem(game,3),375,501,40,40,null);
                g.drawRect(375,501,40,40);
                break;
            case 1:
                g.drawImage(getImagem(game,3),375,541,40,40,null);
                g.drawRect(375,541,40,40);
                break;
        }        
    }

     private void setupLayout() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    }
    
    @Override
    public void update(Observable o, Object arg) {
       setVisible(game.getState() instanceof AwaitTopCard || game.getState() instanceof AwaitPlayerActions || game.getState() instanceof AwaitEndOfDay);
       revalidate();
       repaint();
    }

  
}