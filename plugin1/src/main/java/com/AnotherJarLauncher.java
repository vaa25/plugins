package com;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import org.springframework.boot.loader.JarLauncher;
import org.springframework.boot.loader.archive.Archive;
import org.springframework.boot.loader.archive.JarFileArchive;

public class AnotherJarLauncher extends JarLauncher {

    @Override
    protected void postProcessClassPathArchives(List<Archive> archives) throws MalformedURLException {
        try {
            archives.add(new JarFileArchive(new File("/home/vaa25/IdeaProjects/plugins/plugin2/build/libs/plugin2-0.0.1-SNAPSHOT.jar")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws Exception {
//        System.exit(1);
        new AnotherJarLauncher().launch(args);
    }
}
