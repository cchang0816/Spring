package com.itbank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.dao.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired private BoardDAO dao;

	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}
	
}
