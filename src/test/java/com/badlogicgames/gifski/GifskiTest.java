
package com.badlogicgames.gifski;

public class GifskiTest {
	public static void main (String[] args) {
		int seconds = 2;
		int frameCount = 50;

		GifskiSettings settings = new GifskiSettings();
		settings.setWidth(256);
		settings.setHeight(256);
		byte quality = 100;
		settings.setQuality(quality);
		settings.setOnce(false);
		settings.setFast(false);;

		Gifski gifski = new Gifski(settings);
		gifski.start("output.gif");
		short delay = (short)(seconds * 100 / frameCount);
		byte[] pixels = new byte[settings.getWidth() * settings.getHeight() * 4];
		for (int i = 0; i < frameCount; i++) {
			for (int p = 0, n = pixels.length; p < n; p += 4) {
				byte color = (byte)(i * 256f / frameCount);
				pixels[p] = color;
				pixels[p + 1] = 0;
				pixels[p + 2] = color;
				pixels[p + 3] = (byte)0xff;
			}
			gifski.addFrameRGBA(i, settings.getWidth(), settings.getHeight(), pixels, delay);
		}
		gifski.end();
	}
}
