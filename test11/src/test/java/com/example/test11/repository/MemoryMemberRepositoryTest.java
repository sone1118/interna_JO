package com.example.test11.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.test11.domain.Member;

class MemoryMemberRepositoryTest {
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach
	public void afterEach() {
		repository.clearStore();
	}
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("jenos");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get();
//		System.out.println("result = " + (result == member));
		assertThat(member).isEqualTo(member);
//		assertThat(member).isEqualTo("hi");
	}
	
	@Test
	public void findByName() {
		Member member1 = new Member();
		member1.setName("Jenos");
		
		Member member2 = new Member();
		member2.setName("Hyejin");
		
		repository.save(member1);
		repository.save(member2);
		Member result = repository.findByName("Jenos").get();
		
		assertThat(result).isEqualTo(member1);
	}
	
	@Test
	public void findAll() {
		Member member1 = new Member();
		member1.setName("Jenos");
		
		Member member2 = new Member();
		member2.setName("Hyejin");
		
		repository.save(member1);
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		assertThat(result.size()).isEqualTo(2);
		
	}

}


