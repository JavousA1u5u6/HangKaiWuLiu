package cn.itcast.bos.domain.page;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import cn.itcast.bos.domain.take_delivery.Promotion;

// 自定义 分页数据封装对象 
@XmlRootElement(name = "pageBean")
@XmlSeeAlso({ Promotion.class })
public class PageBean<T> {

	private long totalCount; // 总记录数
	private List<T> pageData; // 当前页数据

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getPageData() {
		return pageData;
	}

	public void setPageData(List<T> pageData) {
		this.pageData = pageData;
	}

}
