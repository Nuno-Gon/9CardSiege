package iu.grafico.gui;

import iu.grafico.ObservableGame;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import java.io.IOException;
import logicaJogo.*;
import logicaEstados.AwaitBeginning;
import logicaEstados.*;

public class NineCardSiegeGamePanel extends JPanel implements Observer{
	private ObservableGame game;
	private StartOptionPanel startOptionPanel;
	private EnemyTrackPanel enemyTrackPanel;
	private StatusCardPanel statusCardPanel;
	private CSelected cardSelected;
	private ButtonsPanel gameButtons;
	private JPanel pNorth, pCenter, pCenterLeft, pCenterRight, pSouth, pSouthLeft, pSouthCenter, pSouthRight, pWest, pEast;
	private Image background;
	
	public NineCardSiegeGamePanel(ObservableGame game){
		this.game = game;
		
		setupComponents();
		setupLayout();
	}
	
	private void setupComponents(){
		startOptionPanel = new StartOptionPanel(game);
		startOptionPanel.setPreferredSize(new Dimension(450,0));
		
		enemyTrackPanel = new EnemyTrackPanel(game);
		enemyTrackPanel.setPreferredSize(new Dimension(450,0));
    
		statusCardPanel = new StatusCardPanel(game);
        statusCardPanel.setPreferredSize(new Dimension(450,0));
	}
	
	private void setupLayout()
    {
		setLayout(new BorderLayout());
		setBackground(Color.darkGray);
      
      
		setupNorth();
		setupCenter();
      	setupSouth();
      	setupEast();
      	setupWest();
      	
     
      	//pNorth.add(logo);
      	pCenterLeft.add(cardSelected);
      	pCenterRight.add(gameButtons);
       

      	// pSouth.add(cards);

      	pWest.add(enemyTrackPanel, BorderLayout.WEST);
      	pEast.add(statusCardPanel, BorderLayout.EAST);




        add(pNorth, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
        add(pSouth, BorderLayout.SOUTH);

        add(pEast, BorderLayout.EAST);
        add(pWest, BorderLayout.WEST);

        //add(mainPanel, BorderLayout.CENTER);
        validate();
    }
	
	// Setup Panels
	
	private void setupNorth() {
        pNorth = new JPanel();
        pNorth.setOpaque(false);
        pNorth.setLayout(new BorderLayout());
        pNorth.setBorder(new EmptyBorder(0, 45, 0, 0));
    }

    private void setupCenter() {
        pCenter = new JPanel();
        pCenter.setOpaque(false);
        pCenter.setLayout(new BorderLayout());
        pCenter.setBorder(new EmptyBorder(0, 0, 0, 100));
        


        pCenterLeft = new JPanel();
        pCenterLeft.setLayout(new BorderLayout());
        pCenterLeft.setBorder(new EmptyBorder(0, 0, 20, 0));
        pCenterLeft.setOpaque(false);

        pCenterRight = new JPanel();
        pCenterRight.setLayout(new BoxLayout(pCenterRight, BoxLayout.Y_AXIS));
        pCenterRight.setOpaque(false);


        pCenter.add(pCenterLeft, BorderLayout.WEST);
        pCenter.add(pCenterRight, BorderLayout.EAST);
    }

    private void setupSouth() {
        pSouth = new JPanel();
        pSouth.setOpaque(false);
        pSouth.setLayout(new BorderLayout());

        pSouthLeft = new JPanel();
        pSouthLeft.setOpaque(false);
        pSouthLeft.setLayout(new BorderLayout());
       // pSouthLeft.add(dPanel);
        pSouthLeft.setBorder(new EmptyBorder(0, 0, 5, 90));

        pSouthRight = new JPanel();
        pSouthRight.setOpaque(false);
        pSouthRight.setLayout(new BorderLayout());
       // pSouthRight.add(logsPanel, BorderLayout.EAST);
        pSouthRight.setBorder(new EmptyBorder(0, 90, 5, 25));

        pSouthCenter = new JPanel();
        pSouthCenter.setOpaque(false);
        pSouthCenter.setLayout(new GridBagLayout());
        pSouthCenter.setBorder(new EmptyBorder(0, 20, 5, 0));

       // pSouthCenter.add(cards);


        pSouth.setBorder(new EmptyBorder(0, 30, 5, 0));

        pSouth.add(pSouthCenter, BorderLayout.CENTER);
        pSouth.add(pSouthRight, BorderLayout.EAST);
        pSouth.add(pSouthLeft, BorderLayout.WEST);
    }

    private void setupEast() {
         pEast = new JPanel();
        pEast.setOpaque(false);

        pEast.setLayout(new BorderLayout());
        pEast.setBorder(new EmptyBorder(0, 0, 0, 20));
    }

    private void setupWest() {
        pWest = new JPanel();
        pWest.setOpaque(false);

        pWest.setLayout(new BorderLayout());

    }
	
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if(!(game.getState() instanceof AwaitBeginning))
            g.drawImage(background, 0, 0, this);


        if(game.getState() instanceof AwaitBeginning){

            remove(pCenter);
            add(startOptionPanel, BorderLayout.CENTER);

            pNorth.setVisible(false);
            pSouth.setVisible(false);
            pEast.setVisible(false);
            pWest.setVisible(false);
            pCenter.setVisible(false);
            startOptionPanel.setVisible(true);
        }
        else {
            remove(startOptionPanel);

            add(pCenter, BorderLayout.CENTER);

            pNorth.setVisible(true);
            pSouth.setVisible(true);;
            pEast.setVisible(true);
            pWest.setVisible(true);
            pCenter.setVisible(true);
            startOptionPanel.setVisible(false);
        }
    }
    
	@Override
    public void update(Observable o, Object arg) {
        setBackground(Color.blue);
        revalidate();
        repaint();
    }
}
