package com.gamer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.gamer.bean.PlayerBean;
@Repository
@Transactional
public class PlayerDaoImpl implements IPlayerDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int  addPlayerDetails(PlayerBean p) {
		System.out.println("in dao");
		em.persist(p);
		System.out.println(p.getPlayerId());
		return p.getPlayerId();
	}

}
