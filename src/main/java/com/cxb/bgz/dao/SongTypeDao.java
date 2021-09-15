package com.cxb.bgz.dao;

import com.cxb.bgz.entity.SongType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SongType)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
public interface SongTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SongType queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SongType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param songType 实例对象
     * @return 对象列表
     */
    List<SongType> queryAll(SongType songType);

    /**
     * 新增数据
     *
     * @param songType 实例对象
     * @return 影响行数
     */
    int insert(SongType songType);

    /**
     * 修改数据
     *
     * @param songType 实例对象
     * @return 影响行数
     */
    int update(SongType songType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}