package lk.ijse.hostelManagementSystem.bo.custom.impl;

import lk.ijse.hostelManagementSystem.Entity.Register;
import lk.ijse.hostelManagementSystem.bo.custom.RegisterBO;
import lk.ijse.hostelManagementSystem.dao.DAOFactory;
import lk.ijse.hostelManagementSystem.dao.custom.RegisterDAO;
import lk.ijse.hostelManagementSystem.dto.RegisterDTO;

import java.util.HashMap;

public class RegisterBOImpl implements RegisterBO {

    RegisterDAO registerDAO = (RegisterDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTER);

    @Override
    public boolean saveUser(RegisterDTO dto) {
        registerDAO.save(new Register(dto.getId(),dto.getName(),dto.getEmail(), dto.getPassword()));
        return true;
    }

    @Override
    public boolean updateUser(RegisterDTO dto) {
        registerDAO.update(new Register(dto.getId(), dto.getPassword()));
        return true;
    }


    @Override
    public boolean checkPassword(String email, String password) {
        HashMap<String,String> allUsers =registerDAO.getAllUserNPasswordMap();
        if(allUsers.containsKey(email)){
            return allUsers.get(email).equals(password);

        }else {

        }
        return false;
    }
}
