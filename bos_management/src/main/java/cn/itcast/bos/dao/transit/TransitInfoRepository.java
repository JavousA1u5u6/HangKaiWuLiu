package cn.itcast.bos.dao.transit;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.itcast.bos.domain.transit.TransitInfo;

public interface TransitInfoRepository extends
		JpaRepository<TransitInfo, Integer> {

}
