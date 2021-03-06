package com.project_management.shoppingweb.service;

import com.project_management.shoppingweb.pojo.nodeEntity.Person;
import com.project_management.shoppingweb.pojo.vo.RequestResultVO;

public interface PersonService {
    /**
     * 新增
     * @param
     * @return
     */
    public RequestResultVO insert(Person person);
    public RequestResultVO delete(String name);
    public RequestResultVO update(Person person);
    public RequestResultVO find(Long id);
//    public RequestResultVO findByName(String name);


}
