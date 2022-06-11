package com.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Seller;

@Repository("sellerDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface SellerDAO {

	/**
* SellerDAO 接口 可以按名称直接调用seller.xml配置文件的SQL语句
 */

	// 插入数据 调用entity包seller.xml里的insertSeller配置 返回值0(失败),1(成功)
	public int insertSeller(Seller seller);

	// 更新数据 调用entity包seller.xml里的updateSeller配置 返回值0(失败),1(成功)
	public int updateSeller(Seller seller);

	// 删除数据 调用entity包seller.xml里的deleteSeller配置 返回值0(失败),1(成功)
	public int deleteSeller(String sellerid);

	// 查询全部数据 调用entity包seller.xml里的getAllSeller配置 返回List类型的数据
	public List<Seller> getAllSeller();

	// 按照Seller类里面的值精确查询 调用entity包seller.xml里的getSellerByCond配置 返回List类型的数据
	public List<Seller> getSellerByCond(Seller seller);

	// 按照Seller类里面的值模糊查询 调用entity包seller.xml里的getSellerByLike配置 返回List类型的数据
	public List<Seller> getSellerByLike(Seller seller);

	// 按主键查询表返回单一的Seller实例 调用entity包seller.xml里的getSellerById配置
	public Seller getSellerById(String sellerid);

}


