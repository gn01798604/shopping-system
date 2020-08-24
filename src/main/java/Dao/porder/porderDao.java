package Dao.porder;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.implDao;
import Model.member;
import Model.porder;

public class porderDao implements implDao{

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
		porder p=se.get(porder.class, id);
		return p;
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
		porder p=se.get(porder.class, id);
		Transaction tr=se.beginTransaction();
		se.delete(id);
		tr.commit();
		se.close();
		
	}

}
