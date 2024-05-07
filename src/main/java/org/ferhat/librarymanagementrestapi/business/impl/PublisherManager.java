package org.ferhat.librarymanagementrestapi.business.impl;

import org.ferhat.librarymanagementrestapi.business.abstracts.IPublisherService;
import org.ferhat.librarymanagementrestapi.dao.PublisherRepo;
import org.ferhat.librarymanagementrestapi.entity.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PublisherManager implements IPublisherService {
    private final PublisherRepo publisherRepo;

    public PublisherManager(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }

    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepo.save(publisher);
    }

    @Override
    public Publisher update(Publisher publisher) {
        return this.publisherRepo.save(publisher);
    }

    @Override
    public boolean delete(int id) {
        Publisher publisher = this.get(id);
        this.publisherRepo.delete(publisher);
        return true;
    }

    @Override
    public Publisher get(int id) {
        return this.publisherRepo.findById(id).orElseThrow();
    }

    @Override
    public Page<Publisher> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.publisherRepo.findAll(pageable);
    }
}
