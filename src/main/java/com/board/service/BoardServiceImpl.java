package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.BoardVO;
import com.board.model.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	// 게시글 등록
	@Override
	public void enroll(BoardVO board) {

		mapper.enroll(board);

	}

	// 게시판 목록
	@Override
	public List<BoardVO> getList() {

		return mapper.getList();
		
	}
	
	// 게시판 목록(페이징)
	@Override
	public List<BoardVO> getListPaging(Criteria cri) {
		
		return mapper.getListPaging(cri);
		
	}

	
	// 게시글 조회
	@Override
	public BoardVO getPage(int bno) {
		
		return mapper.getPage(bno);
		
	}
	
	
	// 게시글 수정
	@Override
	public int modify(BoardVO board) {
		
		return mapper.modify(board);
		
	}
	
	
	// 게시글 삭제
	@Override
	public int delete(int bno) {
		
		return mapper.delete(bno);
		
	}
	
	// 게시물 총 개수
	@Override
	public int getTotal(Criteria cri) {
		
		return mapper.getTotal(cri);
		
	}
	
}
