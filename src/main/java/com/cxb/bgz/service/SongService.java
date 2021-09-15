package com.cxb.bgz.service;

import com.cxb.bgz.entity.Song;
import java.util.List;

/**
 * (Song)表服务接口
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
public interface SongService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Song queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Song> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    Song insert(Song song);

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    Song update(Song song);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}