package cn.pojo.templateEngine.service;

import cn.pojo.annotations.ParamInfo;
import cn.pojo.common.model.Paging;
import cn.pojo.templateEngine.model.redis.Site;
import cn.pojo.templateEngine.model.redis.SiteInstance;
import cn.pojo.user.base.BaseUser;

import java.util.List;
import java.util.Map;

/**
 * Created by Howell on 16/1/28.
 */
public interface SiteService {

    Long create(Long var1, Site var2);

    void delete(Long var1, Long var2);

    SiteInstance createWithoutPagePart(Long var1, Site var2);

    void update(Site var1);

    void release(Site var1);

    Site findByDomain(String var1);

    List<Site> findByUser(@ParamInfo("user") BaseUser var1);

    List<Site> findByUserId(Long var1);

    Site findShopByUserId(Long var1);

    void setDefault(Long var1, Long var2);

    Site findById(Long var1);

    Map<String, Object> findBySite(@ParamInfo("site") Site var1);

    void changeOwner(@ParamInfo("baseUser") BaseUser var1, @ParamInfo("siteId") Long var2, @ParamInfo("ownerId") Long var3);

    Paging<Site> pagination(@ParamInfo("pageNo") Integer var1, @ParamInfo("size") Integer var2);
}
