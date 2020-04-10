package com.mygdx.game.Screens.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Screens.Screens.Jax;



public class Hud {
    public Stage stage;
    public Viewport viewPort;

    public Integer worldTimer;
    public float timeCount;
    private Integer score;

    Label countDownLabel;
    Label scoreLabel;
    Label levelLabel;
    Label worldLabel;
    Label timeLabel;
    Label jaxLabel;

        public Hud(SpriteBatch BatchMain){
            worldTimer = 200;
            timeCount = 0;
            score = 0;

            viewPort = new FillViewport(Jax.SIZE_WIDTH, Jax.SIZE_HEIGHT, new OrthographicCamera());
            stage = new Stage(viewPort, BatchMain);

            Table table = new Table();
            table.top();
            table.setFillParent(true);

            countDownLabel = new Label(String.format("%03d", worldTimer),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
            scoreLabel = new Label(String.format("%06d", score),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
            levelLabel = new Label(("LVL 13"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
            worldLabel = new Label(("WORLD 2"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
            timeLabel = new Label(("TIME"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
            jaxLabel = new Label(("JAX"),new Label.LabelStyle(new BitmapFont(), Color.WHITE));

            table.add(jaxLabel).expandX().padTop(10);
            table.add(worldLabel).expandX().padTop(10);
            table.add(timeLabel).expandX().padTop(10);
            table.row();
            table.add(scoreLabel).expandX();
            table.add(levelLabel).expandX();
            table.add(countDownLabel).expandX();

            stage.addActor(table);
        }
}
