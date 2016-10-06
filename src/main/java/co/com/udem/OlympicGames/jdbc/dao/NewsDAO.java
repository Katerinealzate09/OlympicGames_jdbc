package co.com.udem.OlympicGames.jdbc.dao;

import java.util.List;

import co.com.udem.OlympicGames.jdbc.entities.News;

public interface NewsDAO {

	public News findNews(int id);
	public List<News> findNews();
	
}
