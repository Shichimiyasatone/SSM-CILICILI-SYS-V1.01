package cn.cilicili.service;

import java.util.List;

import cn.cilicili.entity.Barrage;



public interface IBarrageService {
	List<Barrage> findAllBarrage(String userid);
	boolean deleteBarrage(int barrageid);
	List<Barrage> uniteBarrage(String userid);
}
