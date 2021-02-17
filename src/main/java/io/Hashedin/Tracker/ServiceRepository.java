package io.Hashedin.Tracker;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service,Integer> {
    List<Service> findByIdOrderByNameAsc(Integer id);
}
