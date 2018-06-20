package logicaJogo;

import java.io.Serializable;
import java.util.*;

public class GameData implements Serializable {
	
	private int day;
	private int dice;
	private int turn;
	public Events evAtual;
	public PlayerActions action;
	private Cards cardSelected;
	private int choice; // 0 - nada 1 - esquerda 2 - meio 3 - direita
	private int secondChoice;
	private int actionP; // action points
	private int freeMovement; // inicia a 0, fica a 1 depois de usado
	private int additionalAP; // inicia a 0, fica a 1 depois de usado
	private boolean change;
	private boolean wrongOption;
	private String text;
	
	// ENEMY Track Card
	private int left_ladder;
	private int mid_ram;
	private int right_siege;
	private int trebuchet;
	
	// STATUS Track Card
	private int left_wall;
	private int mid_morale;
	private int right_supplies;
	private int tunnel;
	private int supplies;
	
	// ACTION Points
	private int sabotagePoints;
	private int moralePoints;
	private int coupurePoints;
	private int raidPoints;
	private int circleAttackPoints;
	private int ladderAttackPoints;
	private int batRamAttackPoints;
	private int siegeTowerAttackPoints;
	private int attackPoints;
	private int closeCombatPoints;

	// ARRAY of Action Calls
	private int[] actionCalls;
	
	public List<Cards> cardsList;
	public List<PlayerActions> actionsList;
	public int[] setActionCalls;
	
	public GameData() {
		day = 0;
		choice = 0;
		turn = 1;
		secondChoice = 0;
		actionP = 0;
		freeMovement = 0;
		additionalAP = 0;
		change = false;
		wrongOption = false;
		text = "";
		
		// INICIALIZE of Enemy Track Card
		left_ladder = 4;
		mid_ram = 4;
		right_siege = 4;
		trebuchet = 3;
		
		// INICIALIZE of Status Track Card
		left_wall = 4;
		mid_morale = 4;
		right_supplies = 4;
		tunnel = 0;
		supplies = 0;
		
		// INICIALIZE of Action Points
		sabotagePoints = 0;
		moralePoints = 0;
		coupurePoints = 0;
		raidPoints = 0;
		circleAttackPoints = 0;
		ladderAttackPoints = 0;
		batRamAttackPoints = 0;
		siegeTowerAttackPoints = 0;
		attackPoints = 0;
		closeCombatPoints = 0;
		
		actionCalls = new int[8];
		for(int i = 0 ; i < 8; i++)
			actionCalls[i] = 1;
		
		
		cardsList = new ArrayList<>();
		cardsList.add(new Cards(1, new E_TrebuchetAttack(3), new E_TrebuchetAttack(2), new E_TrebuchetAttack(1)));
		cardsList.add(new Cards(2, new E_Illness(), new E_GuardsDistracted(), new E_TrebuchetAttack(1)));
		cardsList.add(new Cards(3, new E_SuppliesSpoiled(), new E_BadWeather(), new E_BoilingOil()));
		cardsList.add(new Cards(4, new E_DeathOfALeader(), new E_GateFortified(), new E_FlamingArrows()));
		cardsList.add(new Cards(5, new E_VolleyOfArrows(), new E_Collapsed(), new E_RepairedTrebuchet()));
		cardsList.add(new Cards(6, new E_CoverOfDarkness(), new E_EnemyFatigue(), new E_Rally()));
		cardsList.add(new Cards(7, new E_DeterminedEnemy(), new E_IronShields(), new E_Faith()));
		
		actionsList = new ArrayList<>();
		actionsList.add(new PA_ArchersAttack());
		actionsList.add(new PA_BoilingWaterAttack());
		actionsList.add(new PA_CloseCombatAttack());
		actionsList.add(new PA_Coupure());
		actionsList.add(new PA_RallyTroops());
		actionsList.add(new PA_TunnelMovement());
		actionsList.add(new PA_SupplyRaid());
		actionsList.add(new PA_Sabotage());
		actionsList.add(new PA_AdditionalActionPoints());
	}
	
	

	public int getTurn() {
		return turn;
	}



	public void setTurn(int turn) {
		this.turn = turn;
	}



	public int getSecondChoice() {
		return secondChoice;
	}



	public void setSecondChoice(int secondChoice) {
		this.secondChoice = secondChoice;
	}



	public Cards getCardSelected() {
		return cardSelected;
	}



	public void setCardSelected(Cards cardSelected) {
		this.cardSelected = cardSelected;
	}



	public boolean isWrongOption() {
		return wrongOption;
	}



	public void setWrongOption(boolean wrongOption) {
		this.wrongOption = wrongOption;
	}



	public boolean isChange() {
		return change;
	}



