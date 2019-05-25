package com.jsdz.jsdzcloud.bean;

public class ProductInformation {// ��Ʒ����Ϣ
	private Integer productinid;// ��Ʒ��Ϣid

	private String productnum;// ��Ʒ�ı��

	private Integer xianhuoandfucai;
	private Series series = new Series();// ��Ʒ��ϵ�б��

	private String productphoto;

	private String gongyou;

	private Integer productseriesid;

	private ProductPrice productprice = new ProductPrice();
	private Double weight;
	
	private Double invenbaojing;
	private String seriesnum;
	private String productlocation;
	private Integer yincang;
	private String dbid;
	private Integer seriesid;
	
	

	public Integer getSeriesid() {
		return seriesid;
	}

	public void setSeriesid(Integer seriesid) {
		this.seriesid = seriesid;
	}

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public Integer getYincang() {
		return yincang;
	}

	public void setYincang(Integer yincang) {
		this.yincang = yincang;
	}

	public String getSeriesnum() {
		return seriesnum;
	}

	public void setSeriesnum(String seriesnum) {
		this.seriesnum = seriesnum;
	}

	public String getProductlocation() {
		return productlocation;
	}

	public void setProductlocation(String productlocation) {
		this.productlocation = productlocation;
	}

	public Double getInvenbaojing() {
		return invenbaojing;
	}

	public void setInvenbaojing(Double invenbaojing) {
		this.invenbaojing = invenbaojing;
	}

	public Integer getXianhuoandfucai() {
		return xianhuoandfucai;
	}

	public void setXianhuoandfucai(Integer xianhuoandfucai) {
		this.xianhuoandfucai = xianhuoandfucai;
	}

	// private ProductSpecification productspecification=new
	// ProductSpecification();//��Ʒ�Ĺ��

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getProductseriesid() {
		return productseriesid;
	}

	public void setProductseriesid(Integer productseriesid) {
		this.productseriesid = productseriesid;
	}

	public String getGongyou() {
		return gongyou;
	}

	public void setGongyou(String gongyou) {
		this.gongyou = gongyou;
	}

	public String getProductphoto() {
		return productphoto;
	}

	public void setProductphoto(String productphoto) {
		this.productphoto = productphoto;
	}

	public ProductPrice getProductprice() {
		return productprice;
	}

	public void setProductprice(ProductPrice productprice) {
		this.productprice = productprice;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Integer getProductinid() {
		return productinid;
	}

	public void setProductinid(Integer productinid) {
		this.productinid = productinid;
	}

	public String getProductnum() {
		return productnum;
	}

	public void setProductnum(String productnum) {
		this.productnum = productnum == null ? null : productnum.trim();
	}

	@Override
	public String toString() {
		return "ProductInformation [productinid=" + productinid + ", productnum=" + productnum + ", xianhuoandfucai="
				+ xianhuoandfucai + ", series=" + series + ", productphoto=" + productphoto + ", gongyou=" + gongyou
				+ ", productseriesid=" + productseriesid + ", productprice=" + productprice + ", weight=" + weight
				+ ", invenbaojing=" + invenbaojing + "]";
	}
	
}