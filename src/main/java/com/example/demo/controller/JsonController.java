package com.example.demo.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.JsonBean;
import com.example.demo.model.ShowCase;
import com.example.demo.services.ShowService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class JsonController {
	@Autowired
	private ShowService showService;

	@GetMapping("/hello")
	public String getCovid(Model model) {
		model.addAttribute("hello", "Covid-19"); // （變數名稱，變數值)

		List<ShowCase> all = showService.getAll(CallUnitedNationsAPI());
		model.addAttribute("all", all); // （變數名稱，變數值)

		return "hello"; // 要導入的html
	}

	public JsonBean CallUnitedNationsAPI() {
		// 聯合國API
		String url = "https://services1.arcgis.com/0MSEUqKaxRlEPj5g/arcgis/rest/services/ncov_cases2_v1/FeatureServer/2/query?outFields=*&where=1%3D1&f=geojson";

		ObjectMapper mapper = new ObjectMapper();
		JsonBean usrPost = null;
		try {
			usrPost = mapper.readValue(new URL(url), JsonBean.class);
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usrPost;
	}
}
