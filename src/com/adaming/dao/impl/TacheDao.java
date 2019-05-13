package com.adaming.dao.impl;

import org.springframework.stereotype.Repository;

import com.adaming.dao.interfaces.ITacheDao;
import com.adaming.entity.Tache;

@Repository
public class TacheDao extends DaoGeneriqueImpl<Tache> implements ITacheDao{

}
