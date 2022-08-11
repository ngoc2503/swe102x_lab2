package com.swe102x.myclass;

import java.util.ArrayList;
import java.util.List;

import com.swe102x.myinterface.ProfileIterator;
import com.swe102x.myinterface.SocialNetwork;

public class Facebook implements SocialNetwork{
	private List<Profile> profiles;
	
	public Facebook(List<Profile> cache) {
		if(cache != null) {
			this.profiles = cache;
		} else {
			this.profiles = new ArrayList<>();
		}
	}

	public Profile requestProfileFromFacebook(String profileEmail) {
		// Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
		simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findProfile(profileEmail);
	}
	
	
	private Profile findProfile(String profileEmail) {
		for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
	}

	
	private void simulateNetworkLatency() {
		try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		
	}
	
	public List<String> requestProfileFriendsFromFacebook(String email, String type) {
		// Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + type + "' list of '" + email + "' over the network...");

        // ...and return test data.
        Profile profile = findProfile(email);
        if (profile != null) {
            return profile.getContacts(type);
        }
        return null;
	}

	@Override
	public ProfileIterator createFriendsIterator(String profileEmail) {
		return new FacebookIterator(this, "friends", profileEmail);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new FacebookIterator(this, "coworkers", profileEmail);
	}

	

}
