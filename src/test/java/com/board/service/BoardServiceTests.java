package com.board.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {
	
	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	
	@Autowired
	private BoardService service;
	
	// 게시글 등록
//	@Test
//	public void testEnroll() {
//		
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("service test");
//		vo.setContent("service test");
//		vo.setWriter("service test");
//		
//		service.enroll(vo);
//	}
	
	// 게시판 목록
//	@Test
//	public void testGetLit() {
//		
//		service.getList().forEach(board -> log.info("" + board));;
//		
//	}
	
//	@Test
//	public void testGETPage() {
//		
//		int bno = 5;
//		
//		log.info("" + service.getPage(bno));
//		
//	}
	
//	@Test
//	public void testModify() {
//		
//		BoardVO board = new BoardVO();
//		board.setBno(7);
//		board.setTitle("수정한 제목2");
//		board.setContent("수정한 제목2");
//		
//		int result = service.modify(board);
//		log.info("result : " + result);
//		
//	}
	
	
//	@Test
//	public void testDelete() {
//		
//		int result = service.delete(6);
//		log.info("result : " + result);
//		
//	}
	
	@Test
	public void testGetListPaging() {
		
		Criteria cri = new Criteria();
		
		List list = service.getListPaging(cri);
		
		list.forEach(board -> log.info("" + board));
		
	}
	
	
	
}
