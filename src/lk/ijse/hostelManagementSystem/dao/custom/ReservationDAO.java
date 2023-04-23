package lk.ijse.hostelManagementSystem.dao.custom;

import lk.ijse.hostelManagementSystem.Entity.Reservation;
import lk.ijse.hostelManagementSystem.dao.SuperDAO;
import lk.ijse.hostelManagementSystem.view.dtm.ReservationDTM;

import java.util.List;

public interface ReservationDAO extends SuperDAO {

    void getStudentId(Reservation enty);

    void getRoomId(Reservation enty);

    String getResevetionId();

    Reservation get(String id);

    // static List<Object> lodeReservation();

    List<ReservationDTM> lodeReservation();

    boolean update(Reservation reservation);

    void save(Reservation reservation);
}
