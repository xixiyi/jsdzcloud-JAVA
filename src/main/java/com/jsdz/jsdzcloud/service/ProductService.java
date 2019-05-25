package com.jsdz.jsdzcloud.service;

import com.jsdz.jsdzcloud.bean.ProductInformation;
import com.jsdz.jsdzcloud.bean.Series;
import com.jsdz.jsdzcloud.exception.SessionNullException;

public interface ProductService {

	void insertSeries(Series series) throws SessionNullException;

	void deleteSeries(Series series) throws SessionNullException;

	void updateSeries(Series series) throws SessionNullException;

	Object selectSeries(Series series, Integer pageNum, Integer pageSize) throws SessionNullException;

	void insertProduct(ProductInformation productinformation) throws SessionNullException;

	void deleteProduct(ProductInformation productinformation) throws SessionNullException;

	void updateProduct(ProductInformation productinformation) throws SessionNullException;

	Object selectProduct(ProductInformation productinformation, Integer pageNum, Integer pageSize) throws SessionNullException;

}
