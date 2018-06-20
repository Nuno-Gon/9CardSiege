package iu.grafico.gui;

import iu.grafico.ObservableGame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import java.io.*;
import logicaEstados.*;

public class CSelected extends JPanel implements Observer {
	
	private ObservableGame game;
	
	static final String imgName = "imagens/backCard.png";
	
	static Image img, img1;
	
	public CSelected(ObservableGame g) {
		game = g;
		game.addObserver(this);
		
		setupPanel();
	}
	
	private void setupPanel() {
		setBackground(Color.darkGray);
		setPreferredSize(new Dimension(360,400));
		setLayout(new BorderLayout());
		setVisible(game.getState() instanceof AwaitTopCard);
	}
	
	private void getImage(){
        try {
            img = ImageIO.read(Resources.getResourceFile(imgName));
        } catch (IOException ex) {
            //Logger.getLogger(GameLogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private Image getCardImage(){
        ImageIcon icon = null;
        Icon newicon = null;
        String imgPath = "";
    
        switch(game.getGame().getGameData().getCardSelected().getNum()) {
        case 1:
            imgPath = "imagens/card1.png";
            break;
        case 2:
            imgPath = "imagens/card2.png";
            break;
        case 3:
            imgPath = "imagens/card3.png";
            break;
        case 4:
            imgPath = "imagens/card4.png";
            break;
        case 5:
            imgPath = "imagens/card5.png";
            break;
        case 6:
            imgPath = "imagens/card6.png";
            break;
        case 7:
            imgPath = "imagens/card7.png";
            break;
        default:
            imgPath = "imagens/cartaTras.png";
            break;
    }
   
        
    try {
        img = ImageIO.read(Resources.getResourceFile(imgPath));
    } catch (IOException ex) {
        //Logger.getLogger(GameLogo.class.getName()).log(Level.SEVERE, null, ex);
    }
    return img;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Image img = getCardImage();

        if(img != null)
            g.drawImage(img,0,0,245,337,null);

    }


    @Override
    public void update(Observable o, Object arg) {
        setVisible(game.getState() instanceof AwaitPlayerActions || game.getState() instanceof AwaitTopCard);
        revalidate();
        repaint();
    }
}
