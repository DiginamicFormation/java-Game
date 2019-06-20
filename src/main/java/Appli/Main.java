package Appli;

import javax.persistence.EntityManager;

import data.DatabaseHandle;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = DatabaseHandle.getEntityManagerFactory();

	}

}
