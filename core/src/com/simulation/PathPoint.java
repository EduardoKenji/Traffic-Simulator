package com.simulation;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PathPoint {
	private float x, y;
	private ArrayList<Path> startingPathList; //this is the path list in which this point belongs to and it's the start point
	private ArrayList<Path> endingPathList; //this is the path list in which this point belongs to and it's the end point
	
	public PathPoint(float x, float y) {
		super();
		this.x = x;
		this.y = y;
		startingPathList = new ArrayList<Path>();
		endingPathList = new ArrayList<Path>();
	}
	
	public void draw(ShapeRenderer shapeRenderer) {
		shapeRenderer.setColor(0.1f, 0.6f, 0.9f, 1);
		shapeRenderer.rect(x, y, 30, 30);
	}
	
	public ArrayList<Path> getStartingPathList() {
		return startingPathList;
	}

	public void setStartingPathList(ArrayList<Path> startingPathList) {
		this.startingPathList = startingPathList;
	}

	public ArrayList<Path> getEndingPathList() {
		return endingPathList;
	}

	public void setEndingPathList(ArrayList<Path> endingPathList) {
		this.endingPathList = endingPathList;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
}