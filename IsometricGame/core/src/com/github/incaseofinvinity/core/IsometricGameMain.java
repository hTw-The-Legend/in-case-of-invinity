package com.github.incaseofinvinity.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class IsometricGameMain extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    
    // Initialize
    @Override
    public void create () {
            batch = new SpriteBatch();
            img = new Texture("badlogic.jpg");
    }
    
    @Override
    public void resize(int width, int height) {
        super.resize(width, height); //To change body of generated methods, choose Tools | Templates.
    }

    // Game logic and rendering
    @Override
    public void render () {
            Gdx.gl.glClearColor(1, 0, 0, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            // Window Name
            Gdx.graphics.setTitle("In Case Of Infinity");
            batch.begin();
            batch.draw(img, 0, 0);
            batch.end();
    }

    // Only called on android after pause()
    @Override
    public void resume() {
        super.resume(); //To change body of generated methods, choose Tools | Templates.
    }

    // On desktop called before dispose() 
    @Override
    public void pause() {
        super.pause(); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Called when the application is destroyed
    @Override
    public void dispose () {
            batch.dispose();
            img.dispose();
    }
}
