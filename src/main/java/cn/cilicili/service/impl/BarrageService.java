package cn.cilicili.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cilicili.dao.BarrageMapper;
import cn.cilicili.entity.Barrage;
import cn.cilicili.service.IBarrageService;
@Service
public class BarrageService implements IBarrageService {
private BarrageMapper barrageMapper;
public BarrageMapper getBarrageMapper() {
	return barrageMapper;
}
@Resource
public void setBarrageMapper(BarrageMapper barrageMapper) {
	this.barrageMapper = barrageMapper;
}
	@Override
	public List<Barrage> findAllBarrage(String userid) {
		return barrageMapper.selectById(userid);
	}
	@Override
	public boolean deleteBarrage(int barrageid) {
		return barrageMapper.deleteByPrimaryKey(barrageid)>0;
	}
	@Override
	public List<Barrage> uniteBarrage(String userid) {
		return barrageMapper.selectUnite(userid);
	}
}
