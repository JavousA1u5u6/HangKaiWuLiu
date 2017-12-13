package cn.itcast.bos.dao.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import cn.itcast.bos.domain.base.Standard;

public interface StandardRepository extends JpaRepository<Standard, Integer> {
	
	// 根据收派标准名称查询 
	public List<Standard> findByName(String name);
	
	@Query(value="from Standard where name = ?" ,nativeQuery=false)
	// nativeQuery 为 false 配置JPQL 、 为true 配置SQL 
	public List<Standard> queryName(String name);
	
	@Query
	public List<Standard> queryName2(String name);
	
	@Query(value="update Standard set minLength=?2 where id =?1")
	@Modifying
	public void updateMinLength(Integer id , Integer minLength);
}
