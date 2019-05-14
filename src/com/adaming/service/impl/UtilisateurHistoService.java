package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.UtilisateurHisto;
import com.adaming.service.interfaces.IUtilisateurHistoService;

@Service
@Transactional
public class UtilisateurHistoService extends ServiceGeneriqueImpl<UtilisateurHisto> implements IUtilisateurHistoService{

}
