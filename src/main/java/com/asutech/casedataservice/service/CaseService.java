package com.asutech.casedataservice.service;

import com.asutech.casedataservice.entity.CaseData;

import java.util.List;

public interface CaseService {
    List<CaseData> getAllCase();
    CaseData getCase(Long id);
    CaseData updateCase(CaseData casedata,Long id) ;
    CaseData createData(CaseData casedata);

}
