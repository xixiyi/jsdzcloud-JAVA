package com.jsdz.jsdzcloud.bean;

public class Series {
	private Integer seriesid;// ϵ�е�id
	private String seriesname;// ϵ�е�����

	private Integer paixu;

	private Integer pinpaipaixu;

	private String guige;

	private String productname;
	private String productnum;

	private String description;

	private Integer youwubianhao;

	private String seriesnum;// ϵ�еı��

	private String begin;
	private String end;
	private String productlocation;
	private Integer dengjiid;
	private String xiliedanwei;

	private Double price;
	private Double meimiprice;
	private Double meidunprice;
	private Double meijianprice;
	private Integer count;
	private String mingxidanwei;
	private String dbid;
	
	
	

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public String getMingxidanwei() {
		return mingxidanwei;
	}

	public void setMingxidanwei(String mingxidanwei) {
		this.mingxidanwei = mingxidanwei;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getProductnum() {
		return productnum;
	}

	public void setProductnum(String productnum) {
		this.productnum = productnum;
	}

	private Integer yincang;

	public Integer getYincang() {
		return yincang;
	}

	public void setYincang(Integer yincang) {
		this.yincang = yincang;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMeimiprice() {
		return meimiprice;
	}

	public void setMeimiprice(Double meimiprice) {
		this.meimiprice = meimiprice;
	}

	public Double getMeidunprice() {
		return meidunprice;
	}

	public void setMeidunprice(Double meidunprice) {
		this.meidunprice = meidunprice;
	}

	public Double getMeijianprice() {
		return meijianprice;
	}

	public void setMeijianprice(Double meijianprice) {
		this.meijianprice = meijianprice;
	}

	public Integer getYouwubianhao() {
		return youwubianhao;
	}

	public void setYouwubianhao(Integer youwubianhao) {
		this.youwubianhao = youwubianhao;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getGuige() {
		return guige;
	}

	public void setGuige(String guige) {
		this.guige = guige;
	}

	private Integer logo;

	public Integer getLogo() {
		return logo;
	}

	public void setLogo(Integer logo) {
		this.logo = logo;
	}

	public Integer getPinpaipaixu() {
		return pinpaipaixu;
	}

	public void setPinpaipaixu(Integer pinpaipaixu) {
		this.pinpaipaixu = pinpaipaixu;
	}

	public Integer getPaixu() {
		return paixu;
	}

	public void setPaixu(Integer paixu) {
		this.paixu = paixu;
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

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	private String seriesphoto;

	public String getSeriesphoto() {
		return seriesphoto;
	}

	public void setSeriesphoto(String seriesphoto) {
		this.seriesphoto = seriesphoto;
	}

	public Integer getSeriesid() {
		return seriesid;
	}

	public void setSeriesid(Integer seriesid) {
		this.seriesid = seriesid;
	}

	public String getSeriesname() {
		return seriesname;
	}

	public void setSeriesname(String seriesname) {
		this.seriesname = seriesname;
	}

	public Integer getDengjiid() {
		return dengjiid;
	}

	public void setDengjiid(Integer dengjiid) {
		this.dengjiid = dengjiid;
	}

	public String getXiliedanwei() {
		return xiliedanwei;
	}

	public void setXiliedanwei(String xiliedanwei) {
		this.xiliedanwei = xiliedanwei;
	}

	@Override
	public String toString() {
		return "Series [seriesid=" + seriesid + ", seriesname=" + seriesname + ", paixu=" + paixu + ", pinpaipaixu="
				+ pinpaipaixu + ", guige=" + guige + ", productname=" + productname + ", productnum=" + productnum
				+ ", description=" + description + ", youwubianhao=" + youwubianhao + ", seriesnum=" + seriesnum
				+ ", begin=" + begin + ", end=" + end + ", productlocation=" + productlocation + ", dengjiid="
				+ dengjiid + ", xiliedanwei=" + xiliedanwei + ", price=" + price + ", meimiprice=" + meimiprice
				+ ", meidunprice=" + meidunprice + ", meijianprice=" + meijianprice + ", yincang=" + yincang + ", logo="
				+ logo + ", seriesphoto=" + seriesphoto + "]";
	}

}
