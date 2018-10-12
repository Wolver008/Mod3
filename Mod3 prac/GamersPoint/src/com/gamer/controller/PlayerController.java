package com.gamer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.gamer.bean.PlayerBean;
import com.gamer.service.IPlayerService;

@Controller
public class PlayerController
{
	@RequestMapping("home")
	public String getHome(Model m)
	{
		m.addAttribute("playerObj",new PlayerBean());
		return "home";
 }

	@Autowired
	private IPlayerService pserv;
	
	@RequestMapping(value="store",method=RequestMethod.POST)
	public String storeFlightInfo(Model m,@ModelAttribute("playerObj") PlayerBean p){
		String target=null;
		
		int pid=pserv.addPlayerDetails(p);
		if(pid>0){
	
			m.addAttribute("msg","stored successfully");
			m.addAttribute("pid", pid);
			target="success";
		}
		else{
			target="home";
		}
		return target;
	}
}
