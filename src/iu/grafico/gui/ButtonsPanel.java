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

public class ButtonsPanel extends JPanel implements Observer {

	private ObservableGame game;
	private JButton resolve, resolve2cards, b1, b2;
	
	private JButton archersAttackButton;
	private JButton boilingWaterAttackButton;
    private JButton closeCombatButton;
    private JButton coupureButton;
    private JButton rallyTropsButton;
    private JButton tunnelMovementButton;
    private JButton supplyRaidButton;
    private JButton sabotageButton;
    private JPanel playerActionButtons;
    
    private JButton nextCardButton;
    
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
    	setVisible(game.getState() instanceof AwaitTopCard || game.getState() instanceof AwaitPlayerAction);
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
        archersAttackButton = new JButton("Archers Attack");
        archersAttackButton.setBackground(Color.cyan);
        boilingWaterAttackButton = new JButton("Boiling Water Attack");
        boilingWaterAttackButton.setBackground(Color.cyan);
        closeCombatButton = new JButton("Close Combat");
        closeCombatButton.setBackground(Color.cyan);
        coupureButton = new JButton("Coupure");
        coupureButton.setBackground(Color.cyan);
        rallyTropsButton = new JButton("Rally Trops");
        rallyTropsButton.setBackground(Color.cyan);
        tunnelMovementButton = new JButton("Tunnel Movement");
        tunnelMovementButton.setBackground(Color.cyan);
        supplyRaidButton = new JButton("Supply Raid");
        supplyRaidButton.setBackground(Color.cyan);
        sabotageButton = new JButton("Sabotage");
        sabotageButton.setBackground(Color.cyan);
        
        playerActionButtons.add(archersAttackButton);
        playerActionButtons.add(boilingWaterAttackButton);
        playerActionButtons.add(closeCombatButton);
        playerActionButtons.add(coupureButton);
        playerActionButtons.add(rallyTropsButton);
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
}