package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDAO;
import com.example.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;
	
	
	public void insertMemberForm(MemberVO vo) {
		memberDAO.insertMemberForm(vo);
		System.out.println("회원가입완료");
	}
	
}
