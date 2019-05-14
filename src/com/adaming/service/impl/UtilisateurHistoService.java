package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.Utilisateur;
import com.adaming.service.interfaces.IUtilisateurHistoService;

@Service
@Transactional
public class UtilisateurHistoService extends ServiceGeneriqueImpl<Utilisateur> implements IUtilisateurHistoService{

}
