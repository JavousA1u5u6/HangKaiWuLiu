package cn.itcast.bos.index;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import cn.itcast.bos.domain.take_delivery.WayBill;

public interface WayBillIndexRepository extends
		ElasticsearchRepository<WayBill, Integer> {

	public List<WayBill> findBySendAddress(String sendAddress);
}
