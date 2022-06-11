package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Seller;
@Service("sellerService")
public interface SellerService {
	// 插入数据 调用sellerDAO里的insertSeller配置
	public int insertSeller(Seller seller);

	// 更新数据 调用sellerDAO里的updateSeller配置
	public int updateSeller(Seller seller);

	// 删除数据 调用sellerDAO里的deleteSeller配置
	public int deleteSeller(String sellerid);

	// 查询全部数据 调用sellerDAO里的getAllSeller配置
	public List<Seller> getAllSeller();

	// 按照Seller类里面的字段名称精确查询 调用sellerDAO里的getSellerByCond配置
	public List<Seller> getSellerByCond(Seller seller);

	// 按照Seller类里面的字段名称模糊查询 调用sellerDAO里的getSellerByLike配置
	public List<Seller> getSellerByLike(Seller seller);

	// 按主键查询表返回单一的Seller实例 调用sellerDAO里的getSellerById配置
	public Seller getSellerById(String sellerid);

}

