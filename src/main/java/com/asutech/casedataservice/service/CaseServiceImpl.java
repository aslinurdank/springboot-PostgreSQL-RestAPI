package com.asutech.casedataservice.service;

import com.asutech.casedataservice.entity.CaseData;
import com.asutech.casedataservice.exception.CaseNotFoundException;
import com.asutech.casedataservice.exception.ExistingRecordFoundException;
import com.asutech.casedataservice.repo.CaseDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    private  CaseDataRepository repo;

    @Override
    public List<CaseData> getAllCase() {
        return repo.findAll().stream().filter(item->!item.getTextField().contains("MK8")).collect(Collectors.toList());
    }

    @Override
    public CaseData getCase(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new CaseNotFoundException());
    }

    @Override
    public CaseData updateCase(CaseData newCase,Long id) {
        return repo.findById(id).map(item->{
            item.setDateField(newCase.getDateField());
            item.setDateTimeField(newCase.getDateTimeField());
            item.setNumberField(newCase.getNumberField());
            item.setTextField(newCase.getTextField());
            item.setEmailField(newCase.getEmailField());
            item.setMoneyGBPField(newCase.getMoneyGBPField());
            item.setPhoneUKField(newCase.getPhoneUKField());
            return(repo.save(item));

        }).orElseThrow(()->new CaseNotFoundException());
    }

    @Override
    public CaseData createData(CaseData casedata) {
        if(repo.findByEmailFieldAndNumberField(casedata.getEmailField(),casedata.getNumberField()).isPresent()){
            throw new ExistingRecordFoundException();
        }
        return repo.save(casedata);
    }
}
