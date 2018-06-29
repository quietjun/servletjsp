package com.andy.ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.andy.ch08.dto.Board;
import com.andy.ch08.util.JDNIDBUtil;

public class BoardDaoImpl implements BoardDao {
	private static BoardDaoImpl impl = new BoardDaoImpl();
	public static BoardDaoImpl getImpl(){
		return impl;
	}
	private BoardDaoImpl(){}
	@Override
	public Board getBoard(Connection con, int commentNo) {
		String query = "select * from board where comment_no=?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Board board = null;
		try {
			pstmt =con.prepareStatement(query);
			pstmt.setInt(1, commentNo);
			rset = pstmt.executeQuery();
			while(rset.next()){
				String userId = rset.getString("user_id");
				Timestamp date = rset.getTimestamp("reg_date");
				String commentContent = rset.getString("comment_content");
				board = new Board(commentNo, userId, date, commentContent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDNIDBUtil.getInstance().close(pstmt, rset);
		}
		return board;
		
	}

	@Override
	public int addBoard(Connection con, Board board) {
		String sql = "insert into board (user_id, comment_content) values(?,?)";
		PreparedStatement pstmt = null; 
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getUserId());
			pstmt.setString(2, board.getCommentContent());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDNIDBUtil.getInstance().close(pstmt);
		}
		
		return result;
	}

	@Override
	public int updateBoard(Connection con, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(Connection con, int commentNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Board> getBoardsByUserId(Connection con, String userId) {
		// TODO Auto-generated method stub
		return null;
	}


}
