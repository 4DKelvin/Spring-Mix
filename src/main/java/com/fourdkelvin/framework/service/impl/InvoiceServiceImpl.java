package com.fourdkelvin.framework.service.impl;

import com.fourdkelvin.framework.model.EscpEiInvoice;
import com.fourdkelvin.framework.mapper.EscpEiInvoiceMapper;
import com.fourdkelvin.framework.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    EscpEiInvoiceMapper invoiceMapper;

    @Override
    public EscpEiInvoice findById(String id) {
        return invoiceMapper.selectByPrimaryKey(id);
    }
}
