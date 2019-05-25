package com.jsdz.jsdzcloud.service.serviceimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jsdz.jsdzcloud.bean.Mokuai;
import com.jsdz.jsdzcloud.dao.MokuaiMapper;
import com.jsdz.jsdzcloud.exception.SessionNullException;
import com.jsdz.jsdzcloud.service.MokuaiService;
import com.jsdz.jsdzcloud.util.SqlSessionFactoryUtil;

@Service("mokuaiservice")
public class MokuaiServiceImpl implements MokuaiService {
	
	private static SqlSessionFactory factory = null;
	@Override
	public Mokuai insertmokuai(Mokuai mokuai) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(mokuai.getDbid());
		SqlSession session = factory.openSession();
		MokuaiMapper Mapper = session.getMapper(MokuaiMapper.class);
		Mapper.insertmokuai(mokuai);
		session.commit();
		session.close();
		return mokuai;
	}

	@Override
	public void deletemokuai(Mokuai mokuai) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(mokuai.getDbid());
		SqlSession session = factory.openSession();
		MokuaiMapper Mapper = session.getMapper(MokuaiMapper.class);  
		Mapper.deletemokuai(mokuai);
		session.commit();
		session.close();
	}

	@Override
	public void updatemokuai(Mokuai mokuai) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(mokuai.getDbid());
		SqlSession session = factory.openSession();
		MokuaiMapper Mapper = session.getMapper(MokuaiMapper.class);  
		Mapper.updatemokuai(mokuai);
		session.commit();
		session.close();
	}

	@Override
	public Object selectmokuai(Mokuai mokuai, Integer pageNum, Integer pageSize) throws SessionNullException {
		factory = SqlSessionFactoryUtil.getSqlsession(mokuai.getDbid());
		SqlSession session = factory.openSession();
		MokuaiMapper Mapper = session.getMapper(MokuaiMapper.class);
		PageHelper.startPage(pageNum, pageSize);
		List<Mokuai> list = Mapper.selectmokuai(mokuai);
		PageInfo<Mokuai> info = new PageInfo<Mokuai>(list);
		session.commit();
		session.close();
		return info;
	}

}
