package com.example.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.MemberVO;
import com.example.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return "/member/"+ step;
	}
	
	@RequestMapping("/insertMember")
	public String inserMemberForm(MemberVO vo) {
		memberService.insertMemberForm(vo);
		return "redirect:/board/getBoardList";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(MemberVO vo, Model model, HttpSession session) {
		System.out.println(vo.getUserId()+"/");
		
		
	}
}
