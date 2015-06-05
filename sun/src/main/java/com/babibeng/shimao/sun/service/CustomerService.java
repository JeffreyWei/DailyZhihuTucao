package com.babibeng.shimao.sun.service;

import com.babibeng.shimao.sun.model.CustomerInfo;

/**
 * Created by wei on 15/6/5.
 */
public interface CustomerService {
    CustomerInfo getCustomerByID(Integer ID);
    boolean insertCustomer(CustomerInfo info);
}
