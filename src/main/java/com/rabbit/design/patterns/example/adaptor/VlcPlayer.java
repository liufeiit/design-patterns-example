package com.rabbit.design.patterns.example.adaptor;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play mp4 file " + fileName);
	}

}
