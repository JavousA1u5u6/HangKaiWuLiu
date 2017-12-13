package cn.itcast.bos.service.transit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.itcast.bos.domain.transit.TransitInfo;

public interface TransitInfoService {

	void createTransits(String wayBillIds);

	Page<TransitInfo> findPageData(Pageable pageable);

}
