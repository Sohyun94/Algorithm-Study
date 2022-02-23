package com.ssafy.fit.model.dao;

import java.util.List;

import com.ssafy.fit.exception.VideoNotFoundException;
import com.ssafy.fit.model.Video;

public interface IVideoDao {

	// video 목록 조회
	public List<Video> selectVideo();
	// 세부 내용 조회
	public Video selectVideoByNo(int no) throws VideoNotFoundException;
	
}
