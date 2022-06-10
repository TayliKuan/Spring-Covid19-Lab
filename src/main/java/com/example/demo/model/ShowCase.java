package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

public class ShowCase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8050154359770756826L;
	List<OptionName> allCountryName;
	private String countryRegion;// 國家/地區
	private String lastUpdate;// 最後更新
	private String confirmed;// 累積確診
	private String deaths;// 死亡人數
	private String mortalityRate;// 死亡率
	private String is03;// 國家代碼縮寫
	
	List<ShowCase> all;

	public List<OptionName> getAllCountryName() {
		return allCountryName;
	}

	public void setAllCountryName(List<OptionName> allCountryName) {
		this.allCountryName = allCountryName;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getDeaths() {
		return deaths;
	}

	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}

	public String getMortalityRate() {
		return mortalityRate;
	}

	public void setMortalityRate(String mortalityRate) {
		this.mortalityRate = mortalityRate;
	}

	public String getIs03() {
		return is03;
	}

	public void setIs03(String is03) {
		this.is03 = is03;
	}



	public static class OptionName {
		private String countryRegion;// 國家/地區
		private String is03;// 國家代碼縮寫

		public String getCountryRegion() {
			return countryRegion;
		}

		public void setCountryRegion(String countryRegion) {
			this.countryRegion = countryRegion;
		}

		public String getIs03() {
			return is03;
		}

		public void setIs03(String is03) {
			this.is03 = is03;
		}
	}
}
