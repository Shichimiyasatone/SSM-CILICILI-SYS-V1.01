package cn.cilicili.service;

import java.util.List;

import cn.cilicili.entity.Usercollection;
import cn.cilicili.entity.Video;

public interface IUserCollectionService {
	List<Integer> videoidlist(String userid);
	List<Video> findbyvid(String userid);
	Video findvbyi(String vid);
	List<Usercollection> findAllUsercollection(String userid);
	boolean deleteUsercollection(String userid, String collection);
	boolean addUsercollection(Usercollection ucollection);
	boolean delUsercollection(String userid, String videoid);
}
