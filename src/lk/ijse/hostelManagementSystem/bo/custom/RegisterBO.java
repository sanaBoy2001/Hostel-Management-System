package lk.ijse.hostelManagementSystem.bo.custom;

import lk.ijse.hostelManagementSystem.bo.SuperBO;
import lk.ijse.hostelManagementSystem.dto.RegisterDTO;

public interface RegisterBO extends SuperBO {
    boolean saveUser(RegisterDTO dto);

    boolean updateUser(RegisterDTO regesterDTO);

    boolean checkPassword(String email , String password);
}
