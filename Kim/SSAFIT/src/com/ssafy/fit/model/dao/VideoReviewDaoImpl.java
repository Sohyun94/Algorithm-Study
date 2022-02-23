package com.ssafy.fit.model.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.ssafy.fit.model.Video;
import com.ssafy.fit.model.VideoReview;

//IVideoReviewDao를 상속받아 구현하세요.
// 추가기능 : json이나 ObjectStream을 이용해 파일에 리뷰들을 관리하는 기능
public class VideoReviewDaoImpl implements IVideoReviewDao {
	private static int reviewNo = 0;
	private Map<Integer, List<VideoReview>> videoReviewDb = new HashMap<>();
	private static VideoReviewDaoImpl instance = new VideoReviewDaoImpl();

	// 싱글턴 패턴
	private VideoReviewDaoImpl() {
	}

	public static VideoReviewDaoImpl getInstance() {
		return instance;
	}

	@Override
	public int insertReview(VideoReview videoReview) throws IOException {
		FileOutputStream fos = new FileOutputStream("data/review.json");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(videoReview);
		return videoReview.getReviewNo();
	}

	@Override
	public List<VideoReview> selectReview(int videoNo) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/review.json")))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				sb.append(str).append("\n");
			}
			String jsonStr = sb.toString();
			Gson gson = new Gson();
			VideoReview[] reviews = gson.fromJson(jsonStr, VideoReview[].class);
			return Arrays.asList(reviews);
		} catch (FileNotFoundException e) {
			String errorMsg = e.getMessage();
			System.out.println(errorMsg);
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		return null;
	}

}
