package isoServer.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

    public static void main(String args[]) {

        Session session = HibernateHelper.getSessionFactory().getCurrentSession();
        Transaction tx = session.getTransaction();

        tx.begin();

        ISOTransaction isotrans = new ISOTransaction();
        isotrans.setAccName("john paul");
        isotrans.setAccAmt("12,000");
        session.save(isotrans);

        tx.commit();

    }
}
