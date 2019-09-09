package com.maven.service.impl;



import com.maven.dao.itemsMapper;
import com.maven.pojo.Items;
import com.maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private com.maven.dao.itemsMapper itemsMapper;


    public Items findById(Integer id) {

        return itemsMapper.findById(id);
    }
}
