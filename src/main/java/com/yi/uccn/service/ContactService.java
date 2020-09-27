package com.yi.uccn.service;

import com.yi.uccn.model.Contact;
import com.yi.uccn.model.ContactExample;

import java.util.List;

/**
 * 联系方式
 * @author YI
 */
public interface ContactService {
    /**
     * 保存联系方式
     * @param record
     * @return
     */
    int saveSelective(Contact record);

    /**
     * 按条件查询
     * @param example 条件
     * @return
     */
    List<Contact> selectByExample(ContactExample example);
}
