package com.yi.uccn.service;

import com.yi.uccn.model.Presentation;

/**
 * 简介
 * @author YI
 */
public interface PresentationService {
    /**
     * 保存简介
     * @param presentation
     * @return
     */
    int save(Presentation presentation);

    /**
     * 查找数据
     * @return
     */
    Presentation find();

    /**
     * 更新
     * @param presentation
     * @return
     */
    int update(Presentation presentation);
}
