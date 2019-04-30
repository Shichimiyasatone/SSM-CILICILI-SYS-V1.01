package cn.cilicili.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.cilicili.dao.VideocommentMapper;
import cn.cilicili.entity.StanVideoComm;
import cn.cilicili.entity.Videocomment;
import cn.cilicili.service.IVideocommentService;
@Service
public class VideocommentService implements IVideocommentService{
private VideocommentMapper videocommentMapper;

	public VideocommentMapper getVideocommentMapper() {
	return videocommentMapper;
}
@Resource
public void setVideocommentMapper(VideocommentMapper videocommentMapper) {
	this.videocommentMapper = videocommentMapper;
}

	@Override
	public List<Videocomment> findAllVideocomment(String userid) {
		return videocommentMapper.selectById(userid);
	}
	@Override
	public boolean deleteVideocomment(int commentid) {	
		return videocommentMapper.deleteByPrimaryKey(commentid)>0;
	}
	@Override
	public List<StanVideoComm> uniteVideoComm(String userid) {
		return videocommentMapper.selectUnite(userid);
	}

}
