package cn.itcast.bos.web.action.transit;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.domain.transit.InOutStorageInfo;
import cn.itcast.bos.service.transit.InOutStorageInfoService;
import cn.itcast.bos.web.action.common.BaseAction;

// 出入库操作 
@Namespace("/")
@ParentPackage("json-default")
@Controller
@Scope("prototype")
public class InOutStorageInfoAction extends BaseAction<InOutStorageInfo> {

	@Autowired
	private InOutStorageInfoService inOutStorageInfoService;
	
	private String transitInfoId ; 
	
	public void setTransitInfoId(String transitInfoId) {
		this.transitInfoId = transitInfoId;
	}


	@Action(value = "inoutstore_save", results = { 
			@Result(name = "success", type = "redirect", location = "pages/transit/transitinfo.html") })
	public String save() {
		inOutStorageInfoService.save(transitInfoId, model);
		return SUCCESS;
	}

}
