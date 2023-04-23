package lk.ijse.hostelManagementSystem.dao;

import lk.ijse.hostelManagementSystem.dao.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }


    public enum DAOTypes {
        STUDENT, ROOM, RESERVATION, REGISTER, QUERY, DASHBOARD
    }


    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case STUDENT:
                return new StudentDAOImpl();
            case ROOM:
                return new RoomDAOImpl();
            case RESERVATION:
                return new ReservationDAOImpl();
            case REGISTER:
                return new RegisterDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            case DASHBOARD:
                return new DashboardDAOImpl();

            default:
                return null;
        }
    }
}

