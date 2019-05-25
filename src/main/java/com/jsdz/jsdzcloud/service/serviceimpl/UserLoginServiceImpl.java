package com.jsdz.jsdzcloud.service.serviceimpl;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsdz.jsdzcloud.bean.Accountmanager;
import com.jsdz.jsdzcloud.bean.Grade;
import com.jsdz.jsdzcloud.bean.Mokuai;
import com.jsdz.jsdzcloud.bean.User;
import com.jsdz.jsdzcloud.dao.CreatTablesMapper;
import com.jsdz.jsdzcloud.dao.MokuaiMapper;
import com.jsdz.jsdzcloud.dao.UserLoginMapper;
import com.jsdz.jsdzcloud.exception.SessionNullException;
import com.jsdz.jsdzcloud.service.UserLoginService;
import com.jsdz.jsdzcloud.util.CreatSqlSessionFactory;
import com.jsdz.jsdzcloud.util.DateUtil;
import com.jsdz.jsdzcloud.util.SqlSessionFactoryUtil;



@Service("userloginservice")
public class UserLoginServiceImpl implements UserLoginService {

	private static SqlSessionFactory factory = null;

	
	@Override
	public User userlogin(User user) throws SessionNullException {
		// TODO Auto-generated method stub
	try {
		factory = CreatSqlSessionFactory.creat("");
		SqlSessionFactoryUtil.putSqlsession("0", factory);
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
		User new_user = new User();
		new_user.setPhone(user.getPhone());
		new_user = Mapper.login(new_user);
		if(new_user==null) {
			session.commit();
			session.close();
			throw new SessionNullException("您输入的账号没有注册","1",null);
		}else {
			new_user = new User();
			new_user.setPhone(user.getPhone());
			new_user.setPassword(user.getPassword());
			new_user = Mapper.login(new_user);
			if(new_user==null) {
				session.commit();
				session.close();
				throw new SessionNullException("您的密码错误","2",null);
			}
		}
		user = Mapper.login(user);
		session.commit();
		session.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		try {
		factory = CreatSqlSessionFactory.creat(""+user.getDbid());
		SqlSessionFactoryUtil.putSqlsession(user.getDbid(), factory);
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);  
		user = Mapper.login(user);
		session.commit();
		session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    
		return user;
	}
	
	@Override
	public User regist(User user) throws SessionNullException {
		// TODO Auto-generated method stub
		try {
			factory = CreatSqlSessionFactory.creat("");
			SqlSessionFactoryUtil.putSqlsession("0", factory);
			SqlSession session = factory.openSession();
			UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
			User new_user = new User();
			new_user.setPhone(user.getPhone());
			new_user = Mapper.login(new_user);
			if(new_user!=null) {
				session.commit();
				session.close();
				throw new SessionNullException("该手机号已经注册过了，请去登录","1",null);
			}
			user.setUsertype(2);
			user.setLeftnav(1);
			user.setMokuainame("老板");
			user.setZhucetime(DateUtil.shifentime());
			Mapper.regist(user);
			session.commit();
			session.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		return user;
	}



	@Override
	public User updateUserinfo(User user) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession("0");
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);  
		int x = (int) (Math.random() * 1000);
		user.setDbid(DateUtil.dates()+x);
		Mapper.updateuserinformation(user);
		user = Mapper.selectuserbyid(user.getUid());
		//开始建库、建表
		Mapper.creatNewDatabase(user.getDbid());
		
		try {
			//配置数据库参数    
			factory = CreatSqlSessionFactory.creat(""+user.getDbid());
			SqlSessionFactoryUtil.putSqlsession(user.getDbid(), factory);
			SqlSession new_session = factory.openSession();
			//准备数据表
			CreatTablesMapper tablesMapper = new_session.getMapper(CreatTablesMapper.class);
			tablesMapper.creatUsertable();
			tablesMapper.creatShopOrdertable();
			tablesMapper.creatSportOrdertable();
			tablesMapper.creatAccountmanagertable();
			tablesMapper.creatBancitable();
			tablesMapper.creatBaosunbaoyitable();
			tablesMapper.creatBeiyintable();
			tablesMapper.creatBiaomianguangzedutable();
			tablesMapper.creatBumentable();
			tablesMapper.creatButietable();
			tablesMapper.creatContexttable();
			tablesMapper.creatCustomordertable();
			tablesMapper.creatDatjiaotable();
			tablesMapper.creatDiaohuoorderzitable();
			tablesMapper.creatDiaohuoorderzutable();
			tablesMapper.creatEngineercontexttable();
			tablesMapper.creatEngineeringtable();
			tablesMapper.creatFangweibiaoqiantable();
			tablesMapper.creatFatherpurchasetable();
			tablesMapper.creatFeiyongtable();
			tablesMapper.creatFirmtable();
			tablesMapper.creatForphototabletable();
			tablesMapper.creatGangweitable();
			tablesMapper.creatGangweiguigejinetable();
			tablesMapper.creatGetmoneystyletable();	
			tablesMapper.creatGradetable();
			tablesMapper.creatGuanlianlingliaotable();	
			tablesMapper.creatGuigeguanliantable();
			tablesMapper.creatGuigezhongliangtable();
			tablesMapper.creatHuanjiecipintable();
			tablesMapper.creatHuanjiematerialnameguanliantable();
			tablesMapper.creatHuanjiematerialnameguanliantwotable();
			tablesMapper.creatHuanjietypematerialguanliantable();
			tablesMapper.creatHuanjietypematerialguanliantwotable();
			tablesMapper.creatHuanjiexingguangongxutable();
			tablesMapper.creatInvenmingxitable();
			tablesMapper.creatJicaiguigetable();
			tablesMapper.creatJichuguigetable();
			tablesMapper.creatKefutalkreporttable();
			tablesMapper.creatKemutable();
			tablesMapper.creatLeibietable();
			tablesMapper.creatLianxiwomentable();
			tablesMapper.creatMaterialtable();
			tablesMapper.creatMaterialcaigoutable();
			tablesMapper.creatMaterialordertable();
			tablesMapper.creatMidutable();
			tablesMapper.creatMokuaitable();
			tablesMapper.creatNavigatiotable();
			tablesMapper.creatPeifangtable();
			tablesMapper.creatPointtabletable();
			tablesMapper.creatProductcztable();
			tablesMapper.creatSeriestable();
			tablesMapper.creatProductinformationtable();
			tablesMapper.creatProductinventable();
			tablesMapper.creatProductwenlutable();
			tablesMapper.creatProducttypetable();
			tablesMapper.creatProductneworderspetable();
			tablesMapper.creatProductpricetable();
			tablesMapper.creatProductspecificationtable();
			tablesMapper.creatProductnumphototable();
			tablesMapper.creatProductnummaterialtable();
			tablesMapper.creatProductnummaterialguanliantable();
			tablesMapper.creatProductnummaterialguanlianonetable();
			tablesMapper.creatProductnummaterialguanliantwotable();
			tablesMapper.creatProductnummaterialtwotable();
			tablesMapper.creatProjectpreparationtable();
			tablesMapper.creatQitagongxutable();
			tablesMapper.creatRibaobiaonametable();
			tablesMapper.creatRizhitable();
			tablesMapper.creatRukuleijitable();
			tablesMapper.creatSalestable();
			tablesMapper.creatSaleszutable();
			tablesMapper.creatShengchanhoudutable();
			tablesMapper.creatShengchanhuanjietable();
			tablesMapper.creatShengchanorderzitable();
			tablesMapper.creatShengchanorderzutable();
			tablesMapper.creatShengchanribaotable();
			tablesMapper.creatShengchantypetable();
			tablesMapper.creatShengchanyejitable();
			tablesMapper.creatShengchanzhuangtaitable();
			tablesMapper.creatShichangdiaochareporttable();
			tablesMapper.creatShopcarttable();
			tablesMapper.creatShouhoureporttable();
			tablesMapper.creatSonpurchasetable();
			tablesMapper.creatSuokoutypetable();
			tablesMapper.creatTardyzutable();
			tablesMapper.creatTypetable();
			tablesMapper.creatTypematerialtable();
			tablesMapper.creatTypematerialtwotable();
			tablesMapper.creatUvtable();
			tablesMapper.creatWhtabletable();
			tablesMapper.creatXinghaotable();
			tablesMapper.creatYangbenreporttable();
			tablesMapper.creatYansetable();
			tablesMapper.creatYawentable();
			tablesMapper.creatZhongdiliaotable();
			UserLoginMapper new_Mapper = new_session.getMapper(UserLoginMapper.class);
			new_Mapper.regist(user);
			
			MokuaiMapper mokuaiMapper = new_session.getMapper(MokuaiMapper.class);
			Mokuai mokuai = new Mokuai();
			mokuai.setId(1);
			mokuai.setMokuainame("老板");
			mokuai.setMenuData("mokuai_menuManager_1,mokuai_menuManager_1_1,mokuai_menuManager_1_2,mokuai_menuManager_1_3,mokuai_menuManager_1_4,mokuai_menuManager_2,mokuai_menuManager_2_1,mokuai_menuManager_2_2,mokuai_menuManager_2_3,mokuai_menuManager_2_4,mokuai_menuManager_2_5,mokuai_menuManager_3,mokuai_menuManager_3_1,mokuai_menuManager_3_2,mokuai_menuManager_3_3,mokuai_menuManager_3_4,mokuai_menuManager_3_5,mokuai_menuManager_3_6,mokuai_menuManager_3_7,mokuai_menuManager_4,mokuai_menuManager_4_1,mokuai_menuManager_4_2,mokuai_menuManager_4_3,mokuai_menuManager_4_4,mokuai_menuManager_4_5,mokuai_menuManager_4_6,mokuai_menuManager_4_7,mokuai_menuManager_5,mokuai_menuManager_5_1,mokuai_menuManager_5_2,mokuai_menuManager_5_3,mokuai_menuManager_5_4,mokuai_menuManager_5_5,mokuai_menuManager_6,mokuai_menuManager_6_1,mokuai_menuManager_6_2,mokuai_menuManager_6_3,mokuai_menuManager_6_4,mokuai_menuManager_7,mokuai_menuManager_7_1,mokuai_menuManager_7_2,mokuai_menuManager_7_3,mokuai_menuManager_7_4,mokuai_menuManager_8,mokuai_menuManager_8_1,mokuai_menuManager_8_2");
			mokuaiMapper.insertmokuai(mokuai);
			mokuai.setId(2);
			mokuai.setMokuainame("销售");
			mokuai.setMenuData("mokuai_menuManager_2,mokuai_menuManager_2_1,mokuai_menuManager_2_2,mokuai_menuManager_2_3,mokuai_menuManager_2_4,mokuai_menuManager_2_5,mokuai_menuManager_3,mokuai_menuManager_3_1,mokuai_menuManager_3_2,mokuai_menuManager_3_3,mokuai_menuManager_3_4,mokuai_menuManager_3_5,mokuai_menuManager_3_6,mokuai_menuManager_3_7");
			mokuaiMapper.insertmokuai(mokuai);
			mokuai.setId(3);
			mokuai.setMokuainame("文员");
			mokuai.setMenuData("mokuai_menuManager_1,mokuai_menuManager_1_1,mokuai_menuManager_1_2,mokuai_menuManager_1_3,mokuai_menuManager_1_4,mokuai_menuManager_2,mokuai_menuManager_2_1,mokuai_menuManager_2_2,mokuai_menuManager_2_3,mokuai_menuManager_2_4,mokuai_menuManager_2_5,mokuai_menuManager_3,mokuai_menuManager_3_1,mokuai_menuManager_3_2,mokuai_menuManager_3_3,mokuai_menuManager_3_4,mokuai_menuManager_3_5,mokuai_menuManager_3_6,mokuai_menuManager_3_7");
			mokuaiMapper.insertmokuai(mokuai);
			mokuai.setId(4);
			mokuai.setMokuainame("财务");
			mokuai.setMenuData("mokuai_menuManager_1,mokuai_menuManager_1_1,mokuai_menuManager_1_2,mokuai_menuManager_1_3,mokuai_menuManager_1_4,mokuai_menuManager_2,mokuai_menuManager_2_1,mokuai_menuManager_2_2,mokuai_menuManager_2_3,mokuai_menuManager_2_4,mokuai_menuManager_2_5,mokuai_menuManager_3,mokuai_menuManager_3_1,mokuai_menuManager_3_2,mokuai_menuManager_3_3,mokuai_menuManager_3_4,mokuai_menuManager_3_5,mokuai_menuManager_3_6,mokuai_menuManager_3_7,mokuai_menuManager_7,mokuai_menuManager_7_1,mokuai_menuManager_7_2,mokuai_menuManager_7_3,mokuai_menuManager_7_4");
			mokuaiMapper.insertmokuai(mokuai);
			mokuai.setId(5);
			mokuai.setMokuainame("仓库");
			mokuai.setMenuData("mokuai_menuManager_2,mokuai_menuManager_2_1,mokuai_menuManager_2_2,mokuai_menuManager_2_3,mokuai_menuManager_2_4,mokuai_menuManager_2_5,mokuai_menuManager_3,mokuai_menuManager_3_1,mokuai_menuManager_3_2,mokuai_menuManager_3_3,mokuai_menuManager_3_4,mokuai_menuManager_3_5,mokuai_menuManager_3_6,mokuai_menuManager_3_7");
			mokuaiMapper.insertmokuai(mokuai);
			UserLoginMapper newusermapper = new_session.getMapper(UserLoginMapper.class);
			Grade grade = new Grade();
			grade.setDengjiid(1);
			grade.setDengjiname("一级");
			newusermapper.insertgrade(grade);
			new_session.commit();
			new_session.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		session.commit();
		session.close();
		return user;
	}

	@Override
	public User insertUser(User user) throws SessionNullException {
		String username = user.getUsername();
		String istuijianren = user.getIstuijianren();
		String mokuainame = user.getMokuainame();
		Integer leftnav = user.getLeftnav();
		String password = user.getPassword();
		try {
			factory = CreatSqlSessionFactory.creat("");
			SqlSessionFactoryUtil.putSqlsession("0", factory);
			SqlSession session = factory.openSession();
			UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
			User new_user = new User();
			new_user.setPhone(user.getPhone());
			new_user = Mapper.login(new_user);
			if(new_user!=null) {
//				throw new SessionNullException("该手机号已经注册过了，请去登录","1",null);
			}else {
				user.setUsertype(2);
				Mapper.regist(user);
				user = Mapper.selectuserbyid(user.getUid());
				session.commit();
				session.close();
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
			factory = SqlSessionFactoryUtil.getSqlsession(user.getDbid());
			SqlSessionFactoryUtil.putSqlsession(user.getDbid(), factory);
			SqlSession session = factory.openSession();
			UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
			User new_user = new User();
			new_user.setPhone(user.getPhone());
			new_user.setStatus(13);
			new_user = Mapper.login(new_user);
			if(new_user!=null) {
				if(new_user.getStatus()==2) {
					new_user.setStatus(1);
					new_user.setUsername(username);
					new_user.setPassword(password);
					new_user.setIstuijianren(istuijianren);
					new_user.setMokuainame(mokuainame);
					new_user.setLeftnav(leftnav);
					Mapper.updateuserinformation(new_user);
					user.setIstuijianren(istuijianren);
				}else {
					session.commit();
					session.close();
					throw new SessionNullException("该手机号已经注册过了，请去登录","1",null);
				}
			}else {
				Mapper.regist(user);
			}
			if(user.getIstuijianren().equals("是")) {
				Accountmanager accountmanager = new Accountmanager();
				accountmanager.setAccountmanagername(user.getUsername());
				accountmanager.setAccountmanagerphone(user.getPhone());
				try {
					Mapper.insertaccountmanager(accountmanager);
				} catch (Exception e) {
				}
			}
			
			session.commit();
			session.close();
		
		return user;
	}

	@Override
	public Object selectUser(User user,Integer pageNum,Integer pageSize) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(user.getDbid());
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = Mapper.selectsuoyouStudent(user);
		PageInfo<User> info = new PageInfo<User>(list);
		session.commit();
		session.close();
		return info;
	}

	@Override
	public Object updateUser(User user) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(user.getDbid());
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
		Accountmanager accountmanager = new Accountmanager();
		User new_user = new User();
		new_user.setPhone(user.getPhone());
		new_user = Mapper.login(new_user);
		if(new_user!=null) {
			throw new SessionNullException("该手机号已经存在了","1",null);
		}
		
		accountmanager.setAccountmanagerid(user.getAccountmanagerid());
		user.setAccountmanager(accountmanager);
		Mapper.updateuserinformation(user);
		session.commit();
		session.close();
		return user;
	}

	@Override
	public Object selectAccountmanager(User user) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(user.getDbid());
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
		List<Accountmanager> list = Mapper.selectAccountmanager();
		session.commit();
		session.close();
		return list;
	}

