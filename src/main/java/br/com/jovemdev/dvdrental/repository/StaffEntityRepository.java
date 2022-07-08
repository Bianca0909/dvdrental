package br.com.jovemdev.dvdrental.repository;

import br.com.jovemdev.dvdrental.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffEntityRepository extends JpaRepository<StaffEntity, Long> {

    public List<StaffEntity> findByFirstNameContains(String name);

    @Query(value = "SELECT s FROM StaffEntity s WHERE firtsName ilike '%' || ?1 || '%' ", nativeQuery = true)
    List<StaffEntity> buscaPeloPrimeiroNomeJPQL(String name);

}
