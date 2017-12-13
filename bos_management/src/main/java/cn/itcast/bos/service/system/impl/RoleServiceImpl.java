package cn.itcast.bos.service.system.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.dao.system.MenuRepository;
import cn.itcast.bos.dao.system.PermissionRepository;
import cn.itcast.bos.dao.system.RoleRepository;
import cn.itcast.bos.domain.system.Menu;
import cn.itcast.bos.domain.system.Permission;
import cn.itcast.bos.domain.system.Role;
import cn.itcast.bos.domain.system.User;
import cn.itcast.bos.service.system.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PermissionRepository permissionRepository;

	@Autowired
	private MenuRepository menuRepository;

	@Override
	public List<Role> findByUser(User user) {
		// 基于用户查询 角色
		// admin具有所有角色
		if (user.getUsername().equals("admin")) {
			return roleRepository.findAll();
		} else {
			return roleRepository.findByUser(user.getId());
		}
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public void saveRole(Role role, String[] permissionIds, String menuIds) {
		// 保存角色信息
		roleRepository.save(role);
		// 关联权限
		if (permissionIds != null) {
			for (String permissionId : permissionIds) {
				Permission permission = permissionRepository.findOne(Integer
						.parseInt(permissionId));
				role.getPermissions().add(permission);
			}
		}
		// 关联菜单
		if (StringUtils.isNoneBlank(menuIds)) {
			String[] menuIdArray = menuIds.split(",");
			for (String menuId : menuIdArray) {
				Menu menu = menuRepository.findOne(Integer.parseInt(menuId));
				role.getMenus().add(menu);
			}
		}
	}

}
