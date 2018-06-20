package logicaJogo;
import java.io.Serializable;

public class PA_TunnelMovement extends PlayerActions implements Serializable {
	
	public PA_TunnelMovement() {
		this.apName = "Tunnel Movement";
	}
	
	@Override
	public void action(GameData gameData) {
		if(gameData.getTunnel() == 0) {
			gameData.setActionP_minus(1);
			gameData.setTunnel_plus(1);
			gameData.setFreeMovement(1); // para não ser possível usar no turno de entrada
			if(gameData.getChoice() == 1) { // escolhe FAST MOVEMENT
				gameData.setActionP_minus(1);
				gameData.setTunnel(3);
			}
			else if(gameData.getChoice() == 2) {
				gameData.setActionP_minus(1);
				gameData.setTunnel(1);
			}
		}
				
		if(gameData.getTunnel() == 3) {
			gameData.setActionP_minus(1);
			gameData.setTunnel_minus(1);
			gameData.setFreeMovement(1); // para não ser possível usar no turno de entrada
			if(gameData.getChoice() == 1) { // escolhe FAST MOVEMENT
				gameData.setActionP_minus(1);
				gameData.setTunnel(0);
				gameData.setRight_supplies_plus(gameData.getSupplies());
				gameData.setSupplies(0);
			}
		}
		
		if(gameData.getTunnel() == 1) {			
			if(gameData.getChoice() == 1) { // escolhe FAST MOVEMENT
				if(gameData.getSecondChoice() == 1) { // escolhe voltar ao castelo
					gameData.setActionP_minus(1);
					gameData.setTunnel(0);
					gameData.setRight_supplies_plus(gameData.getSupplies());
					gameData.setSupplies(0);
				}
				if(gameData.getChoice() == 2) { // escolhe ir para enemy line
					gameData.setTunnel(3);
					gameData.setActionP_minus(1);
				}
			}
			if(gameData.getChoice() == 2) { // escolhe FREE MOVEMENT
				if(gameData.getChoice() == 1) { // escolhe mover-se para o castelo
					gameData.setTunnel_minus(1);
					gameData.setRight_supplies_plus(gameData.getSupplies());
					gameData.setSupplies(0);
				}
				if(gameData.getChoice() == 2) { // escolhe mover se para a enemy line
					gameData.setTunnel_plus(1);
				}
			}
		}
		
		if(gameData.getTunnel() == 2) {
			if(gameData.getChoice() == 1) { // escolhe FAST MOVEMENT
				if(gameData.getSecondChoice() == 1) { // escolhe voltar ao castelo
					gameData.setTunnel(0);
					gameData.setActionP_minus(1);
					gameData.setRight_supplies_plus(gameData.getSupplies());
					gameData.setSupplies(0);
				}
				if(gameData.getSecondChoice() == 2) { // escolhe ir para enemy line
					gameData.setTunnel(3);
					gameData.setActionP_minus(1);
				}
			}
			if(gameData.getChoice() == 2) { // escolhe FREE MOVEMENT
				if(gameData.getSecondChoice() == 1) { // escolhe mover-se para o castelo
					gameData.setTunnel_minus(1);
				}
				if(gameData.getSecondChoice() == 2) { // escolhe mover se para a enemy line
					gameData.setTunnel_plus(1);
				}
			}
		}
		
	}

}
