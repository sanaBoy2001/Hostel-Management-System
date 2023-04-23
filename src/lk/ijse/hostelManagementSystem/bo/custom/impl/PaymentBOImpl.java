package lk.ijse.hostelManagementSystem.bo.custom.impl;

import lk.ijse.hostelManagementSystem.Entity.Reservation;
import lk.ijse.hostelManagementSystem.bo.custom.PaymentBO;
import lk.ijse.hostelManagementSystem.dao.DAOFactory;
import lk.ijse.hostelManagementSystem.dao.custom.QueryDAO;
import lk.ijse.hostelManagementSystem.dao.custom.ReservationDAO;

import java.util.List;

public class PaymentBOImpl implements PaymentBO {

    QueryDAO queryDAO = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);
    ReservationDAO reservationDAO = (ReservationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RESERVATION);


    @Override
    public List<Object[]> getPendingKeyPayments() {
        return queryDAO.getPaymentStutas();
    }

    @Override
    public boolean updatePayment(String resId) {
        Reservation reservation = reservationDAO.get(resId);
        reservation.setStatus("payed");
        return reservationDAO.update(reservation);
    }
}
