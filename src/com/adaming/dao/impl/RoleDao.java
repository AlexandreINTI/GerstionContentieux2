package com.adaming.dao.impl;

import org.springframework.stereotype.Repository;

import com.adaming.dao.interfaces.IRoleDao;
import com.adaming.entity.Role;

@Repository
public class RoleDao extends DaoGeneriqueImpl<Role> implements IRoleDao{

}
