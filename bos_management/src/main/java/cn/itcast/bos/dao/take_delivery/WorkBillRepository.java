package cn.itcast.bos.dao.take_delivery;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.itcast.bos.domain.take_delivery.WorkBill;

public interface WorkBillRepository extends JpaRepository<WorkBill, Integer> {

}
