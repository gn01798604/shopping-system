package Dao.message;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.implDao;
import Model.message;
import Model.porder;

public class messageDao implements implDao{

	public static void main(String[] args) {
		

	}

	@Override
	public void add(Object o) {
		Session se=implDao.getDb();
		Transaction tr=se.beginTransaction();
		se.save(o);
		tr.commit();
		se.close();
		
	}

	@Override
	public Object get(Integer id) {
		Session se=implDao.getDb();
		message m=se.get(message.class, id);
		return m;
	}

	@Override
	public void update(Object o) {
		Session se=implDao.getDb();
		Transaction tr=se.beginTransaction();
		se.update(o);
		tr.commit();
		se.close();
		
	}

	@Override
	public void delete(Integer id) {
		Session se=implDao.getDb();
		message m=se.get(message.class, id);
		Transaction tr=se.beginTransaction();
		se.delete(id);
		tr.commit();
		se.close();
		
	}

}
