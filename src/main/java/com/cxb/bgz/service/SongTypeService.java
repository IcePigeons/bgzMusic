package com.cxb.bgz.service;

import com.cxb.bgz.entity.SongType;
import java.util.List;

/**
 * (SongType)表服务接口
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
public interface SongTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SongType queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SongType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param songType 实例对象
     * @return 实例对象
     */
    SongType insert(SongType songType);

    /**
     * 修改数据
     *
     * @param songType 实例对象
     * @return 实例对象
     */
    SongType update(SongType songType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}