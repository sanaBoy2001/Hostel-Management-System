package lk.ijse.hostelManagementSystem.bo.custom;

import javafx.collections.ObservableList;
import lk.ijse.hostelManagementSystem.bo.SuperBO;
import lk.ijse.hostelManagementSystem.dto.RoomDTO;
import lk.ijse.hostelManagementSystem.view.dtm.RoomDTM;

public interface RoomBO extends SuperBO {
    boolean saveRoom(RoomDTO dto);

    boolean updateRoom(RoomDTO dto);

    RoomDTO searcRoom(String id);

    boolean deleteRoom(String id);

    ObservableList<RoomDTM> getRooms();
}
