package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.Tache;
import com.adaming.service.interfaces.ITacheService;

@Service
@Transactional
public class TacheService extends ServiceGeneriqueImpl<Tache> implements ITacheService{

}
