package com.javaex.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller

public class GuestbookController {

	//list 조회
	@RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model){
		System.out.println("addList");
		
		GuestbookDao guestbookDao = new GuestbookDao();
		List<GuestbookVo>guestbookList = guestbookDao.guestbookSelect();
		
		model.addAttribute("GuestbookList", guestbookList);
		
		return "/WEB-INF/addList.jsp";
	}
	

	//add
	@RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("add");
		return "/WEB-INF/addList.jsp";
	}
	

}
