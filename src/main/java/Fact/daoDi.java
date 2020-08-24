package Fact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Dao.member.memberDao;
import Dao.message.messageDao;
import Dao.porder.porderDao;
@Configuration
public class daoDi {
	@Bean(name="md")
	public memberDao getMemberDao()
	{
		return new memberDao();
	}
	
	@Bean(name="pd")
	public porderDao getPorderDao()
	{
		return new porderDao();
	}
	
	@Bean(name="msgd")
	public messageDao getMessageDao()
	{
		return new messageDao();
	}
	
	@Bean(name="factDao")
	public factDao getFactDao()
	{
		factDao f=new factDao();
		f.setMd(getMemberDao());
		f.setPd(getPorderDao());
		f.setMsgd(getMessageDao());
		return f;
	}
}
