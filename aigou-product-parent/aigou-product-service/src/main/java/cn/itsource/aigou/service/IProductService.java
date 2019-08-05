package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.Product;
import cn.itsource.aigou.domain.Specification;
import cn.itsource.aigou.query.ProductQuery;
import cn.itsource.basic.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author awei
 * @since 2019-08-05
 */
public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);

    List<Specification> getViewProperties(Long productId);

    List<Specification> getSkuProperties(Long productId);

    void updateViewProperties(int productId, String viewProperties);
}
