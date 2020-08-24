package Fact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Model.member;
import Model.message;
import Model.porder;

@Configuration
public class modelDi {
	@Bean(name="m")
	public member getMember()
	{
		//return new member();
		member m=new member();
		m.setName("Cat");
		return m;
	}
	
	@Bean(name="p")
	public porder getPorder()
	{
		return new porder();
	}
	
	@Bean(name="msg")
	public message getMessage()
	{
		return new message();
	}
	
	@Bean(name="factModel")
	public factModel getFactModel()
	{
		factModel f=new factModel();
		f.setM(getMember());
		f.setP(getPorder());
		f.setMsg(getMessage());
		return f;
	}
}
