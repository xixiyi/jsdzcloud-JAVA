package com.jsdz.jsdzcloud.dao;

import java.util.List;

import com.jsdz.jsdzcloud.bean.ProductInformation;
import com.jsdz.jsdzcloud.bean.Series;

public interface ProductMapper {

	void insertSeries(Series series);

	List<Series> selectSeries(Series series);

	void updateSeries(Series series);

	void insertProduct(List<ProductInformation> productinformationlist1);

	void updateProduct(ProductInformation productinformation);

	List<ProductInformation> selectProduct(ProductInformation productinformation);

}
