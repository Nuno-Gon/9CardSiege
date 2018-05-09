package logicaJogo;

import java.io.Serializable;
import java.util.*;

public class GameData implements Serializable {
	
	private int day;
	private int dice;
	
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
	private int circleAttackPoints;
	private int batRamAttackPoints;
	private int siegeTowerAttackPoints;
	private int attackPoints;

	// ARRAY of Action Calls
	private int[] actionCalls;
	
	public List<Cards> cardsList;
	
	public GameData() {
		day = 1;
		
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
		circleAttackPoints = 0;
		batRamAttackPoints = 0;
		siegeTowerAttackPoints = 0;
		attackPoints = 0;
		
		actionCalls = new int[8];
		for(int i = 0 ; i < 8; i++)
			actionCalls[i] = 1;
		
		
		cardsList = new ArrayList<>();
		cardsList.add(new Cards(1, new E_TrebuchetAttack(3), new E_TrebuchetAttack(2), new E_TrebuchetAttack(1)));
		
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

	public int getMid_ram() {
		return mid_ram;
	}

	public void setMid_ram(int mid_ram) {
		this.mid_ram = mid_ram;
	}

	public int getRight_siege() {
		return right_siege;
	}

	public void setRight_siege(int right_siege) {
		this.right_siege = right_siege;
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

	public int getRight_supplies() {
		return right_supplies;
	}

	public void setRight_supplies(int right_supplies) {
		this.right_supplies = right_supplies;
	}
	
	public void setRight_supplies_minus(int minus) {
		this.right_supplies -= minus;
	}

	public int getTunnel() {
		return tunnel;
	}

	public void setTunnel(int tunnel) {
		this.tunnel = tunnel;
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
}
