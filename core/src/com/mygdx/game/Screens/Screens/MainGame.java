package com.mygdx.game.Screens.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Screens.Scenes.Hud;

class MainGame implements Screen {
     private Menu game;
     private OrthographicCamera gameCam;
     private Viewport gamePort;
     public Hud hud;


    public MainGame(Menu game) {
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FillViewport(Jax.SIZE_WIDTH,Jax.SIZE_HEIGHT,gameCam);
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {
        System.out.println("WOW");

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();

    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width,height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
