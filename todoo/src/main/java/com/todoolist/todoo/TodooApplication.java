package com.todoolist.todoo;

import com.todoolist.todoo.controller.To_do_list_controller;
import com.todoolist.todoo.entity.To_do_List;
import com.todoolist.todoo.entity.To_do_task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication
public class TodooApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodooApplication.class, args);
	}

	//entity manager & entity manager factory
	private static EntityManagerFactory emf;

	private static EntityManager em;

	static void create_data(){
		 em = emf.createEntityManager();

		 em.getTransaction().begin();

		 To_do_List w_to_do_List = new To_do_List("Lista Trabajo");
		 To_do_List p_to_do_List = new To_do_List("Lista Personal");
		 em.persist(w_to_do_List);
		 em.persist(p_to_do_List);
		 To_do_task task1 = new To_do_task("Doctor apointment","Don't miss the apointent at 6",p_to_do_List);
		 To_do_task task2 = new To_do_task("Family dinner","Dinner with my parents and siblings",p_to_do_List);
		 To_do_task task3 = new To_do_task("Gym","you go to the gym every morning at 7",p_to_do_List);
		 To_do_task task4 = new To_do_task("Skype call","Skype call with the team",w_to_do_List);
		 To_do_task task5 = new To_do_task("Regional meating","smile and get to knoe everyone",w_to_do_List);
		 em.persist(task1);
		 em.persist(task2);
		 em.persist(task3);
		 em.persist(task4);
		 em.persist(task5);
	}
}
