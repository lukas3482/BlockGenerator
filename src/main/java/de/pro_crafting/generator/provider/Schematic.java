package de.pro_crafting.generator.provider;

import java.util.HashMap;
import java.util.Map;

import de.pro_crafting.common.Point;
import de.pro_crafting.generator.BlockData;

public class Schematic {
	private Point offset;
	private Point origin;
	private Point size;
	private Map<Point, BlockData> blocks;
	
	public Schematic(Point offset, Point origin, Point size) {
		this.blocks = new HashMap<Point, BlockData>();
		this.offset = offset;
		this.origin = origin;
		this.size = size;
	}

	public Point getOffset() {
		return offset;
	}

	public void setOffset(Point offset) {
		this.offset = offset;
	}

	public Point getOrigin() {
		return origin;
	}

	public void setOrigin(Point origin) {
		this.origin = origin;
	}

	public Point getSize() {
		return size;
	}

	public void setSize(Point size) {
		this.size = size;
	}

	public BlockData get(Point point) {
		return this.blocks.get(point);
	}
	
	public void set(Point point, BlockData block) {
		this.blocks.put(point, block);
	}
}
