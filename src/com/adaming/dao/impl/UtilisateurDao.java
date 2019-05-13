package com.adaming.dao.impl;

import org.springframework.stereotype.Repository;

import com.adaming.dao.interfaces.IUtilisateurDao;
import com.adaming.entity.Utilisateur;

@Repository
public class UtilisateurDao extends DaoGeneriqueImpl<Utilisateur> implements IUtilisateurDao{

}
