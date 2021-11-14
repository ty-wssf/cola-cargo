package com.rickie.domain.customer.gateway;

import com.rickie.domain.customer.Customer;
import com.rickie.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
