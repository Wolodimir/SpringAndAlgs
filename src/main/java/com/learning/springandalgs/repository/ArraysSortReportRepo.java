package com.learning.springandalgs.repository;

import com.learning.springandalgs.entity.ArraysSortReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArraysSortReportRepo extends JpaRepository<Long, ArraysSortReport> {
}
