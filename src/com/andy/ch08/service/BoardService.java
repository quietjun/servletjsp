package com.andy.ch08.service;

import java.sql.Connection;

import com.andy.ch08.dao.BoardDao;
import com.andy.ch08.dao.BoardDaoImpl;
import com.andy.ch08.dto.Board;
import com.andy.ch08.util.JDNIDBUtil;

public class BoardService {
	private static BoardService service = new BoardService();

	public static BoardService getService() {
		return service;
	}

	private BoardService() {
	}

	BoardDao dao = BoardDaoImpl.getImpl();

	public Board getBoardByCommentNo(int commentNo) {
		Connection con = JDNIDBUtil.getInstance().getConnection();
		Board board = null;
		try {
			board = dao.getBoard(JDNIDBUtil.getInstance().getConnection(), commentNo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDNIDBUtil.getInstance().close(con);
		}
		return board;
	}
	
	public int addBoard(Board board) {
		Connection con = JDNIDBUtil.getInstance().getConnection();
		int result = 0;
		try {
			result = dao.addBoard(con, board);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDNIDBUtil.getInstance().close(con);
		}
		return result;
	}
}
