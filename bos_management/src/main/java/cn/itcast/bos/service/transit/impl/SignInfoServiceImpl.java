package cn.itcast.bos.service.transit.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.dao.transit.SignInfoRepository;
import cn.itcast.bos.dao.transit.TransitInfoRepository;
import cn.itcast.bos.domain.transit.SignInfo;
import cn.itcast.bos.domain.transit.TransitInfo;
import cn.itcast.bos.index.WayBillIndexRepository;
import cn.itcast.bos.service.transit.SignInfoService;

@Service
@Transactional
public class SignInfoServiceImpl implements SignInfoService {

	@Autowired
	private SignInfoRepository signInfoRepository;

	@Autowired
	private TransitInfoRepository transitInfoRepository;

	@Autowired
	private WayBillIndexRepository wayBillIndexRepository;

	@Override
	public void save(String transitInfoId, SignInfo signInfo) {
		// 保存签收录入信息
		signInfoRepository.save(signInfo);
		// 关联运输流程
		TransitInfo transitInfo = transitInfoRepository.findOne(Integer
				.parseInt(transitInfoId));
		transitInfo.setSignInfo(signInfo);

		// 更改状态
		if (signInfo.getSignType().equals("正常")) {
			// 正常签收
			transitInfo.setStatus("正常签收");
			// 更改运单状态
			transitInfo.getWayBill().setSignStatus(3);
			// 更改索引库
			wayBillIndexRepository.save(transitInfo.getWayBill());
		} else {
			// 异常
			transitInfo.setStatus("异常");
			// 更改运单状态
			transitInfo.getWayBill().setSignStatus(4);
			// 更改索引库
			wayBillIndexRepository.save(transitInfo.getWayBill());
		}
	}
}
