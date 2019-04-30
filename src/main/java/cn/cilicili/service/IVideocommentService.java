package cn.cilicili.service;

import java.util.List;

import cn.cilicili.entity.StanVideoComm;
import cn.cilicili.entity.Videocomment;

public interface IVideocommentService {
	List<Videocomment> findAllVideocomment(String userid);
	boolean deleteVideocomment(int commentid);
	List<StanVideoComm> uniteVideoComm(String userid);
}
