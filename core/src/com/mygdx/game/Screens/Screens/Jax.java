package com.mygdx.game.Screens.Screens;

import com.badlogic.gdx.Game;

public class Jax extends Game {

    public static final int SIZE_WIDTH = 270;
    public static final int SIZE_HEIGHT = 480;

	@Override
	public void create () {
		setScreen(new Menu(this));
		System.out.println("Loading...");
	}
}