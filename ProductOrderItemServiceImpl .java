package com.zk.mall.service.Impl;

import com.zk.mall.entity.ProductOrderItem;
import com.zk.mall.mapper.ProductOrderItemMapper;
import com.zk.mall.service.ProductOrderItemService;
import com.zk.mall.util.PageUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

add func1

@Service("productOrderItemService")
public class ProductOrderItemServiceImpl implements ProductOrderItemService {
    @Resource
    ProductOrderItemMapper productOrderItemMapper;

 
    @Override
    public Integer getSaleCount(Integer productId) {
        return productOrderItemMapper.selectSaleCount(productId);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public boolean add(ProductOrderItem productOrderItem) {
        return productOrderItemMapper.insertOne(productOrderItem)>0;
    }

add func2
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public boolean update(ProductOrderItem productOrderItem) {
        return productOrderItemMapper.updateOne(productOrderItem)>0;
    }
    @Override
    public List<ProductOrderItem> getListByUserId(Integer userId, PageUtil pageUtil) {
        return productOrderItemMapper.selectByUserId(userId,pageUtil);
    }
    @Override
    public Integer getTotalByUserId(Integer userId) {
        return productOrderItemMapper.selectTotalByUserId(userId);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public boolean deleteList(Integer[] productOrderItemIdList) {
        return productOrderItemMapper.deleteList(productOrderItemIdList)>0;
    }
