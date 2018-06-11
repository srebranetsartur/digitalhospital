package com.nau.digitalhospital.repository;

import com.nau.digitalhospital.document.Department;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DepartmentRepository extends MongoRepository<Department, ObjectId> {
    Department findDepartmentByTitle(String title);
}
