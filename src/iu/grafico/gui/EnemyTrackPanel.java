package iu.grafico.gui;
import iu.grafico.ObservableGame;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.accessibility.AccessibleContext;
import javax.imageio.ImageIO;
import java.io.IOException;
import logicaJogo.*;
import logicaEstados.AwaitBeginning;
import logicaEstados.*;

public class EnemyTrackPanel extends JPanel implements Observer {
	
	ObservableGame game;
	String imageF[] = {"imagens/enemyTracks.png","imagens/peaoazul.png"};
	Image[] image = new Image[imageF.length];
	boolean load = false;
	
	EnemyTrackPanel(ObservableGame g) {
		game = g;
		game.addObserver(this);
		setBackground(Color.darkGray);
		
		setVisible(game.getState() instanceof AwaitTopCard);
	}
	
	Image getImage(Observable game, int i) {
		if(!load) {
			int p=0;
			load = true;
			for(String fileN:imageF) {
				try {
					image[p] = ImageIO.read(Resources.getResourceFile(fileN));
					p++;
				} catch (IOException ex) {
				}
			}
		}
		return image[i];
	}
	
	@Override
	public void paintComponent(Graphics g) {
		int width_image = 750;
		int height_image = 1050;
		
		super.paintComponent(g);
		
		g.drawImage(getImage(game,0), 0, 250, 241, 336, null);
		g.drawRect(0, 250, 241, 336);
		
		switch (game.getLadder()) {
			case 4:
				g.drawImage(getImage(game,1), 17, 472, 40, 40, null);
				g.drawRect(17, 472, 40, 40);
				break;
			case 3:
				g.drawImage(getImage(game,1),17,417,40,40,null);
	            g.drawRect(17,417,40,40);
	            break;
			case 2:
	            g.drawImage(getImage(game,1),17,362,40,40,null);
	            g.drawRect(17,362,40,40);
	            break;
	        case 1:
	            g.drawImage(getImage(game,1),17,307,40,40,null);
	            g.drawRect(17,307,40,40);
	            break;
	        case 0:
	            default:
	            g.drawImage(getImage(game,1),78,255,40,40,null);
	            g.drawRect(78,255,40,40);
	            break;
	    }
		
		switch(game.getRam()) {
		case 4:
            g.drawImage(getImage(game,1),98,472,40,40,null);
            g.drawRect(98,472,40,40);
            break;
		case 3:
            g.drawImage(getImage(game,1),98,417,40,40,null);
            g.drawRect(98,417,40,40);
            break;
        case 2:
            g.drawImage(getImage(game,1),98,362,40,40,null);
            g.drawRect(98,362,40,40);
            break;
        case 1:
            g.drawImage(getImage(game,1),98,307,40,40,null);
            g.drawRect(98,307,40,40);
            break;
        case 0:
        	default:
            g.drawImage(getImage(game,1),98,255,40,40,null);
            g.drawRect(98,255,40,40);
            break;
		}
		
		switch(game.getSiege()) {
		case 4:
            g.drawImage(getImage(game,1),179,472,40,40,null);
            g.drawRect(179,472,40,40);
            break;
        case 3:
            g.drawImage(getImage(game,1),179,417,40,40,null);
            g.drawRect(179,417,40,40);
            break;
        case 2:
            g.drawImage(getImage(game,1),179,362,40,40,null);
            g.drawRect(179,362,40,40);  
            break;
        case 1:
            g.drawImage(getImage(game,1),179,307,40,40,null);
            g.drawRect(179,307,40,40);
           break;
        case 0:
        	default:
            g.drawImage(getImage(game,1),119,255,40,40,null);
            g.drawRect(119,255,40,40);
            break;
		}
		
		switch(game.getTrebuchet()) {
		case 3:
            g.drawImage(getImage(game,2),179,537,40,40,null);
            g.drawRect(179,255,40,40);
            break;
         case 2:
            g.drawImage(getImage(game,2),98,537,40,40,null);
            g.drawRect(98,255,40,40);
            break;
         case 1:
         	default:
         	g.drawImage(getImage(game,2),17,537,40,40,null);
         	g.drawRect(17,255,40,40);
         	break;
		}
	}
	
	public ObservableGame getGame() {
		return game;
	}

	public void setGame(ObservableGame game) {
		this.game = game;
	}

	public String[] getImageF() {
		return imageF;
	}

	public void setImageF(String[] imageF) {
		this.imageF = imageF;
	}

	public Image[] getImage() {
		return image;
	}

	public void setImage(Image[] image) {
		this.image = image;
	}

	public boolean isLoad() {
		return load;
	}

	public void setLoad(boolean load) {
		this.load = load;
	}
	
	public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

	@Override
	public void update(Observable o, Object arg) {
		setVisible(game.getState() instanceof AwaitTopCard || game.getState() instanceof AwaitPlayerActions || game.getState() instanceof AwaitEndOfDay);
		revalidate();
		repaint();
	}
}
