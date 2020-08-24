package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Dao.member.memberDao;
import Dao.member.memberQuery;
import Model.member;

@Controller
@RequestMapping("/member")
public class memberController {

		//切換至登入網頁
		@RequestMapping("/login")
		public String login()
		{
			return "login";
		}
		
		//登入帳號與密碼的判斷
		@RequestMapping("/checkUser")
		public String checkUser(HttpSession session,HttpServletRequest request) throws Exception
		{
			String Username=request.getParameter("username");
			String Password=request.getParameter("password");
			
			member m=memberQuery.checkUser(Username, Password);
			
			if(m!=null)
			{
				session.setAttribute("M", m);
				return "loginSuccess";
			}
			else
			{
				return "loginError";
			}
		}
		
		//登入註冊頁面
		@RequestMapping("/addmember")
		public String addmember()
		{
			return "member/addmember";
		}
		
		//登入成功畫面切換至管理頁面
		@RequestMapping("/manager")
		public String manager()
		{
			return "manager";
		}
		//切換到會員管理頁面
		//有購物人員及管理人員頁面
		@RequestMapping("/memberManage")
		public String memberManage(member m) throws Exception
		{
			if(m.getAdmin()== true)
			{
				return "member/adminManage";
			}
			else
			{
				return "member/memberManage";
			}
		}
		//新增會員
		@RequestMapping("/create")
		public String Create(member m) throws Exception
		{	
			
			if(memberQuery.checkUser(m.getUsername())!=null)
			{
				return "member/addError";
			}
			else
			{
				new memberDao().add(m);
				return "redirect:../index.jsp";
			}
		}
		
		//新增會員
				@RequestMapping("/create2")
				public ModelAndView Create2(member m) throws Exception
				{	
					
					if(memberQuery.checkUser(m.getUsername())!=null)
					{
						return new ModelAndView("member/addError");
					}
					else
					{
						new memberDao().add(m);
						return new ModelAndView("member/addSuccess");
					}
				}
		
		//切換到會員查詢頁面
				
		//切換到會員資料更新頁面		
}
