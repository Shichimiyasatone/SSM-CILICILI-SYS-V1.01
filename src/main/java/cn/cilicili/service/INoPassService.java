package cn.cilicili.service;

import java.util.List;

import cn.cilicili.entity.Submission;

public interface INoPassService {
	List<Submission> findAllNoPass(String userid, String state);
	boolean deleteNoPass(int submissionid);
}
