package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
  
	/*
	 * @ModelAttribute public void commonModelAttribute(Model m) {
	 * m.addAttribute("common",
	 * "this is common ModelAttributr U can get this attribute in all mapping by its key"
	 * ); }
	 */
	@Autowired
	private UserService uservice;
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{ 
		m.addAttribute("Header","Registration for Cultural Event");
		return "contact";
	}
	@RequestMapping(path="/processform",method =RequestMethod.POST)
	//public String register(HttpServletRequest request)
	/*public String register(@RequestParam("email") String EmailId,@RequestParam("username") String 
			userName,@RequestParam("password") String password,Model model)*/
	public String register(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		//user.setId(100);
		this.uservice.create(user);
       // model.addAttribute("user", user);
		
		return "registered";
		/*
		 * User user=new User(); user.setEmail(EmailId); user.setUsername(userName);
		 * user.setPassword(password);
		 */
		
		/*
		 * model.addAttribute("emailId",EmailId); model.addAttribute("userName",
		 * userName); model.addAttribute("pass",password);
		 */
		
	}
}
