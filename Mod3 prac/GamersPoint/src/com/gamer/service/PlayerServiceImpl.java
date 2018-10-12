package com.gamer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamer.bean.PlayerBean;
import com.gamer.dao.IPlayerDao;

@Service
public class PlayerServiceImpl implements IPlayerService {
 
	@Autowired
	private IPlayerDao pdao;
	
	@Override
	public int addPlayerDetails(PlayerBean p ) {
		int b=pdao.addPlayerDetails(p);
		System.out.println("in service "+b);
		return b;
	}

}
