package Dao.member;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.implDao;
import Fact.factModel;
import Fact.modelDi;
import Model.member;

public class memberDao implements implDao{

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spModel.xml"); 
		ApplicationContext a2=new AnnotationConfigApplicationContext(modelDi.class);
		factModel fm=a2.getBean(factModel.class,"factModel");
		//fm.getM().setName("Louis");
		//System.out.println(fm.getM().getName());
		
		new memberDao().delete(16);
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
		member m=se.get(member.class, id);
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
		member m=se.get(member.class, id);
		Transaction tr=se.beginTransaction();
		se.delete(id);
		tr.commit();
		se.close();
	}

}
