package cn.itcast.bos.dao.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.itcast.bos.domain.base.Area;

public interface AreaRepository extends JpaRepository<Area, String>,
		JpaSpecificationExecutor<Area> {

	Area findByProvinceAndCityAndDistrict(String province, String city,
			String district);

}
