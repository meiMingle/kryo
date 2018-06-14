
package com.esotericsoftware.kryo.benchmarks.data;

import com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.Tag;

import java.util.List;

public class Media implements java.io.Serializable {
	@Tag(0) public String uri;
	@Tag(1) public String title; // Can be null.
	@Tag(2) public int width;
	@Tag(3) public int height;
	@Tag(4) public String format;
	@Tag(5) public long duration;
	@Tag(6) public long size;
	@Tag(7) public int bitrate;
	@Tag(8) public boolean hasBitrate;
	@Tag(9) public List<String> persons;
	@Tag(10) public Player player;
	@Tag(11) public String copyright; // Can be null.

	public Media () {
	}

	public Media (String uri, String title, int width, int height, String format, long duration, long size, int bitrate,
		boolean hasBitrate, List<String> persons, Player player, String copyright) {
		this.uri = uri;
		this.title = title;
		this.width = width;
		this.height = height;
		this.format = format;
		this.duration = duration;
		this.size = size;
		this.bitrate = bitrate;
		this.hasBitrate = hasBitrate;
		this.persons = persons;
		this.player = player;
		this.copyright = copyright;
	}

	public boolean equals (Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Media other = (Media)o;
		if (bitrate != other.bitrate) return false;
		if (duration != other.duration) return false;
		if (hasBitrate != other.hasBitrate) return false;
		if (height != other.height) return false;
		if (size != other.size) return false;
		if (width != other.width) return false;
		if (copyright != null ? !copyright.equals(other.copyright) : other.copyright != null) return false;
		if (format != null ? !format.equals(other.format) : other.format != null) return false;
		if (persons != null ? !persons.equals(other.persons) : other.persons != null) return false;
		if (player != other.player) return false;
		if (title != null ? !title.equals(other.title) : other.title != null) return false;
		if (uri != null ? !uri.equals(other.uri) : other.uri != null) return false;
		return true;
	}

	public int hashCode () {
		int result = uri != null ? uri.hashCode() : 0;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + width;
		result = 31 * result + height;
		result = 31 * result + (format != null ? format.hashCode() : 0);
		result = 31 * result + (int)(duration ^ (duration >>> 32));
		result = 31 * result + (int)(size ^ (size >>> 32));
		result = 31 * result + bitrate;
		result = 31 * result + (hasBitrate ? 1 : 0);
		result = 31 * result + (persons != null ? persons.hashCode() : 0);
		result = 31 * result + (player != null ? player.hashCode() : 0);
		result = 31 * result + (copyright != null ? copyright.hashCode() : 0);
		return result;
	}

	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("[Media ");
		sb.append("uri=").append(uri);
		sb.append(", title=").append(title);
		sb.append(", width=").append(width);
		sb.append(", height=").append(height);
		sb.append(", format=").append(format);
		sb.append(", duration=").append(duration);
		sb.append(", size=").append(size);
		sb.append(", hasBitrate=").append(hasBitrate);
		sb.append(", bitrate=").append(String.valueOf(bitrate));
		sb.append(", persons=").append(persons);
		sb.append(", player=").append(player);
		sb.append(", copyright=").append(copyright);
		sb.append("]");
		return sb.toString();
	}

	static public enum Player {
		JAVA, FLASH;
	}
}