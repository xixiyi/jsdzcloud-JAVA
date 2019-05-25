package com.jsdz.jsdzcloud.bean;


public class User {

	private Integer uid;

	private String phone;
	private String name;

	private String telphone;

	private String password;

	private Integer usertype;

	private String username;

	private String address;

	private String deliveryaddress;

	private String bank;
	private String company;
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	private String banknum;

	private String accountname;

	private String begin;
	private String end;
	private Integer dengji;
	private Grade grade = new Grade();

	private Accountmanager accountmanager = new Accountmanager();

	private String otherusername;

	private String otheruserphone;

	private String taxidennum;

	private String taxheader;

	private Integer authentication;

	private String invenaddress;

	private String photo;

	private String email;

	private String errormsg;

	private Double yufukuan;

	private String pinpainame;
	private String xiliename;
	private String kucunname;
	private String kehuname;

	private Integer tardy;

	private Integer picistaust;

	private String maijialiuyan;

	private String seriesname;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String zhucetime;

	private Integer xianshikehu;

	private Integer updateinven;

	private Integer accountmanagerid;

	private Integer leftnav;

	private Mokuai mokuai = new Mokuai();

	private Double edu;

	private Double zhangkuanzongji;
	private Double zhangkuanzongjii;

	private Integer xianshijiage;

	private String yonghubeizhu;
	private String beizhutime;
	private Double qianguazhangleiji;
	private String shouhuodizhi;
	private String paymethod;
	private String ip;
	private Integer isphone;
	private String dingdanuser;

	private String[] dingdanquanxianuser;
	private String bumenname;
	private String baobiao;
	private String chuanzhen;
	private String mokuainame;
	private String headphoto;
	private String miaoshu;
	private String leftcaidan;
	private String rightcaidan;
	private String dbid;
	private String istuijianren;
	private String fukuantime;
	private Integer isfukuan;
	
	
	
	
	
	
	

	public String getFukuantime() {
		return fukuantime;
	}

	public void setFukuantime(String fukuantime) {
		this.fukuantime = fukuantime;
	}

	public Integer getIsfukuan() {
		return isfukuan;
	}

	public void setIsfukuan(Integer isfukuan) {
		this.isfukuan = isfukuan;
	}

	public String getIstuijianren() {
		return istuijianren;
	}

	public void setIstuijianren(String istuijianren) {
		this.istuijianren = istuijianren;
	}

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public Double getZhangkuanzongjii() {
		return zhangkuanzongjii;
	}

	public void setZhangkuanzongjii(Double zhangkuanzongjii) {
		this.zhangkuanzongjii = zhangkuanzongjii;
	}

	public String getLeftcaidan() {
		return leftcaidan;
	}

	public void setLeftcaidan(String leftcaidan) {
		this.leftcaidan = leftcaidan;
	}

	public String getRightcaidan() {
		return rightcaidan;
	}

	public void setRightcaidan(String rightcaidan) {
		this.rightcaidan = rightcaidan;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}

	public String getHeadphoto() {
		return headphoto;
	}

	public void setHeadphoto(String headphoto) {
		this.headphoto = headphoto;
	}

	public String getMokuainame() {
		return mokuainame;
	}

	public void setMokuainame(String mokuainame) {
		this.mokuainame = mokuainame;
	}

	public String getChuanzhen() {
		return chuanzhen;
	}

	public void setChuanzhen(String chuanzhen) {
		this.chuanzhen = chuanzhen;
	}

	public String getBaobiao() {
		return baobiao;
	}

	public void setBaobiao(String baobiao) {
		this.baobiao = baobiao;
	}

	public String getBumenname() {
		return bumenname;
	}

	public void setBumenname(String bumenname) {
		this.bumenname = bumenname;
	}

	public String[] getDingdanquanxianuser() {
		return dingdanquanxianuser;
	}

	public void setDingdanquanxianuser(String[] dingdanquanxianuser) {
		this.dingdanquanxianuser = dingdanquanxianuser;
	}

	public String getDingdanuser() {
		return dingdanuser;
	}

	public void setDingdanuser(String dingdanuser) {
		this.dingdanuser = dingdanuser;
	}

	public String getKehuname() {
		return kehuname;
	}

	public void setKehuname(String kehuname) {
		this.kehuname = kehuname;
	}

	public Integer getIsphone() {
		return isphone;
	}

	public void setIsphone(Integer isphone) {
		this.isphone = isphone;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}

