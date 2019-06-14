package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;


@Component
public class ConsoleRunner implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//FindAll()
		/*
		 * List<Product> list=repo.findAll(); list.forEach(System.out::println);;
		 */
		 
		/*
		 * 
		 * repo.save(new Product(11,"y",1.4)); repo.save(new Product(13,"u",2.4));
		 * repo.save(new Product(14,"z",3.4)); repo.save(new Product(15,"t",5.4));
		 */
		//Asc
		/*
		 * repo.findAll(Sort.by("prodCode")) .forEach(System.out::println);
		 */
		  //Desc
		/*
		 * repo.findAll(Sort.by(Direction.DESC,"prodCode"))
		 * .forEach(System.out::println);
		 */
		
		PageRequest p=PageRequest.of(1, 2);
		repo.findAll(p)
		.forEach(System.out::println);
		
	}

}
