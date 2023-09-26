package org.example.adapter;

import java.io.File;

public class Main {
    public static void main(String[] arguments) {
        File file = new File("c:\\Music\\avifile.avi");

        VideoFile aviFile = new VideoFile();
        aviFile.playAvi(file);

        AudioFile audioFile = new AudioFile();

        MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(audioFile);
        mediaPlayerAdapter.playMp3(file);

    }
}
