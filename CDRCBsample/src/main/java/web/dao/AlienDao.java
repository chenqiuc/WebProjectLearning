package web.dao;

import web.model.Alien;

public class AlienDao {

	
	public Alien getAlien(int aid) {
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Kaml");
		a.setTech("Java");
		return a;
	}
}
