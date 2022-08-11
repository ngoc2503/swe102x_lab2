package com.swe102x.myinterface;

import java.util.HashMap;

import com.swe102x.myclass.Video;

public interface ThirdPartyYouTubeLib {
	HashMap<String, Video> popularVideos();
	Video getVideo(String videoId);
}
