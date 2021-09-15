package com.cxb.bgz.service.impl;

import com.cxb.bgz.entity.SongType;
import com.cxb.bgz.dao.SongTypeDao;
import com.cxb.bgz.service.SongTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SongType)表服务实现类
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
@Service("songTypeService")
public class SongTypeServiceImpl implements SongTypeService {
    @Resource
    private SongTypeDao songTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SongType queryById(Integer id) {
        return this.songTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SongType> queryAllByLimit(int offset, int limit) {
        return this.songTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param songType 实例对象
     * @return 实例对象
     */
    @Override
    public SongType insert(SongType songType) {
        this.songTypeDao.insert(songType);
        return songType;
    }

    /**
     * 修改数据
     *
     * @param songType 实例对象
     * @return 实例对象
     */
    @Override
    public SongType update(SongType songType) {
        this.songTypeDao.update(songType);
        return this.queryById(songType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.songTypeDao.deleteById(id) > 0;
    }
}