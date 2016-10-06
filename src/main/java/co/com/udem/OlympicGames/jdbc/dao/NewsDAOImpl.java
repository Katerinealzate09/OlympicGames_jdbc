package co.com.udem.OlympicGames.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import co.com.udem.OlympicGames.jdbc.entities.News;

public class NewsDAOImpl implements NewsDAO {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public News findNews(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<News> findNews() {

		String sql = "SELECT * FROM new";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<News> newsList = new  ArrayList<News>();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			if (rs.next()) {
				//System.out.println("info:" + rs.getString("nombrecolumna"));
				
				News news = new News();
				news.setId(rs.getInt("id"));
				news.setTitle(rs.getString("title"));
				news.setDescription(rs.getString("description"));
				news.setImage(rs.getString("image"));
				news.setNewsUrl(rs.getString("newsUrl"));
				newsList.add(news);
				return newsList;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					rs.close();
				}
				if (conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return newsList;

		//return null;
	}

}
