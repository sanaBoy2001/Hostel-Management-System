package lk.ijse.hostelManagementSystem.bo.custom;

import lk.ijse.hostelManagementSystem.bo.SuperBO;

import java.util.List;

public interface PaymentBO extends SuperBO {

     List<Object[]> getPendingKeyPayments();

    boolean updatePayment(String resId);

}
