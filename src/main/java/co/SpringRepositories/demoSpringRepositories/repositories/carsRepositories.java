package co.SpringRepositories.demoSpringRepositories.repositories;

import co.SpringRepositories.demoSpringRepositories.entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface carsRepositories extends JpaRepository<Cars, Long> {
}
