package com.example.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.BoardDAO;
import com.example.dao.FileDAO;
import com.example.domain.BoardVO;
import com.example.domain.FileVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private FileDAO fileDAO;
	
	@Override
	public List<BoardVO> getBoardList(BoardVO vo){
		List<BoardVO> list = boardDAO.getBoardList(vo);
		System.out.println("[BoardService] 리스트 갯수:" + list.size());
		return list;
	}
	
	@Transactional
	public void insertBoard(BoardVO vo, FileVO fvo) {
		if(fvo!=null) {
			fileDAO.insertFile(fvo);
			vo.setFileId(fileDAO.selectId());
		}
		boardDAO.insertBoard(vo);
		System.out.println("게시글 입력완료");
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		System.out.println("게시글 수정완료");
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
		System.out.println("게시글 삭제완료");
	}

	public HashMap getBoard(BoardVO vo) {
		System.out.println("게시글 조회완료");
		return boardDAO.getBoard(vo);
	}

	


}
