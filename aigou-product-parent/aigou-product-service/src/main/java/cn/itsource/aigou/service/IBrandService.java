package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.query.BrandQuery;
import cn.itsource.basic.util.PageList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author awei
 * @since 2019-07-31
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> pageQuery(BrandQuery query);
}
