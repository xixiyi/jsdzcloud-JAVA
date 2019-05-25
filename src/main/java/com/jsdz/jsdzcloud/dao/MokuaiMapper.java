package com.jsdz.jsdzcloud.dao;

import java.util.List;

import com.jsdz.jsdzcloud.bean.Mokuai;

public interface MokuaiMapper {

	void insertmokuai(Mokuai mokuai);

	void deletemokuai(Mokuai mokuai);

	void updatemokuai(Mokuai mokuai);

	List<Mokuai> selectmokuai(Mokuai mokuai);

}
