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
