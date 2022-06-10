package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7779301094116820438L;

	public String type;
	public List<DataBean> features;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<DataBean> getFeatures() {
		return features;
	}

	public void setFeatures(List<DataBean> features) {
		this.features = features;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class DataBean {
		private String type;
		private String id;
		private GeometryData geometry;
		private Property properties;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public GeometryData getGeometry() {
			return geometry;
		}

		public void setGeometry(GeometryData geometry) {
			this.geometry = geometry;
		}

		public Property getProperties() {
			return properties;
		}

		public void setProperties(Property properties) {
			this.properties = properties;
		}

	}

	public static class GeometryData {
		private String type;
		private List<String> coordinates;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getCoordinates() {
			return coordinates;
		}

		public void setCoordinates(List<String> coordinates) {
			this.coordinates = coordinates;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Property {
		@JsonProperty("objectid")
		private String objectid;
		@JsonProperty("Country_Region")
		private String countryRegion;//國家/地區
		@JsonProperty("Last_Update")
		private long lastUpdate;//最後更新
		@JsonProperty("Lat")
		private String lat;
		@JsonProperty("Long_")
		private String longL;// 禁用關鍵字
		@JsonProperty("Confirmed")
		private String confirmed;//累積確診
		@JsonProperty("Deaths")
		private String deaths;//死亡人數
		@JsonProperty("Recovered")
		private String recovered;
		@JsonProperty("Active")
		private String active;
		@JsonProperty("Incident_Rate")
		private String incidentRate;
		@JsonProperty("People_Tested")
		private String peopleTested;
		@JsonProperty("People_Hospitalized")
		private String peopleHospitalized;
		@JsonProperty("Mortality_Rate")
		private String mortalityRate;//死亡率
		@JsonProperty("UID")
		private String uid;
		@JsonProperty("ISO3")
		private String is03;//國家代碼縮寫

		public String getObjectid() {
			return objectid;
		}

		public void setObjectid(String objectid) {
			this.objectid = objectid;
		}

		public String getCountryRegion() {
			return countryRegion;
		}

		public void setCountryRegion(String countryRegion) {
			this.countryRegion = countryRegion;
		}

		public long getLastUpdate() {
			return lastUpdate;
		}

		public void setLastUpdate(long lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public String getLat() {
			return lat;
		}

		public void setLat(String lat) {
			this.lat = lat;
		}

		public String getLongL() {
			return longL;
		}

		public void setLongL(String longL) {
			this.longL = longL;
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

		public String getRecovered() {
			return recovered;
		}

		public void setRecovered(String recovered) {
			this.recovered = recovered;
		}

		public String getActive() {
			return active;
		}

		public void setActive(String active) {
			this.active = active;
		}

		public String getIncidentRate() {
			return incidentRate;
		}

		public void setIncidentRate(String incidentRate) {
			this.incidentRate = incidentRate;
		}

		public String getPeopleTested() {
			return peopleTested;
		}

		public void setPeopleTested(String peopleTested) {
			this.peopleTested = peopleTested;
		}

		public String getPeopleHospitalized() {
			return peopleHospitalized;
		}

		public void setPeopleHospitalized(String peopleHospitalized) {
			this.peopleHospitalized = peopleHospitalized;
		}

		public String getMortalityRate() {
			return mortalityRate;
		}

		public void setMortalityRate(String mortalityRate) {
			this.mortalityRate = mortalityRate;
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getIs03() {
			return is03;
		}

		public void setIs03(String is03) {
			this.is03 = is03;
		}

	}
}
