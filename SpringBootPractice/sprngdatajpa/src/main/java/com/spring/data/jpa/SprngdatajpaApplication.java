package com.spring.data.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.data.jpa.dao.UserRepository;
import com.spring.data.jpa.entity.User;


@SpringBootApplication
public class SprngdatajpaApplication {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(SprngdatajpaApplication.class, args);
		UserRepository userBean = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setId(1);
//		user.setName("malaya");
//		user.setCity("bhubaneswae");
//		userBean.save(user);
		
//		User user1 = new User(2, "balaya", "cuttack");
//		User user2 = new User(3, "calaya", "duttack");
//		List<User> userList = List.of(user1,user2);
//		List<User> li = userBean.saveAll(userList);
//		li.forEach(u->System.out.println(u));
		
//		Optional<User> user = userBean.findById(55);
//		User user2 = user.get();
//		user2.setName("kolaveri D");
//		
//		User save = userBean.save(user2);
//		System.out.println(save);
		
//		List<User> allusers = userBean.findAll();
//		allusers.forEach(u->System.out.println(u));
		
//		Optional<User> user = userBean.findById(55);
//		User user2 = user.get();
//		userBean.deleteById(user2.getId());
		
//		List<User> malaya = userBean.findByName("malaya");
//		System.out.println(malaya);
//		malaya.forEach(m->System.out.println(m));
//		
//		List<User> newUser = userBean.findByNameAndCity("malaya", "cuttack");
//		System.out.println(newUser);
		
//		List<User> allUser = userBean.findAllUser();
//		System.out.println(allUser);
//		
//		List<User> userbyName = userBean.findUserByName("malaya");
//		System.out.println(userbyName);
		
		
		
	}

}
