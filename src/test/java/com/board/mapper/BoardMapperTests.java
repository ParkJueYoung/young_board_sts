package com.board.mapper;

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
public class BoardMapperTests {

	private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
	
	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void testEnroll() {
//		
//		BoardVO vo = new BoardVO();
//		
//		vo.setTitle("mapper test");
//		vo.setContent("mapper test");
//		vo.setWriter("mapper test");
//		
//		mapper.enroll(vo);
//		
//	}
	
//	@Test
//	public void testGetList() {
//		
//		List list = mapper.getList();
//		
//		list.forEach(board -> log.info("" + board));
//		
//	}
	
	
//	@Test
//	public void testGetPage() {
//		
//		int bno  = 5;
//		
//		log.info("" + mapper.getPage(bno));
//		
//	}
	
	
//	@Test
//	public void testModify() {
//		
//		BoardVO board = new BoardVO();
//		board.setBno(7);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		
//		int result = mapper.modify(board);
//		log.info("reulst" + result);
//		
//		
//	}
	
//	@Test
//	public void testDelete() {
//		
//		int result = mapper.delete(7);
//		log.info("result : " + result);
//		
//	}
	
	@Test
	public void testGetListPaging() {
		
		Criteria cri = new Criteria();
		
		cri.setPageNum(2);
		
		List list = mapper.getListPaging(cri);
		
		list.forEach(board -> log.info("" + board));
		
	}
	
}
