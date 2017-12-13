package cn.itcast.bos.service.base;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import cn.itcast.bos.domain.base.Courier;

/**
 * 快递员操作接口
 * 
 * @author itcast
 *
 */
public interface CourierService {

	// 保存快递员
	public void save(Courier courier);

	// 分页查询
	public Page<Courier> findPageData(Specification<Courier> specification,
			Pageable pageable);

	// 批量作废
	public void delBatch(String[] idArray);

	// 查询未关联定区的快递员
	public List<Courier> findNoAssociation();

}
