package com.andy.ch08.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.andy.ch08.dto.Board;

public interface BoardDao {
	Board getBoard(Connection con, int commentNo);
	int addBoard(Connection con, Board board);
	int updateBoard(Connection con, Board board);
	int deleteBoard(Connection con, int commentNo);
	ArrayList<Board> getBoardsByUserId(Connection con, String userId);
}
