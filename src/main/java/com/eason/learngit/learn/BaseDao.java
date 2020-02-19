package com.eason.learngit.learn;

import java.util.List;

/**
 * @author eason
 * @param <T>
 */
public interface BaseDao <T> {
    /**
     * 通过Id查询
     * @param id
     * @return
     */
    T getById(Integer id);

    /**
     * 插入一条
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 插入多条
     * @param list
     * @return
     */
    int insertList(List<T> list);

    /**
     * 根据Id删除
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 删除多条
     * @param list
     * @return
     */
    int deleteByIds(List<T> list);
}
