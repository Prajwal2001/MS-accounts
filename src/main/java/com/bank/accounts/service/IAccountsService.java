package com.bank.accounts.service;

import com.bank.accounts.dto.CustomerDto;

public interface IAccountsService {
    
    /**
     * 
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    /**
     * 
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * 
     * @param customerDto
     * @return Boolean
     */
    Boolean updateAccount(CustomerDto customerDto);

    /**
     * 
     * @param mobileNumber
     * @return
     */
    Boolean deleteAccount(String mobileNumber);
}
