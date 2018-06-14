package main.java.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.board.model.NoticeBean;
import main.java.common.dao.RamsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

public class NoticeDao extends RamsJdbcDaoSupport implements INoticeDao {

	protected void initDao() throws Exception {
		super.initDao();
	}

	// 공지사항 조회
	public List getNoticeList(NoticeBean searchBean, String currentPage,
			String countPerPage) {
		GetNoticeList getNoticeList = new GetNoticeList(getDataSource());

		Object[] values = { searchBean.getSEARCH_TERM1(),
				searchBean.getSEARCH_TERM2(), searchBean.getSEARCH_TERM3(),
				currentPage, countPerPage, countPerPage };
		
		for(int i = 0;i < values.length;i++){
			System.out.println("::공지사항조회::"+values[i]);
			
		}

		return getNoticeList.execute(values);
	}

	class GetNoticeList extends MappingSqlQuery {
		protected GetNoticeList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.board.notice.NoticeList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			NoticeBean bean = new NoticeBean();
			bean.setRNUM(rs.getString("RNUM"));
			bean.setSEQNUM(rs.getString("SEQNUM"));
			bean.setTITLE(rs.getString("TITLE"));
			bean.setCONTENT(rs.getString("CONTENT"));
			bean.setREGISTDATE(rs.getString("REGISTDATE"));
			bean.setVIEWCNT(rs.getString("VIEWCNT"));
			bean.setUSERID(rs.getString("USERID"));
			bean.setREGISTNAME(rs.getString("REGISTNAME"));

			return bean;
		}
	}

	// 공지사항 조회 개수
	public int getNoticeListCount(NoticeBean searchBean) {
		Object[] values = { searchBean.getSEARCH_TERM1(),
				searchBean.getSEARCH_TERM2(), searchBean.getSEARCH_TERM3() };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.board.notice.NoticeListCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 공지사항 입력
	public boolean setNoticeInsert(NoticeBean noticeBean) {
		SetNoticeInsert setNoticeInsert = new SetNoticeInsert(getDataSource());
		Object[] values = { noticeBean.getTITLE(), noticeBean.getCONTENT(),
				noticeBean.getUSERID(), noticeBean.getREGISTNAME() };

		for (int i = 0; i < values.length; i++) {
			System.out.println("공지사항 글 입력 : : " + values[i]);
		}

		int returnVal = setNoticeInsert.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class SetNoticeInsert extends SqlUpdate {
		public SetNoticeInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.notice.NoticeInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 공지사항 글보기
	public NoticeBean getNoticeView(String SEQNUM) {
		GetNoticeView getNoticeView = new GetNoticeView(getDataSource());

		Object[] values = {SEQNUM};

		return (NoticeBean) getNoticeView.execute(values).get(0);
	}

	class GetNoticeView extends MappingSqlQuery {
		protected GetNoticeView(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.board.notice.NoticeView"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			NoticeBean bean = new NoticeBean();
			bean.setSEQNUM(rs.getString("SEQNUM"));
			bean.setTITLE(rs.getString("TITLE"));
			bean.setCONTENT(rs.getString("CONTENT"));
			bean.setREGISTDATE(rs.getString("REGISTDATE"));
			bean.setVIEWCNT(rs.getString("VIEWCNT"));
			bean.setUSERID(rs.getString("USERID"));
			bean.setREGISTNAME(rs.getString("REGISTNAME"));

			return bean;
		}
	}

	// 공지사항 글삭제
	public boolean setNoticeDelete(String SEQNUM) {
		SetNoticeDelete setNoticeDelete = new SetNoticeDelete(getDataSource());
		Object[] values = { SEQNUM };
		int returnVal = setNoticeDelete.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class SetNoticeDelete extends SqlUpdate {
		public SetNoticeDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.notice.NoticeDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 공지사항 수정
	public boolean setNoticeUpdate(NoticeBean noticeBean) {
		SetNoticeUpdate setNoticeUpdate = new SetNoticeUpdate(getDataSource());
		Object[] values = { noticeBean.getTITLE(), noticeBean.getCONTENT(),noticeBean.getSEQNUM()};

		for (int i = 0; i < values.length; i++) {
			System.out.println("공지사항 글 입력 : : " + values[i]);
		}

		int returnVal = setNoticeUpdate.update(values);

		if (returnVal == 1)
			return true;
		else
			return false;
	}

	class SetNoticeUpdate extends SqlUpdate {
		public SetNoticeUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.notice.NoticeUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 공지사항 카운트
	public void setNoticeCntUpdate(String SEQNUM) {
		SetNoticeCntUpdate setNoticeCntUpdate = new SetNoticeCntUpdate(
				getDataSource());
		Object[] values = { SEQNUM };
		setNoticeCntUpdate.update(values);
	}

	class SetNoticeCntUpdate extends SqlUpdate {
		public SetNoticeCntUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.board.notice.NoticeCntUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

}
