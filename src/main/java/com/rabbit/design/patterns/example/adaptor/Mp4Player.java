package com.rabbit.design.patterns.example.adaptor;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("play vlc file " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		
	}

}