	public void setChange(boolean change) {
		this.change = change;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public List<PlayerActions> getActionsList() {
		return actionsList;
	}



	public void setActionsList(List<PlayerActions> actionsList) {
		this.actionsList = actionsList;
	}



	public PlayerActions getAction() {
		return action;
	}



	public void setAction(PlayerActions action) {
		this.action = action;
	}



	public Events getEvAtual() {
		return evAtual;
	}



	public void setEvAtual(Events evAtual) {
		this.evAtual = evAtual;
	}



	public List<Cards> getCardsList() {
		return cardsList;
	}


	public void setCardsList(List<Cards> cardsList) {
		this.cardsList = cardsList;
	}


	public int getAdditionalAP() {
		return additionalAP;
	}


	public void setAdditionalAP(int additionalAP) {
		this.additionalAP = additionalAP;
	}


	public int getFreeMovement() {
		return freeMovement;
	}


	public void setFreeMovement(int freeMovement) {
		this.freeMovement = freeMovement;
	}


	public int getActionP() {
		return actionP;
	}


	public void setActionP(int actionP) {
		this.actionP = actionP;
	}
	
	public void setActionP_minus(int minus) {
		this.actionP -= minus;
	}
	
	public void setActionP_plus(int plus) {
		this.actionP += plus;
	}


	public int getChoice() {
		return choice;
	}


	public void setChoice(int choice) {
		this.choice = choice;
	}


	public int getLadderAttackPoints() {
		return ladderAttackPoints;
	}


	public void setLadderAttackPoints(int ladderAttackPoints) {
		this.ladderAttackPoints = ladderAttackPoints;
	}


	public int getCloseCombatPoints() {
		return closeCombatPoints;
	}


	public void setCloseCombatPoints(int closeCombatPoints) {
		this.closeCombatPoints = closeCombatPoints;
	}


	public int getRaidPoints() {
		return raidPoints;
	}


	public void setRaidPoints(int raidPoints) {
		this.raidPoints = raidPoints;
	}


	public int getCoupurePoints() {
		return coupurePoints;
	}


	public void setCoupurePoints(int coupurePoints) {
		this.coupurePoints = coupurePoints;
	}


	public int getAttackPoints() {
		return attackPoints;
	}


	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}


	public int getBatRamAttackPoints() {
		return batRamAttackPoints;
	}


	public void setBatRamAttackPoints(int batRamAttackPoints) {
		this.batRamAttackPoints = batRamAttackPoints;
	}


	public int getCircleAttackPoints() {
		return circleAttackPoints;
	}

	public void setCircleAttackPoints(int circleAttackPoints) {
		this.circleAttackPoints = circleAttackPoints;
	}


	public int[] getActionCalls() {
		return actionCalls;
	}

	public void setActionCalls(int[] actionCalls) {
		for(int action:actionCalls)
			this.actionCalls[action] = 0;
	}

	public int getMoralePoints() {
		return moralePoints;
	}

	public void setMoralePoints(int moralePoints) {
		this.moralePoints = moralePoints;
	}

	public int RollDice() {
		return (int)(Math.random()*6) + 1;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}
	
	public int getSabotagePoints() {
		return sabotagePoints;
	}
	
	public void setSabotagePoints(int sabotagePoints) {
		this.sabotagePoints = sabotagePoints;
	}

	public int getLeft_ladder() {
		return left_ladder;
	}

	public void setLeft_ladder(int left_ladder) {
		this.left_ladder = left_ladder;
	}
	
	public void setLeft_ladder_minus(int minus) {
		this.left_ladder -= minus;
	}

	public void setLeft_ladder_plus(int plus) {
		this.left_ladder += plus;
	}
	
	public int getMid_ram() {
		return mid_ram;
	}

	public void setMid_ram(int mid_ram) {
		this.mid_ram = mid_ram;
	}
	
	public void setMid_ram_minus(int minus) {
		this.mid_ram -= minus;
	}
	
	public void setMid_ram_plus(int plus) {
		this.mid_ram += plus;
	}

	public int getRight_siege() {
		return right_siege;
	}

	public void setRight_siege(int right_siege) {
		this.right_siege = right_siege;
	}
	
	public void setRight_siege_minus(int minus) {
		this.right_siege -= minus;
	}
	
	public void setRight_siege_plus(int plus) {
		this.right_siege += plus;
	}

	public int getTrebuchet() {
		return trebuchet;
	}

	public void setTrebuchet(int trebuchet) {
		this.trebuchet = trebuchet;
	}
	
	public void setTrebuchet_plus(int plus) {
		this.trebuchet += plus;
	}
	
	public void setTrebuchet_minus(int minus) {
		this.trebuchet -= minus;
	}

	public int getLeft_wall() {
		return left_wall;
	}

	public void setLeft_wall(int left_wall) {
		this.left_wall = left_wall;
	}
	
	public void setLeft_wall_plus(int plus) {
		this.left_wall += plus;
	}
	
	public void setLeft_wall_minus(int minus) {
		this.left_wall -= minus;
	}

	public int getMid_morale() {
		return mid_morale;
	}

	public void setMid_morale(int mid_morale) {
		this.mid_morale = mid_morale;
	}
	
	public void setMid_morale_minus(int minus) {
		this.mid_morale -= minus;
	}
	
	public void setMid_morale_plus(int plus) {
		this.mid_morale += plus;
	}

	public int getRight_supplies() {
		return right_supplies;
	}

	public void setRight_supplies(int right_supplies) {
		this.right_supplies = right_supplies;
	}
	
	public void setRight_supplies_minus(int minus) {
		this.right_supplies -= minus;
	}
	
	public void setRight_supplies_plus(int plus) {
		this.right_supplies += plus;
	}

	public int getTunnel() {
		return tunnel;
	}

	public void setTunnel(int tunnel) {
		this.tunnel = tunnel;
	}
	
	public void setTunnel_minus(int minus) {
		this.tunnel -= minus;
	}
	
	public void setTunnel_plus(int plus) {
		this.tunnel += plus;
	}

	public int getSupplies() {
		return supplies;
	}

	public void setSupplies(int supplies) {
		this.supplies = supplies;
	}


	public int getSiegeTowerAttackPoints() {
		return siegeTowerAttackPoints;
	}


	public void setSiegeTowerAttackPoints(int siegeTowerAttackPoints) {
		this.siegeTowerAttackPoints = siegeTowerAttackPoints;
	}
	

	public void baralhaCartas(){
		Collections.shuffle(cardsList);
	}
	
	public void lCheck(int tunnel){
	
	}
}
