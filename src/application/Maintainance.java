package application;

import java.util.List;

public class Maintainance {
	
	private List<Room> roomsToClean;

	public List<Room> getRoomsToClean() {
		return roomsToClean;
	}

	public void setRoomsToClean(List<Room> roomsToClean) {
		this.roomsToClean = roomsToClean;
	}
	
	public Boolean isReady(Room roomId) {
		
		return true;
	}

}
