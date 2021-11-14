package com.rickie.customer;

import com.rickie.domain.customer.Credit;
import com.rickie.domain.customer.gateway.CreditGateway;
import org.springframework.stereotype.Component;

@Component
public class CreditGatewayImpl implements CreditGateway {
    public Credit getCredit(String customerId){
      return null;
    }
}
