package com.farhan.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	private static EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("bankUnit");
	}

	public static EntityManager getEntityManger() {
		return emf.createEntityManager();
	}
}
