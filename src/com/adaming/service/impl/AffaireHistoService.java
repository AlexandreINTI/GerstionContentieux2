package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.Affaire;
import com.adaming.service.interfaces.IAffaireHistoService;

@Service
@Transactional
public class AffaireHistoService extends ServiceGeneriqueImpl<Affaire> implements IAffaireHistoService{

}
