package com.SHRAVAN.TODO.Repo;

import com.SHRAVAN.TODO.Model.TODO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodorepo extends JpaRepository<TODO,Integer> {
}
