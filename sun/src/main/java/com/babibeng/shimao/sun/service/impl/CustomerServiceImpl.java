package com.babibeng.shimao.sun.service.impl;

import com.babibeng.shimao.sun.dao.CustomerInfoMapper;
import com.babibeng.shimao.sun.model.CustomerInfo;
import com.babibeng.shimao.sun.service.CustomerService;
import com.github.abel533.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wei on 15/6/5.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerInfoMapper mapper;

    @Override
    public CustomerInfo getCustomerByID(Integer ID) {
        Example example = new Example(CustomerInfo.class);
        example.createCriteria();
        List<CustomerInfo> customerInfoList = mapper.selectByExample(example);
        if (customerInfoList.size() > 0) {
            return customerInfoList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean insertCustomer(CustomerInfo info) {
        return mapper.insertSelective(info) == 0 ? false : true;
    }
}
