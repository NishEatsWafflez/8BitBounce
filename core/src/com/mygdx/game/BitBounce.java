package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BitBounce extends Game {
	SpriteBatch batch;
	public static final int V_WIDTH = 1000;
	public static final int V_HEIGHT = 1000;


	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new MainMenuScreen (this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
