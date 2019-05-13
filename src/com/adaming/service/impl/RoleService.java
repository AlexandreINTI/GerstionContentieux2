package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.Role;
import com.adaming.service.interfaces.IRoleService;

@Service
@Transactional
public class RoleService extends ServiceGeneriqueImpl<Role> implements IRoleService{

}
