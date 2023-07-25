package com.akers.xiaohonghua.project.family.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import com.akers.xiaohonghua.project.family.domain.XhhFamily;

/**
 * 家庭信息管理Service接口
 * 
 * @author akers
 * @date 2023-07-24
 */
public interface IXhhFamilyService 
{
    /**
     * 查询家庭信息管理
     * 
     * @param familyId 家庭信息管理主键
     * @return 家庭信息管理
     */
    public XhhFamily selectXhhFamilyByFamilyId(Long familyId);

    /**
     * 查询家庭信息管理列表
     * 
     * @param xhhFamily 家庭信息管理
     * @return 家庭信息管理集合
     */
    public List<XhhFamily> selectXhhFamilyList(XhhFamily xhhFamily);
    public IPage<XhhFamily> selectXhhFamilyList(IPage<?> page, XhhFamily xhhFamily);

    /**
     * 新增家庭信息管理
     * 
     * @param xhhFamily 家庭信息管理
     * @return 结果
     */
    public int insertXhhFamily(XhhFamily xhhFamily);

    /**
     * 修改家庭信息管理
     * 
     * @param xhhFamily 家庭信息管理
     * @return 结果
     */
    public int updateXhhFamily(XhhFamily xhhFamily);

    /**
     * 批量删除家庭信息管理
     * 
     * @param familyIds 需要删除的家庭信息管理主键集合
     * @return 结果
     */
    public int deleteXhhFamilyByFamilyIds(Long[] familyIds);

    /**
     * 删除家庭信息管理信息
     * 
     * @param familyId 家庭信息管理主键
     * @return 结果
     */
    public int deleteXhhFamilyByFamilyId(Long familyId);
}
