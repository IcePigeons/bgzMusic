package com.cxb.bgz.service;

import com.cxb.bgz.entity.Singer;
import java.util.List;

/**
 * (Singer)表服务接口
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
public interface SingerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Singer queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Singer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    Singer insert(Singer singer);

    /**
     * 修改数据
     *
     * @param singer 实例对象
     * @return 实例对象
     */
    Singer update(Singer singer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}