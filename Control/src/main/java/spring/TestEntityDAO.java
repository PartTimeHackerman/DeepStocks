package spring;

import data.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.dialect.MySQLDialect;

@RepositoryRestResource
@Transactional
public interface TestEntityDAO extends CrudRepository<TestEntity, Long>{
}
