package cn.itcast.bos.service.system;

import java.util.List;

import cn.itcast.bos.domain.system.Permission;
import cn.itcast.bos.domain.system.User;

public interface PermissionService {

	List<Permission> findByUser(User user);

	List<Permission> findAll();

	void save(Permission permission);

}
