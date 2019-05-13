package com.adaming.dao.impl;

import org.springframework.stereotype.Repository;

import com.adaming.dao.interfaces.IDocumentDao;
import com.adaming.entity.Document;

@Repository
public class DocumentDao extends DaoGeneriqueImpl<Document> implements IDocumentDao{

}
