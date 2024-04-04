package com.jetbrains.edgar.photoz.clone.repository;

import com.jetbrains.edgar.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
