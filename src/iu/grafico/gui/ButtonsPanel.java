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

public class ButtonsPanel extends JPanel implements Observer {

	private ObservableGame game;
	private JButton resolve, resolve2cards, b1, b2;
	
	private JButton archersAttackButton;
	private JButton boillingWaterAttackButton;
    private JButton closeCombatButton;
    private JButton coupureButton;
    private JButton rallyTroopsButton;
    private JButton tunnelMovementButton;
    private JButton supplyRaidButton;
    private JButton sabotageButton;
    private JButton nextCardButton;
    private JPanel playerActionButtons;
    
    private JButton towerButton;
    private JButton ramButton;
    private JButton siegeButton;
    private JPanel attackButtons;
    
    private JButton normalRallyButton;
    private JButton suppliesRallyButton;
    private JPanel rallyButtons;
    
    private JButton enterTunnelButton;
    private JButton moveTunnelButton;
    private JPanel tunnelButtons;
    
    private JButton enterTunnelFastButton;
    private JButton enterTunnelFreeButton;
    private JPanel enterTunnelButtons;
    
    private JButton moveTunnelFast;
    private JButton moveTunnelFree;
    private JPanel moveTunnelButtons;
    
    private JButton moveTunnelCastleButton;
    private JButton moveTunnelEnemyLineButton;
    private JPanel moveTunnelDirectionButtons;
    
    private JButton cancelButton;
    
    public ButtonsPanel(ObservableGame g) {
    	this.game = g;
    	game.addObserver(this);
    	setupComponents();
    	
    	setPreferredSize(new Dimension(330,500));
    	setBackground(Color.darkGray);
    	setVisible(game.getState() instanceof AwaitTopCard || game.getState() instanceof AwaitPlayerActions);
    }
    
    private void setupComponents() {
    	playerActionButtons();
    	setPlayerActionButtons();
    	setPlayerActionButtonsListeners();
    }
    
    private void playerActionButtons() {
    	
    	GridBagConstraints gridBagConstraints = new GridBagConstraints();
    	
    	gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        setLayout(new GridLayout(2,1));
        playerActionButtons = new JPanel();
        playerActionButtons.setLayout(new GridLayout(4,2));
        playerActionButtons.setBackground(Color.white);
        archersAttackButton = new JButton("Archers Attack");
        archersAttackButton.setBackground(Color.cyan);
        boillingWaterAttackButton = new JButton("Boilling Water Attack");
        boillingWaterAttackButton.setBackground(Color.cyan);
        closeCombatButton = new JButton("Close Combat");
        closeCombatButton.setBackground(Color.cyan);
        coupureButton = new JButton("Coupure");
        coupureButton.setBackground(Color.cyan);
        rallyTroopsButton = new JButton("Rally Troops");
        rallyTroopsButton.setBackground(Color.cyan);
        tunnelMovementButton = new JButton("Tunnel Movement");
        tunnelMovementButton.setBackground(Color.cyan);
        supplyRaidButton = new JButton("Supply Raid");
        supplyRaidButton.setBackground(Color.cyan);
        sabotageButton = new JButton("Sabotage");
        sabotageButton.setBackground(Color.cyan);
        
        playerActionButtons.add(archersAttackButton);
        playerActionButtons.add(boillingWaterAttackButton);
        playerActionButtons.add(closeCombatButton);
        playerActionButtons.add(coupureButton);
        playerActionButtons.add(rallyTroopsButton);
        playerActionButtons.add(tunnelMovementButton);
        playerActionButtons.add(supplyRaidButton);
        playerActionButtons.add(sabotageButton);
        this.add(playerActionButtons, gridBagConstraints);
        
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        nextCardButton = new JButton("Draw Next Card");
        nextCardButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextCardButton.setBackground(Color.cyan);

        this.add(nextCardButton, gridBagConstraints);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.cyan);
        cancelButton.addMouseListener(new ButtonMouseListener(cancelButton));
        cancelButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev) {
                game.getState().cancel();
            }
         });
    }
    
    private void setPlayerActionButtons() {
    	archersAttackButton.addMouseListener(new ButtonMouseListener(archersAttackButton));
    	boillingWaterAttackButton.addMouseListener(new ButtonMouseListener(boillingWaterAttackButton));
        closeCombatButton.addMouseListener(new ButtonMouseListener(closeCombatButton));
        coupureButton.addMouseListener(new ButtonMouseListener(coupureButton));
        rallyTroopsButton.addMouseListener(new ButtonMouseListener(rallyTroopsButton));
        tunnelMovementButton.addMouseListener(new ButtonMouseListener(tunnelMovementButton));
        supplyRaidButton.addMouseListener(new ButtonMouseListener(supplyRaidButton));
        sabotageButton.addMouseListener(new ButtonMouseListener(sabotageButton));
        nextCardButton.addMouseListener(new ButtonMouseListener(nextCardButton));
    }
    
    private void setPlayerActionButtonsListeners() {
    	archersAttackButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
    		}
		});
    	boillingWaterAttackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {				
			}
		});
    	closeCombatButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {				
			}
		});
    	coupureButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {	
				game.actionCoupure();
			}
		});
    	rallyTroopsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {				
			}
		});
    	tunnelMovementButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {				
			}
		});
    	supplyRaidButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				game.actionSupplyRaid();
			}
		});
    	sabotageButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				game.actionSabotage();				
			}
		});
    	nextCardButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent event) {
				game.actionSkipCard();
			}
		});
    }

	@Override
	public void update(Observable o, Object arg) {
		setVisible(game.getState() instanceof AwaitPlayerActions || game.getState() instanceof AwaitTopCard);
        revalidate();
        repaint();
	}
    
}