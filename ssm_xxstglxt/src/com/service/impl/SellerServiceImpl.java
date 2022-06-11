package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.SellerDAO;
import com.entity.Seller;
import com.service.SellerService;

@Service("sellerService")
public class SellerServiceImpl implements SellerService {
	@Autowired
	private SellerDAO sellerDAO;
	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertSeller(Seller seller) {
		return this.sellerDAO.insertSeller(seller);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateSeller(Seller seller) {
		return this.sellerDAO.updateSeller(seller);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteSeller(String sellerid) {
		return this.sellerDAO.deleteSeller(sellerid);
	}

	@Override // 继承接口的查询全部
	public List<Seller> getAllSeller() {
		return this.sellerDAO.getAllSeller();
	}

	@Override // 继承接口的按条件精确查询
	public List<Seller> getSellerByCond(Seller seller) {
		return this.sellerDAO.getSellerByCond(seller);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Seller> getSellerByLike(Seller seller) {
		return this.sellerDAO.getSellerByLike(seller);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Seller getSellerById(String sellerid) {
		return this.sellerDAO.getSellerById(sellerid);
	}

}

// 程序开发 QQ 709664889 可以付费修改
