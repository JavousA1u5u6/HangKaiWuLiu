package cn.itcast.bos.service.transit;

import cn.itcast.bos.domain.transit.InOutStorageInfo;

public interface InOutStorageInfoService {

	void save(String transitInfoId, InOutStorageInfo inOutStorageInfo);

}
