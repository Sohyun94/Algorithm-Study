package com.ssafy.fit.view;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.ssafy.fit.model.VideoReview;
import com.ssafy.fit.model.dao.IVideoReviewDao;
import com.ssafy.fit.model.dao.VideoReviewDaoImpl;

public class VideoReviewUi {
	private static Scanner sc = new Scanner(System.in);

	private static VideoReviewUi instance = new VideoReviewUi(int videoNo);
	
	
	//객체할당하세요
	private IVideoReviewDao videoReviewDao = VideoReviewDaoImpl.getInstance() ;
	private int videoNo = 0;
	private VideoReviewUi(int videoNo) {
		this.videoNo = videoNo;
	}

	public static VideoReviewUi getInstance(int videoNo) {
		if (instance == null)
			instance = new VideoReviewUi(videoNo);

		return instance;
	}
	
	public void service() {
		while (true) {
			listReview();
			System.out.println("1. 리뷰등록");
			System.out.println("0. 이전으로");
			System.out.println("--------------------");
			System.out.print("메뉴를 선택하세요 : ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				registReview();
				break;
			case 0:
				return;
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}

	private void listReview() {
		try {
			List<VideoReview> list = videoReviewDao.selectReview(videoNo);
			if (list == null) {
				list = Collections.emptyList();
			}
			System.out.println("--------------------");
			System.out.printf("영상리뷰 : %d개%n", list.size());
			System.out.println("--------------------");
			if (!list.isEmpty()) {
				for(VideoReview v : list)
					System.out.printf("%2d %4s %s %n", v.getReviewNo(), v.getNickName(), v.getContent());
				System.out.println("--------------------");
			}
		} catch (Exception e) {
			System.out.println("리뷰 조회시 문제가 발생했습니다.");
		}
	}

	private void registReview() {
		VideoReview vr = new VideoReview();
		vr.setVideoNo(videoNo);
		System.out.print("닉네임을 입력하세요 : ");
		vr.setNickName(sc.next());
		System.out.print("내용을 입력하세요 : ");
		vr.setContent(sc.next());
		videoReviewDao.insertReview(vr);
	}
}