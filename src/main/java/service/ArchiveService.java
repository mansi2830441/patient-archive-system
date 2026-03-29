package com.mansi.archive.service;

import com.mansi.archive.entity.Patient;
import com.mansi.archive.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchiveService {

    private final PatientRepository repo;

    public ArchiveService(PatientRepository repo) {
        this.repo = repo;
    }

    public Patient addPatient(Patient p) {
        return repo.save(p);
    }

    public List<Patient> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Patient update(Long id, Patient p) {
        Patient existing = repo.findById(id).orElseThrow();
        existing.setName(p.getName());
        existing.setAge(p.getAge());
        return repo.save(existing);
    }
}