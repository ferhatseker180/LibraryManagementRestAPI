package org.ferhat.librarymanagementrestapi.business.abstracts;

import org.ferhat.librarymanagementrestapi.entity.Author;
import org.ferhat.librarymanagementrestapi.entity.Category;
import org.springframework.data.domain.Page;

public interface ICategoryService {

    Category save(Category category);

    Category update(Category category);

    String delete(int id);

    Category get(int id);

    Page<Category> cursor(int page, int pageSize);
}
