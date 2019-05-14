package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.adaming.entity.TacheHisto;
import com.adaming.service.interfaces.ITacheHistoService;

@Service
@Transactional
public class TacheHistoService extends ServiceGeneriqueImpl<TacheHisto> implements ITacheHistoService{

}
