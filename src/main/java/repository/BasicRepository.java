package repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicRepository <T extends Class> extends JpaRepository<T, Long> {
}
