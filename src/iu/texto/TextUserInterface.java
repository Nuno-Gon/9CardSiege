package iu.texto;

import logicaEstados.*;
import logicaJogo.*;
import java.util.*;

public class TextUserInterface {

	private final Game g;
	Scanner sc;
	
	public TextUserInterface(Game game)
    {
        g = game; 
        sc = new Scanner(System.in);
    }
	
	public void run(){
		int x=1;
		while(x==1) {
			if(g.getState() instanceof AwaitBeginning)
				InputAwaitBeginning();
			if(g.getState() instanceof AwaitEnemyLineCheck)
				InputAwaitEnemyLineCheck();
			if(g.getState() instanceof AwaitCardSelection)
				InputAwaitCardSelection();
			if(g.getState() instanceof AwaitEventPhase)
				InputAwaitEventPhase();
		}
	}
	
	public boolean checkLimits(int min,int max,int value)
    {
        return value>min ||  value<max;
    }
	
	public void InputAwaitBeginning() {
		System.out.println(" 1 -> Começar Jogo");
		System.out.println(" 2 -> Carregar Jogo");
		
		int escolhainit = sc.nextInt();
		
		System.out.println();
		
		if(checkLimits(1,2,escolhainit)) {
			if(escolhainit == 1) {
				g.ResolveStart();
			}
		}
	}
	
	public void InputAwaitEnemyLineCheck() {
		boolean i = Boolean.FALSE;
		boolean u = Boolean.FALSE;
		g.ResolveLineCheck(i,u);
		//System.out.println(i);
		if(i == Boolean.TRUE) {
			System.out.println("You lost your soldiers in the Enemy Line");
		}
		else if(u == Boolean.TRUE) {
			System.out.println("Your soldiers on the Enemy Line were undetected");
			}
			else {
				System.out.println("You don't have any soldier on the Enemy Line");
			}
		g.ResolveAdvance();
	}
	
	public void InputAwaitCardSelection() {
		g.ResolveCard();
	}
	
	public void InputAwaitEventPhase() {
		System.out.print("Name: ");
		System.out.println(g.getGameData().getEvAtual().evName);
		System.out.print("Description: ");
		System.out.println(g.getGameData().getEvAtual().event);
		System.out.print("Action points: ");
		System.out.println(g.getGameData().getEvAtual().evName);
		System.out.print("Enemy Advancement Order(s): ");
		for(int c = 0; c < g.getGameData().getEvAtual().enemyAdOrder.length ; c++) {
			if(g.getGameData().getEvAtual().enemyAdOrder[c] == 0)
				System.out.print("None");
			if(g.getGameData().getEvAtual().enemyAdOrder[c] == 1)
				System.out.print("Ladder\t");
			if(g.getGameData().getEvAtual().enemyAdOrder[c] == 2)
				System.out.print("Battering Ram\t");
			if(g.getGameData().getEvAtual().enemyAdOrder[c] == 3)
				System.out.print("Tower Siege\t");
			if(g.getGameData().getEvAtual().enemyAdOrder[c] == 4)
				System.out.print("Ladder\tBattering Ram\tTower Siege");
		}
		
		
	}
}
