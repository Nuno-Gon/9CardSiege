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
	private int right_suplies;
	private int tunnel;
	private int supplies;
	
	public List<Cards> cardsList;
	
	public GameData() {
		day = 1;
		
		left_wall = 4;
		mid_morale = 4;
		right_suplies = 4;
		
		cardsList = new ArrayList<>();
		cardsList.add(new Cards(1, new E_TrebuchetAttack(3), new E_TrebuchetAttack(2), new E_TrebuchetAttack(1)));
		
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

	public int getRight_suplies() {
		return right_suplies;
	}

	public void setRight_suplies(int right_suplies) {
		this.right_suplies = right_suplies;
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
}
