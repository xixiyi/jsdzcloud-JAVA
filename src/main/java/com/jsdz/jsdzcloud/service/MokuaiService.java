package com.jsdz.jsdzcloud.service;

import com.jsdz.jsdzcloud.bean.Mokuai;
import com.jsdz.jsdzcloud.exception.SessionNullException;

public interface MokuaiService {

	Mokuai insertmokuai(Mokuai mokuai) throws SessionNullException;

	void deletemokuai(Mokuai mokuai) throws SessionNullException;

	void updatemokuai(Mokuai mokuai) throws SessionNullException;

	Object selectmokuai(Mokuai mokuai, Integer pageNum, Integer pageSize) throws SessionNullException;

}
