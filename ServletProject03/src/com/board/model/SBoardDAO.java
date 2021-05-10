package com.board.model;

import java.util.ArrayList;

public interface SBoardDAO {
	//�߰�
	public void boardInsert(BoardDTO board);
	//����
	public void boardUpdate(BoardDTO board);
	//��ü����
	public ArrayList<BoardDTO> boardList(int startRow, int endRow, String field, String word);
	//����
	public int boardDelete(int num);
	//�Խñ� ��
	public int boardCount(String filed, String word);
	//�󼼺���
	public BoardDTO findByNum(int num);
	
	
	//---comment---
	public ArrayList<CommentDTO> findAllComment(int bnum);
	public void commentInsert(CommentDTO comment);
	

}
