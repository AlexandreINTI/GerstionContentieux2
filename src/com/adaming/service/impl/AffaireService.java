package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.Affaire;
import com.adaming.service.interfaces.IAffaireService;

@Service
@Transactional
public class AffaireService extends ServiceGeneriqueImpl<Affaire> implements IAffaireService{

}
