package com.jsdz.jsdzcloud.bean;

public class ProductPrice {
	private Integer pricesid;
	private Grade grade = new Grade();
	private Series series = new Series();
	private Double price;
	private Integer dengjiid;
	private Integer productseriesid;
	private Double meijianprice;
	private Double meidunprice;
	private Double meimiprice;
	private Integer seriesid;

	public Integer getSeriesid() {
		return seriesid;
	}

	public void setSeriesid(Integer seriesid) {
		this.seriesid = seriesid;
	}

	public Double getMeijianprice() {
		return meijianprice;
	}

	public void setMeijianprice(Double meijianprice) {
		this.meijianprice = meijianprice;
	}

	public Double getMeidunprice() {
		return meidunprice;
	}

	public void setMeidunprice(Double meidunprice) {
		this.meidunprice = meidunprice;
	}

	public Double getMeimiprice() {
		return meimiprice;
	}

	public void setMeimiprice(Double meimiprice) {
		this.meimiprice = meimiprice;
	}

	public Integer getDengjiid() {
		return dengjiid;
	}

	public void setDengjiid(Integer dengjiid) {
		this.dengjiid = dengjiid;
	}

	public Integer getProductseriesid() {
		return productseriesid;
	}

	public void setProductseriesid(Integer productseriesid) {
		this.productseriesid = productseriesid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPricesid() {
		return pricesid;
	}

	public void setPricesid(Integer pricesid) {
		this.pricesid = pricesid;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}
}
