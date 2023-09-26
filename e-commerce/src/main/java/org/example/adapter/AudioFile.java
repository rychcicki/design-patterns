package org.example.adapter;

import lombok.Getter;
import lombok.extern.java.Log;

import java.io.File;

@Log
@Getter
public class AudioFile implements LegacyMp3Player {
    private String format;

    @Override
    public void play(String audioType, File file) {
        log.info("Play mp3 file.");
    }
}
