package Dao.member;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import Dao.implDao;
import Model.member;

public class memberQuery {

	public static void main(String[] args) {
		//System.out.println(memberQuery.checkUser("qqq", "123"));
		System.out.println(memberQuery.checkUser("qqq"));
	}
	
	//檢查有無此組帳號密碼
	public static member checkUser(String username,String password)
	{
		Session se=implDao.getDb();
		String hql="from member as m where m.username=?1 and m.password=?2";
		Query q=se.createQuery(hql);
		q.setParameter(1, username);
		q.setParameter(2, password);
		List l=q.list();
		
		member m=null;
		for(Object o:l)
		{
			m=(member)o;
		}
		
		return m;
	}
	
	//檢查有無重複帳號
		public static member checkUser(String username)
		{
			Session se=implDao.getDb();
			String hql="from member as m where m.username=?1";
			Query q=se.createQuery(hql);
			q.setParameter(1, username);
			List l=q.list();
			
			member m=null;
			for(Object o:l)
			{
				m=(member)o;
			}
			
			return m;
		}
}
