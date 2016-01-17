package org.bb.widget;

import android.content.Context;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class OverscrollView extends FrameLayout {

	private ViewParent mParent;

	public OverscrollView(Context context) {
		super(context);
	}

	public void setParent(ViewParent parent) {
		this.mParent = parent;
	}

}
