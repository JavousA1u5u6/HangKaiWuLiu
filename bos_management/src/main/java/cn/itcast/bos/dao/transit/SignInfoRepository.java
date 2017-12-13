package cn.itcast.bos.dao.transit;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.itcast.bos.domain.transit.SignInfo;

public interface SignInfoRepository extends JpaRepository<SignInfo, Integer> {

}
