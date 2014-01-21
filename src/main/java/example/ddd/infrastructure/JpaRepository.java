package example.ddd.infrastructure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import example.ddd.DddConfig;

@Repository
@Profile(DddConfig.PROFILE)
@Transactional(readOnly = false, propagation = Propagation.MANDATORY)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface JpaRepository {
}