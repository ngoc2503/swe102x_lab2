package com.swe102x.myinterface;

import com.swe102x.myclass.Profile;

public interface ProfileIterator {
	boolean hasNext();
	Profile getNext();
	void reset();
}
