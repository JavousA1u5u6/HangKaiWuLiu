package cn.itcast.bos.dao.transit;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.itcast.bos.domain.transit.DeliveryInfo;

public interface DeliveryInfoRepository extends
		JpaRepository<DeliveryInfo, Integer> {

}