	@Override
	public User insertKehu(User user) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(user.getDbid());
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
		Accountmanager accountmanager = new Accountmanager();
		accountmanager.setAccountmanagerid(user.getAccountmanagerid());
		User new_user = new User();
		new_user.setPhone(user.getPhone());
		new_user.setStatus(13);
		new_user = Mapper.login(new_user);
		if(new_user!=null) {
			new_user.setStatus(1);
			new_user.setUsername(user.getUsername());
			new_user.setAccountmanager(accountmanager);
			new_user.setEmail(user.getEmail());
			new_user.setYufukuan(user.getYufukuan());
			new_user.setAddress(user.getAddress());
			Mapper.updateuserinformation(new_user);
		}else {
			user.setStatus(1);
			user.setAccountmanager(accountmanager);
			user.setUsertype(1);
			Mapper.regist(user);
		}
		
		session.commit();
		session.close();
		return user;
	}
	
	

	@Override
	public Object selectKehu(User user, Integer pageNum, Integer pageSize) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(user.getDbid());
		SqlSession session = factory.openSession();
		UserLoginMapper Mapper = session.getMapper(UserLoginMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = Mapper.selectAllStudent(user);
		PageInfo<User> info = new PageInfo<User>(list);
		session.commit();
		session.close();
		return info;
	}



	
}
