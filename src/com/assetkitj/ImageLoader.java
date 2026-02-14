package com.assetkitj;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    public BufferedImage loadImage(String path) {
        BufferedImage i = null;
        try {
            i = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }
}
