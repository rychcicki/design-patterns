package org.example.adapter;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

import java.io.File;

@Log
@AllArgsConstructor
public class MediaPlayerAdapter implements MediaPlayer {
    private AudioFile audioFile;

    @Override
    public void playAvi(File file) {
        log.info("Do nothing.");
    }

    @Override
    public void playMp3(File file) {
        this.audioFile.play(this.audioFile.getFormat(), file);
    }
}
