package lk.ijse.hostelManagementSystem.dao.custom.impl;

import com.sun.xml.bind.v2.model.core.ID;
import lk.ijse.hostelManagementSystem.Entity.Reservation;
import lk.ijse.hostelManagementSystem.Entity.Room;
import lk.ijse.hostelManagementSystem.dao.custom.ReservationDAO;
import lk.ijse.hostelManagementSystem.util.FactoryConfiguration;
import lk.ijse.hostelManagementSystem.view.dtm.ReservationDTM;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ReservationDAOImpl implements ReservationDAO {
    @Override
    public void save(Reservation entity) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        Room room = entity.getRoom();
        room.setQyt(room.getQyt()-1);
        session.update(room);
        transaction.commit();
        session.close();
       // return true;
    }

    @Override
    public boolean update(Reservation entity) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
    }

  //  @Override
    public Reservation serch(ID id) {
        return null;
    }

    //@Override
    public boolean delete(ID id) {
        return true;

    }

    @Override
    public void getStudentId(Reservation enty) {

    }

    @Override
    public void getRoomId(Reservation enty) {

    }

    @Override
    public String getResevetionId() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        List<String> list = session.createQuery("SELECT resId FROM Reservation ORDER BY resId DESC ").setMaxResults(1).list();
        transaction.commit();
        session.close();
        return list.size()>0? String.format("#R%03d",Integer.parseInt(list.get(0).replace("#R",""))+1):"#R001";    }

    @Override
    public Reservation get(String id) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Reservation reservation =session.get(Reservation.class,id);
        transaction.commit();
        session.close();
        return reservation;
    }

    @Override
    public List<ReservationDTM> lodeReservation() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        List<Object[]> list = session.createQuery("FROM Reservation ").list();
        transaction.commit();
        session.close();
        return null;
    }


}
