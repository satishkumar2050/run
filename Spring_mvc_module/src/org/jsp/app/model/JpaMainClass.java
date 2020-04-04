package org.jsp.app.model;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMainClass
{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Spring_mvc_module");
	EntityManager manager =  factory.createEntityManager();
	public void register(String name, String number, String email, String password)
	{
		manager.getTransaction().begin();
		Jpa jpa=new Jpa();
		jpa.setUserName(name);
		jpa.setPhoneNo(number);
		jpa.setEmail(email);
		jpa.setPassword(password);
		manager.persist(jpa);
		manager.getTransaction().commit();
	}
	public boolean change(String number, String email, String password) 
	{
		manager.getTransaction().begin();
		Jpa j=manager.find(Jpa.class,number);
		if(j.getEmail().equals(email))
		{
			j.setPassword(password);
			manager.getTransaction().commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public void remove(String number) 
	{
		manager.getTransaction().begin();
		Jpa j=manager.find(Jpa.class, number);
		manager.remove(j);
		manager.getTransaction().commit();
	}
	public void signIn(String phone, String password) 
	{
		manager.getTransaction().begin();
		Jpa j= manager.find(Jpa.class,phone);
		if(j.getPassword().equals(password))
		{
			System.out.println("successfully logged in");
		}
	}
}

