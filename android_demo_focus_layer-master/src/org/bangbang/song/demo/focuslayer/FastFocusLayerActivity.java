
package org.bangbang.song.demo.focuslayer;

import org.bangbang.song.focuslayer.FastFocusLayer;

import android.os.Bundle;
import android.view.View;

public class FastFocusLayerActivity extends BaseAnimationFocusLayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected View getFocusLayer() {
        return new FastFocusLayer(this);
    }

	@Override
	protected int onCreateContentRes() {
		return R.layout.activity_fastfocuslayer;
	}

}
