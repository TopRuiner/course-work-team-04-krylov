package com.polyclinic.mis.service.impl;

import com.polyclinic.mis.models.Analysis;
import com.polyclinic.mis.models.Examination;
import com.polyclinic.mis.models.Patient;
import com.polyclinic.mis.repository.ExaminationRepository;
import com.polyclinic.mis.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationServiceImpl implements ExaminationService {
    @Autowired
    private ExaminationRepository examinationRepository;
    @Override
    public Examination add(Examination examination) {
        return examinationRepository.saveAndFlush(examination);
    }
    @Override
    public Optional<Examination> getById(Long id){
        return examinationRepository.findById(id);
    }
    @Override
    public void delete(Long id) {
        examinationRepository.deleteById(id);
    }

    @Override
    public Examination edit(Examination examination) {
        return examinationRepository.saveAndFlush(examination);
    }

    @Override
    public List<Examination> getAll() {
        return examinationRepository.findAll();
    }

    @Override
    public Page<Examination> findPaginated(int pageNumber, int pageSize, String sortField, String sortDirection, String fio, String birthDate) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, sort);
        if (birthDate.equals("")&&fio.equals("")){
            return examinationRepository.findAll(pageable);
        }
        else if (birthDate.equals("")){
            String[] splitFio = fio.split(" ");
            switch (splitFio.length){
                case 1:
                    return examinationRepository.findAll(splitFio[0],"","","",pageable);
                case 2:
                    return examinationRepository.findAll(splitFio[0],splitFio[1],"","",pageable);
                case 3:
                    return examinationRepository.findAll(splitFio[0],splitFio[1],splitFio[2],"",pageable);
            }
        }
        else if (!fio.equals("")){

            String[] splitFio = fio.split(" ");
            switch (splitFio.length){
                case 1:
                    return examinationRepository.findAll(splitFio[0],"","",birthDate,pageable);
                case 2:
                    return examinationRepository.findAll(splitFio[0],splitFio[1],"",birthDate,pageable);
                case 3:
                    return examinationRepository.findAll(splitFio[0],splitFio[1],splitFio[2],birthDate,pageable);
            }
        }
        else {
            return examinationRepository.findAll("","","",birthDate,pageable);
        }
        return examinationRepository.findAll(pageable);
    }
}
