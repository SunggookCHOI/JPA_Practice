package run.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.dto.AreaDTO;
import model.dto.FootTrafficDTO;

public class TestDrive {
	
	static void logic(EntityManager em) {
		
		AreaDTO a = new AreaDTO();
		a.setAreaName("aaa");
		a.setSigungu("이구");
		
		em.persist(a);
		
		FootTrafficDTO ft = new FootTrafficDTO();
		ft.setArea(a);
//		ft.setAreaName("aaa");
		ft.setGender("M");
		ft.setDay("FRI");
		ft.setTimes(4);
		ft.setFt(2342);
		
		em.persist(ft);
	}
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saladbowl");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		
		
		try {
			logic(em);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			em.clear();
			factory.close();
		}
		
	}
	
}
