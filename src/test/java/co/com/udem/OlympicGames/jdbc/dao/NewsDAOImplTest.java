package co.com.udem.OlympicGames.jdbc.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jdbc.entities.News;

public class NewsDAOImplTest {

	@Test
	public void testFindNewsInt() {
		fail("Not yet implemented");
	}

	 @Test
	  public void test() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		 NewsDAO nd = (NewsDAO) context.getBean("newsDAO");
		 
		 List<News> newsList = nd.findNews();
		 for(News news1 : newsList){
			 News news = news1;
			 System.out.println(news.getId()+" "+news.getTitle()+" "+news.getDescription()+" "+news.getImage()+" "+news.getNewsUrl());
		 }
	 }
	@Test
	public void testFindNews() {
		fail("Not yet implemented");
	}

}
