package logicaJogo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cards implements Serializable{

	private int num;
	private List<Events> events;

	public Cards(int num, Events ev1, Events ev2, Events ev3) {
		this.num = num;
		events = new ArrayList<>();
		events.add(ev1);
		events.add(ev2);
		events.add(ev3);
	}
	
	public int getNum() {
		return num;
	}

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public Events getEvents(int day){
		return events.get(day-1);
	}
}
