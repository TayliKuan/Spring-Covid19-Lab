package com.example.demo.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.JsonBean;
import com.example.demo.model.ShowCase;
import com.example.demo.utils.CallGoogleTranslateAPI;

@Service
public class ShowService {
	
	@Autowired
	private CallGoogleTranslateAPI callGoogleTranslateAPI;

	public List<ShowCase> getAll(JsonBean usrPost) {
		return usrPost.getFeatures()
				.stream()
				.map(a -> {
					ShowCase o = new ShowCase();
					o.setCountryRegion(callGoogleTranslateAPI.getZhWord(a.getProperties().getCountryRegion()));
					o.setIs03(a.getProperties().getIs03());
					o.setConfirmed(a.getProperties().getConfirmed());
					o.setDeaths(a.getProperties().getDeaths());
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					date.setTime(a.getProperties().getLastUpdate());
					o.setLastUpdate(sdf.format(date));
					o.setMortalityRate(a.getProperties().getMortalityRate());
					return o;
				}).collect(Collectors.toList());
	}
}