	public String getShouhuodizhi() {
		return shouhuodizhi;
	}

	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}

	public Double getQianguazhangleiji() {
		return qianguazhangleiji;
	}

	public void setQianguazhangleiji(Double qianguazhangleiji) {
		this.qianguazhangleiji = qianguazhangleiji;
	}

	public String getYonghubeizhu() {
		return yonghubeizhu;
	}

	public void setYonghubeizhu(String yonghubeizhu) {
		this.yonghubeizhu = yonghubeizhu;
	}

	public String getBeizhutime() {
		return beizhutime;
	}

	public void setBeizhutime(String beizhutime) {
		this.beizhutime = beizhutime;
	}

	public Integer getTardy() {
		return tardy;
	}

	private Integer status;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setTardy(Integer tardy) {
		this.tardy = tardy;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
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

	public String getPinpainame() {
		return pinpainame;
	}

	public void setPinpainame(String pinpainame) {
		this.pinpainame = pinpainame;
	}

	public String getXiliename() {
		return xiliename;
	}

	public void setXiliename(String xiliename) {
		this.xiliename = xiliename;
	}

	public String getKucunname() {
		return kucunname;
	}

	public void setKucunname(String kucunname) {
		this.kucunname = kucunname;
	}

	public Double getYufukuan() {
		return yufukuan;
	}

	public void setYufukuan(Double yufukuan) {
		this.yufukuan = yufukuan;
	}

	public Mokuai getMokuai() {
		return mokuai;
	}

	public void setMokuai(Mokuai mokuai) {
		this.mokuai = mokuai;
	}

	public Double getEdu() {
		return edu;
	}

	public void setEdu(Double edu) {
		this.edu = edu;
	}

	public Double getZhangkuanzongji() {
		return zhangkuanzongji;
	}

	public void setZhangkuanzongji(Double zhangkuanzongji) {
		this.zhangkuanzongji = zhangkuanzongji;
	}

	public Integer getLeftnav() {
		return leftnav;
	}

	public void setLeftnav(Integer leftnav) {
		this.leftnav = leftnav;
	}

	public Integer getAccountmanagerid() {
		return accountmanagerid;
	}

	public void setAccountmanagerid(Integer accountmanagerid) {
		this.accountmanagerid = accountmanagerid;
	}

	public Integer getUpdateinven() {
		return updateinven;
	}

	public void setUpdateinven(Integer updateinven) {
		this.updateinven = updateinven;
	}

	public Integer getXianshikehu() {
		return xianshikehu;
	}

	public void setXianshikehu(Integer xianshikehu) {
		this.xianshikehu = xianshikehu;
	}

	public String getZhucetime() {
		return zhucetime;
	}

	public void setZhucetime(String zhucetime) {
		this.zhucetime = zhucetime;
	}

	public String getSeriesname() {
		return seriesname;
	}

	public void setSeriesname(String seriesname) {
		this.seriesname = seriesname;
	}

	public String getMaijialiuyan() {
		return maijialiuyan;
	}

	public void setMaijialiuyan(String maijialiuyan) {
		this.maijialiuyan = maijialiuyan;
	}

	public Integer getPicistaust() {
		return picistaust;
	}

	public void setPicistaust(Integer picistaust) {
		this.picistaust = picistaust;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone == null ? null : telphone.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getUsertype() {
		return usertype;
	}

	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress == null ? null : deliveryaddress.trim();
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank == null ? null : bank.trim();
	}

	public String getBanknum() {
		return banknum;
	}

	public void setBanknum(String banknum) {
		this.banknum = banknum == null ? null : banknum.trim();
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname == null ? null : accountname.trim();
	}

	public Integer getDengji() {
		return dengji;
	}

	public void setDengji(Integer dengji) {
		this.dengji = dengji;
	}

	public String getOtherusername() {
		return otherusername;
	}

	public void setOtherusername(String otherusername) {
		this.otherusername = otherusername == null ? null : otherusername.trim();
	}

	public String getOtheruserphone() {
		return otheruserphone;
	}

	public void setOtheruserphone(String otheruserphone) {
		this.otheruserphone = otheruserphone == null ? null : otheruserphone.trim();
	}

	public String getTaxidennum() {
		return taxidennum;
	}

	public void setTaxidennum(String taxidennum) {
		this.taxidennum = taxidennum == null ? null : taxidennum.trim();
	}

	public String getTaxheader() {
		return taxheader;
	}

	public void setTaxheader(String taxheader) {
		this.taxheader = taxheader == null ? null : taxheader.trim();
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Integer getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}

	public String getInvenaddress() {
		return invenaddress;
	}

	public void setInvenaddress(String invenaddress) {
		this.invenaddress = invenaddress;
	}

	public Accountmanager getAccountmanager() {
		return accountmanager;
	}

	public void setAccountmanager(Accountmanager accountmanager) {
		this.accountmanager = accountmanager;
	}

	public Integer getXianshijiage() {
		return xianshijiage;
	}

	public void setXianshijiage(Integer xianshijiage) {
		this.xianshijiage = xianshijiage;
	}

}