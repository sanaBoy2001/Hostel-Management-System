package lk.ijse.hostelManagementSystem.dao.custom;

import lk.ijse.hostelManagementSystem.Entity.Register;
import lk.ijse.hostelManagementSystem.dao.SuperDAO;

import java.util.HashMap;

public interface RegisterDAO extends SuperDAO {

    boolean save(Register entity);

    boolean update(Register register);

    HashMap<String, String> getAllUserNPasswordMap();
}
