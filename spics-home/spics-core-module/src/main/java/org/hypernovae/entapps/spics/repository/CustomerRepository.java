package org.hypernovae.entapps.spics.repository;
import org.hypernovae.entapps.spics.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	List<Customer> findByFullName(String fullName);
}
