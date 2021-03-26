
package com.badlogicgames.gifski;

/**
 * @author supermoonie
 * @since 2021/03/26
 */
public class GifskiSettings {

	/** The width of the GIF, or 0 to use the maximum width of all frames. */
	private int width;
	/** The width of the GIF, or 0 to use the maximum height of all frames. */
	private int height;
	/** The quantization quality. 1-100, but the useful range is 50-100. 100 is recommended. */
	private byte quality = 100;
	/** If true, the GIF is not repeated. */
	private boolean once;
	/** If true, the quality is lower but encoding is faster. */
	private boolean fast;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public byte getQuality() {
		return quality;
	}

	public void setQuality(byte quality) {
		this.quality = quality;
	}

	public boolean isOnce() {
		return once;
	}

	public void setOnce(boolean once) {
		this.once = once;
	}

	public boolean isFast() {
		return fast;
	}

	public void setFast(boolean fast) {
		this.fast = fast;
	}
}
