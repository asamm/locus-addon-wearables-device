package com.asamm.locus.addon.wear.gui.custom;


import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import locus.api.utils.Logger;

public class VerticalViewPager extends ViewPager {

	public VerticalViewPager(Context context) {
		this(context, null);
	}

	public VerticalViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	private MotionEvent swapTouchEvent(MotionEvent event) {
		float width = getWidth();
		float height = getHeight();

		float swappedX = (event.getY() / height) * width;
		float swappedY = (event.getX() / width) * height;

		event.setLocation(swappedX, swappedY);

		return event;
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {
		boolean intercept = super.onInterceptTouchEvent(swapTouchEvent(event));
		Logger.logD("", "intercept " + intercept);
		//If not intercept, touch event should not be swapped.
		swapTouchEvent(event);
		return intercept;
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		return super.onTouchEvent(swapTouchEvent(ev));
	}

}