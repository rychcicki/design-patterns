package org.example.adapter;

import lombok.extern.java.Log;

import java.io.File;

@Log
public class VideoFile implements MediaPlayer {
    @Override
    public void playAvi(File file) {
        log.info("Play video file");
    }

    @Override
    public void playMp3(File file) {
        log.info("Do nothing.");
    }
}
