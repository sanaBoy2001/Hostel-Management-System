package lk.ijse.hostelManagementSystem.dao.custom.impl;

import lk.ijse.hostelManagementSystem.Entity.Register;
import lk.ijse.hostelManagementSystem.dao.custom.RegisterDAO;
import lk.ijse.hostelManagementSystem.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashMap;
import java.util.List;

public class RegisterDAOImpl implements RegisterDAO {

    @Override
    public boolean save(Register entity) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Register regester) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(regester);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public HashMap<String, String> getAllUserNPasswordMap() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        List<Object[]> list = session.createQuery("SELECT id , password FROM Register ").list();
        transaction.commit();
        session.close();
        HashMap<String,String> userMap = new HashMap<>();
        list.stream().forEach(o -> userMap.put((String)o[0],(String) o[1]));
        return userMap;
    }
}
