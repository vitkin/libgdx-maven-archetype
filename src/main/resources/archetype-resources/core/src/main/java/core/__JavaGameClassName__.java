#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ${JavaGameClassName} extends ApplicationAdapter {
	Texture img;
	SpriteBatch batch;
	float elapsed;

  BitmapFont font;

	@Override
	public void create () {
		batch = new SpriteBatch();
    img = new Texture("libgdx-logo.png");
    font = new BitmapFont();
    font.setColor(Color.RED);
	}

	@Override
  public void dispose() {
    batch.dispose();
    font.dispose();
	}

	@Override
	public void render () {
		elapsed += Gdx.graphics.getDeltaTime();
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 100+100*(float)Math.cos(elapsed), 100+25*(float)Math.sin(elapsed));
    font.draw(batch, "Hello World", 200, 200);
		batch.end();
	}
	}
