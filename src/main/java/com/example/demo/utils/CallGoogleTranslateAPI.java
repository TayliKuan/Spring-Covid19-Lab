package com.example.demo.utils;

import org.springframework.stereotype.Component;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

@Component
public class CallGoogleTranslateAPI {
	//google api 金鑰
	String myKey = "AIzaSyBeBwS4BTbw2tL3uOiQpQ77Ek9t3C0aO7k";//已失效
	Translate translate = TranslateOptions.newBuilder().setApiKey(myKey).build().getService();

	// TODO(developer): Uncomment these lines.
	// import com.google.cloud.translate.*;
	// Translate translate = TranslateOptions.getDefaultInstance().getService();
	public String getZhWord(String enWord) {
		Translation translation = translate.translate(
				enWord, 
				Translate.TranslateOption.sourceLanguage("en"),
				Translate.TranslateOption.targetLanguage("zh-TW"),
				// Use "base" for standard edition, "nmt" for the premium model.
				Translate.TranslateOption.model("base"));

		return translation.getTranslatedText();
	}
}
