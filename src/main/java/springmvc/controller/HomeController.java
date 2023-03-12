package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
  @RequestMapping(path="/home",method=RequestMethod.GET)
  public String home(Model model)
  {
	  System.out.println("This is Home URL");
	  model.addAttribute("name","Saurabh");
	  model.addAttribute("address","PJR NAGAR GACHIBOWLI,HYDERBAD,TELANGANA-500032");
	 
	  
	  List<String> hob=new ArrayList<String>();
	  hob.add("Cricket");
	  hob.add("BGMI");
	  hob.add("Songs");
	  hob.add("coding");
	  hob.add("Biryani");
	  hob.add("Travel");
	  model.addAttribute("like",hob);
	  return "index";
  }
  
  @RequestMapping("/about")
  public String about()
  {
	  System.out.println("This is about");
	  return "about";
  }
  
  @RequestMapping("/help")
  public ModelAndView help(ModelAndView model)
  {  
	  model.addObject("h","help:support@absyz.com");
	  model.setViewName("help");
	  
	  List<Integer> list=new ArrayList<Integer>();
	  list.add(120);
	  list.add(121);
	  list.add(122);
	  list.add(123);
	  list.add(124);
	  list.add(125);
	  model.addObject("shortlisted", list);
	  return model;
  }
}
