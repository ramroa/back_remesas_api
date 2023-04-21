package mx.finsus.back_remesas_api.repository;

import mx.finsus.back_remesas_api.model.AppData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDataRepository extends JpaRepository<AppData, String> {
}
