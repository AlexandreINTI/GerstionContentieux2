package com.adaming.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adaming.entity.Tribunal;
import com.adaming.service.interfaces.ITribunalService;

@Service
@Transactional
public class TribunalService extends ServiceGeneriqueImpl<Tribunal> implements ITribunalService{

}
