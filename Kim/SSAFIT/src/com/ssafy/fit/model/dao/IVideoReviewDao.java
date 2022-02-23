package com.ssafy.fit.model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.ssafy.fit.model.VideoReview;

public interface IVideoReviewDao {
	int insertReview(VideoReview videoReview) throws IOException;
	List<VideoReview> selectReview(int videoNo);
}
