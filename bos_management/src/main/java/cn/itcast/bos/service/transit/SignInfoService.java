package cn.itcast.bos.service.transit;

import cn.itcast.bos.domain.transit.SignInfo;

public interface SignInfoService {

	void save(String transitInfoId, SignInfo signInfo);

}
