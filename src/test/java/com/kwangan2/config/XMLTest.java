package com.kwangan2.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class XMLTest {
	
	@Setter(onMethod_ = @Autowired)
	private Person person;
	
	@Setter(onMethod_ = @Autowired)
	private Pet pet;
	
	@Test
	public void testExist() {
//		assertNotNull(person);
//		
//		person.setName("홍길동");
//		person.setAge(20);
//		
//		person.getPet().setName("해피");
//		person.getPet().setAge(5);
//		
//		log.info("====================");
//		log.info(person.getAge()+"살인 "+person.getName()+"이 "+person.getPet().getAge()+"살인 "+person.getPet().getName()+"를 키웁니다!");
//		log.info("====================");
		
		pet.setName("해피");
		pet.setAge(5);
		person.setPet(pet);
		person.setName("홍길동");
		person.setAge(20);
		
		log.info(person.getAge()+"살인 "+person.getName()+"이 "+pet.getAge()+"살인 "+pet.getName()+"를 키웁니다!");
	}

}
