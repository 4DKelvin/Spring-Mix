package com.fourdkelvin.framework.service;

import com.fourdkelvin.framework.model.EscpEiInvoice;
import org.springframework.stereotype.Service;

public interface InvoiceService {
    EscpEiInvoice findById(String id);

}
