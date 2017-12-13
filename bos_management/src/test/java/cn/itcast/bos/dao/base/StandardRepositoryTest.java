package cn.itcast.bos.dao.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class StandardRepositoryTest {
	@Autowired
	private StandardRepository standardRepository; 
	
	@Test
	public void testQuery(){
		System.out.println(standardRepository.queryName2("10-20公斤"));
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testUpdate(){
		standardRepository.updateMinLength(1, 15);
	}
}
