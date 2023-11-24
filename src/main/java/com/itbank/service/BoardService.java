package com.itbank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {

	public List<BoardVO> getBoards() {
		return new ArrayList<BoardVO>();
	}
	
}
