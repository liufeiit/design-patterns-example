package com.rabbit.design.patterns.example.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play mp4 file " + fileName);
	}

}
