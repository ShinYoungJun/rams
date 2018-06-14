package main.java.suit.service;

import java.util.List;

public interface ISuitAnalService {
	public List getSuitAnalGuList(String fromDate, String toDate);
	public List getSuitAnalLineList(String fromDate, String toDate);

}
