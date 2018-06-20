package iu.grafico.gui;

import iu.grafico.ObservableGame;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import logicaJogo.*;
import logicaEstados.*;

public class NineCardSiegeGamePanel extends JPanel implements Observer{
	ObservableGame game;
	StartOptionPanel startOptionPanel;
	//EnemyTrackPanel enemyTrackPanel;
	//StatusCardPanel statusCardPanel;
	//CardSelected cardSelected;
	JPanel pNorth, pCenter, pCenterLeft, pCenterRight, pSouth, pSouthLeft, pSouthCenter, pSouthRight, pWest, pEast;
	
	public NineCardSiegeGamePanel(ObservableGame game){
		this.game = game;
		
		//setupComponents();
		//setupLayout();
	}
	
	@Override
    public void update(Observable o, Object arg) {
        setBackground(Color.blue);
        revalidate();
        repaint();
    }
}
