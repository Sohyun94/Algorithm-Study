package com.ssafy.fit.model.dao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.ssafy.fit.exception.VideoNotFoundException;
import com.ssafy.fit.model.Video;

public class VideoDaoImpl implements IVideoDao {

	private static VideoDaoImpl instance = new VideoDaoImpl();

	public static VideoDaoImpl getInstance() {

		return instance;
	}

	private VideoDaoImpl() {

	}

	@Override
	public List<Video> selectVideo() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/video.json")))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				sb.append(str).append("\n");
			}
			String jsonStr = sb.toString();
			Gson gson = new Gson();
			Video[] videos = gson.fromJson(jsonStr, Video[].class);
			return Arrays.asList(videos);
		} catch (FileNotFoundException e) {
			String errorMsg = e.getMessage();
			System.out.println(errorMsg);
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		return null;
	}

	@Override
	public Video selectVideoByNo(int no) throws VideoNotFoundException {
		// TODO Auto-generated method stub
		List<Video> list = this.selectVideo();
		for (Video v : list) {
			if (v.getNo() == no)
				return v;
		}
		throw new VideoNotFoundException(no);
	}

}
