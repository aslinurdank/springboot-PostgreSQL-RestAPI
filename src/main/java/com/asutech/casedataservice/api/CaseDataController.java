package com.asutech.casedataservice.api;

import com.asutech.casedataservice.entity.CaseData;
import com.asutech.casedataservice.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/cases")
public class CaseDataController {
    @Autowired
    private CaseService caseservice;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<CaseData> getAllCase() {
        return caseservice.getAllCase();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CaseData getCase (@PathVariable Long id) {
        return caseservice.getCase(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CaseData saveCase(@RequestBody CaseData casedata ){
        return caseservice.createData(casedata);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CaseData updateCase(@RequestBody CaseData casedata ,@PathVariable Long id){
       return caseservice.updateCase(casedata,id);
    }
}
