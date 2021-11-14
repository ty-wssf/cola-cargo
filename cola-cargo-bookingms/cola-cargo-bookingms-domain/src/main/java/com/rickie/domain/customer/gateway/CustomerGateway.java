package com.rickie.domain.customer.gateway;

import com.rickie.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
