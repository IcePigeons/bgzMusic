package com.cxb.bgz.service.impl;

import com.cxb.bgz.entity.Song;
import com.cxb.bgz.dao.SongDao;
import com.cxb.bgz.service.SongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Song)表服务实现类
 *
 * @author makejava
 * @since 2021-09-15 17:29:46
 */
@Service("songService")
public class SongServiceImpl implements SongService {
    @Resource
    private SongDao songDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Song queryById(Integer id) {
        return this.songDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Song> queryAllByLimit(int offset, int limit) {
        return this.songDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public Song insert(Song song) {
        this.songDao.insert(song);
        return song;
    }

    /**
     * 修改数据
     *
     * @param song 实例对象
     * @return 实例对象
     */
    @Override
    public Song update(Song song) {
        this.songDao.update(song);
        return this.queryById(song.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.songDao.deleteById(id) > 0;
    }
}