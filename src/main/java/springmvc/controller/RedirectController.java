package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one()
	{
		System.out.println("One");
		return "redirect:/two";
	}
	
	@RequestMapping("/anotherOne")
	public RedirectView anotherOne()
	{
		System.out.println("Another One");
		RedirectView redirect=new RedirectView();
		//redirect.setUrl("two");
		redirect.setUrl("https://www.google.com");
		return redirect;
	}
	
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("two");
		return "contact";
	}
	
	
	
	
	
	
	
	
	/*
	 * @RequestMapping("/lastOne") public String lastOne(HttpServletResponse
	 * response) { System.out.println("Last One"); try {
	 * response.sendRedirect("two"); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return ""; }
	 */
}
