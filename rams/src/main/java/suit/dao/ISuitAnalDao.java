package main.java.suit.dao;

import java.util.List;

public interface ISuitAnalDao {
	public List getSuitAnalGuList(String fromDate, String toDate);
	public List getSuitAnalLineList(String fromDate, String toDate);
}
