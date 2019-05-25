package com.jsdz.jsdzcloud.service.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsdz.jsdzcloud.bean.ProductInformation;
import com.jsdz.jsdzcloud.bean.Series;
import com.jsdz.jsdzcloud.dao.ProductMapper;
import com.jsdz.jsdzcloud.exception.SessionNullException;
import com.jsdz.jsdzcloud.service.ProductService;
import com.jsdz.jsdzcloud.util.SqlSessionFactoryUtil;
@Service("productservice")
public class ProductServiceImpl implements ProductService {
	
	private static SqlSessionFactory factory = null;
	
	@Override
	public void insertSeries(Series series) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(series.getDbid());
		SqlSession session = factory.openSession();
		ProductMapper Mapper = session.getMapper(ProductMapper.class);
		try {
			Mapper.insertSeries(series);
		} catch (Exception e) {
			// TODO: handle exception
			session.commit();
			session.close();
			throw new SessionNullException("系列名不能重复录入","1",null);
		}
		Integer youwubianhao = series.getYouwubianhao();
		if(youwubianhao==2) {
			//添加型號同系列名一致
		}
		//设置该系列的价格为0
		
		//添加日志
		
		
		session.commit();
		session.close();
	}

	@Override
	public void deleteSeries(Series series) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSeries(Series series) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(series.getDbid());
		SqlSession session = factory.openSession();
		ProductMapper Mapper = session.getMapper(ProductMapper.class);
		try {
			Mapper.updateSeries(series);
		} catch (Exception e) {
			// TODO: handle exception
			session.commit();
			session.close();
			throw new SessionNullException("不能更改为已经存在的系列名","1",null);
		}

		session.commit();
		session.close();
	}

	@Override
	public Object selectSeries(Series series, Integer pageNum, Integer pageSize) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(series.getDbid());
		SqlSession session = factory.openSession();
		ProductMapper Mapper = session.getMapper(ProductMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		List<Series> list = Mapper.selectSeries(series);
		PageInfo<Series> info = new PageInfo<Series>(list);
		session.commit();
		session.close();
		return info;
	}

	@Override
	public void insertProduct(ProductInformation productinformation) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(productinformation.getDbid());
		SqlSession session = factory.openSession();
		ProductMapper Mapper = session.getMapper(ProductMapper.class);
		String productnum = productinformation.getProductnum();
		productnum = productnum.replaceAll("，", ",");
		String[] productnumstr = productnum.split(",");
		List<ProductInformation> productinformationlist1 = new ArrayList<ProductInformation>();
		ProductInformation new_productinformation = null;
		for (int j = 0; j < productnumstr.length; j++) {
			new_productinformation = new ProductInformation();
			new_productinformation.setGongyou(new Date().getTime() + "");
			new_productinformation.setProductnum(productnumstr[j]);
			new_productinformation.setWeight(productinformation.getWeight());
			new_productinformation.getSeries().setSeriesid(productinformation.getSeriesid());
			new_productinformation.setXianhuoandfucai(1);
			productinformationlist1.add(new_productinformation);
		}
		try {
			Mapper.insertProduct(productinformationlist1);
		} catch (Exception e) {
			session.commit();
			session.close();
			throw new SessionNullException("检查是否存在相同的型号或存在已经录入过的型号："+productinformation.getProductnum(),"1",null);
		}

		session.commit();
		session.close();
		
	}

	@Override
	public void deleteProduct(ProductInformation productinformation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(ProductInformation productinformation) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(productinformation.getDbid());
		SqlSession session = factory.openSession();
		ProductMapper Mapper = session.getMapper(ProductMapper.class);
		Mapper.updateProduct(productinformation);
		session.commit();
		session.close();
	}

	@Override
	public Object selectProduct(ProductInformation productinformation, Integer pageNum, Integer pageSize) throws SessionNullException {
		// TODO Auto-generated method stub
		factory = SqlSessionFactoryUtil.getSqlsession(productinformation.getDbid());
		SqlSession session = factory.openSession();
		ProductMapper Mapper = session.getMapper(ProductMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		List<ProductInformation> list = Mapper.selectProduct(productinformation);
		PageInfo<ProductInformation> info = new PageInfo<ProductInformation>(list);
		session.commit();
		session.close();
		return info;
	}

}
