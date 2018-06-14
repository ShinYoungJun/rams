package main.java.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;

import main.java.board.model.BoardBean;
import main.java.common.dao.RamsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class BoardDao extends RamsJdbcDaoSupport implements IBoardDao {

	protected void initDao() throws Exception {
		super.initDao();
	}

	// 게시판 조회
	public List getBoardList(BoardBean searchBean, String currentPage,
			String countPerPage) {
		GetBoardList getBoardList = new GetBoardList(getDataSource());

		Object[] values = { searchBean.getSEARCH_TERM1(),
				searchBean.getSEARCH_TERM2(), searchBean.getSEARCH_TERM3(),
				currentPage, countPerPage, countPerPage };
		
		for(int i = 0;i < values.length;i++){
			System.out.println("::게시판조회::"+values[i]);
			
		}

		return getBoardList.execute(values);
	}

	class GetBoardList extends MappingSqlQuery {
		protected GetBoardList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.board.board.BoardList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			BoardBean bean = new BoardBean();
			bean.setRNUM(rs.getString("RNUM"));
			bean.setSEQNUM(rs.getString("SEQNUM"));
			bean.setTITLE(rs.getString("TITLE"));
			bean.setCONTENT(rs.getString("CONTENT"));
			bean.setREGISTDATE(rs.getString("REGISTDATE"));
			bean.setVIEWCNT(rs.getString("VIEWCNT"));
			bean.setREGISID(rs.getString("REGISID"));
			bean.setREGISTNAME(rs.getString("REGISTNAME"));

			return bean;
		}
	}

	// 게시판 조회 개수
	public int getBoardListCount(BoardBean searchBean) {
		Object[] values = { searchBean.getSEARCH_TERM1(),
				searchBean.getSEARCH_TERM2(), searchBean.getSEARCH_TERM3() };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.board.board.BoardListCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 게시판 입력
	public boolean setBoardInsert(BoardBean boardBean) {
		SetBoardInsert setBoardInsert = new SetBoardInsert(getDataSource());
		Object[] values = { boardBean.getTITLE(), boardBean.getCONTENT(),
				boardBean.getREGISID(), boardBean.getREGISTNAME() };

		for (int i = 0; i < values.length; i++) {
			System.out.println("게시판 글 입력 : : " + values[i]);
		}

		int returnVal = setBoardInsert.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class SetBoardInsert extends SqlUpdate {
		public SetBoardInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.board.BoardInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 게시판 글보기
	public BoardBean getBoardView(String SEQNUM) {
		GetBoardView getBoardView = new GetBoardView(getDataSource());

		Object[] values = { SEQNUM };

		return (BoardBean) getBoardView.execute(values).get(0);
	}

	class GetBoardView extends MappingSqlQuery {
		protected GetBoardView(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.board.board.BoardView"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			BoardBean bean = new BoardBean();
			bean.setSEQNUM(rs.getString("SEQNUM"));
			bean.setTITLE(rs.getString("TITLE"));
			bean.setCONTENT(rs.getString("CONTENT"));
			bean.setREGISTDATE(rs.getString("REGISTDATE"));
			bean.setVIEWCNT(rs.getString("VIEWCNT"));
			bean.setREGISID(rs.getString("REGISID"));
			bean.setREGISTNAME(rs.getString("REGISTNAME"));

			return bean;
		}
	}

	// 게시판 글삭제
	public boolean setBoardDelete(String SEQNUM) {
		SetBoardDelete setBoardDelete = new SetBoardDelete(getDataSource());
		Object[] values = { SEQNUM };
		int returnVal = setBoardDelete.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class SetBoardDelete extends SqlUpdate {
		public SetBoardDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.board.BoardDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 게시판 수정
	public boolean setBoardUpdate(BoardBean boardBean) {
		SetBoardUpdate setBoardUpdate = new SetBoardUpdate(getDataSource());
		Object[] values = { boardBean.getTITLE(), boardBean.getCONTENT(),boardBean.getSEQNUM()};

		for (int i = 0; i < values.length; i++) {
			System.out.println("게시판 글 입력 : : " + values[i]);
		}

		int returnVal = setBoardUpdate.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class SetBoardUpdate extends SqlUpdate {
		public SetBoardUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.board.BoardUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 게시판 카운트
	public void setBoardCntUpdate(String SEQNUM) {
		SetBoardCntUpdate setBoardCntUpdate = new SetBoardCntUpdate(
				getDataSource());
		Object[] values = { SEQNUM };
		setBoardCntUpdate.update(values);
	}

	class SetBoardCntUpdate extends SqlUpdate {
		public SetBoardCntUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.board.BoardCntUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

}
