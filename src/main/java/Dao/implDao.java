package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface implDao {
	
	//連線方法
	static Session getDb()
	{
		Configuration conn=new Configuration().configure();
		SessionFactory sf=conn.buildSessionFactory();
		Session se=sf.openSession();
		return se;
	}
	
	//新增方法
	public void add(Object o);
	
	//查詢方法
	public Object get(Integer id);
	//修改方法
	public void update(Object o);
	//刪除方法
	public void delete(Integer id);
	
}
