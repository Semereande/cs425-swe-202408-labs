package edu.miu.cs.cs425.mystudentmgmtapp.repository;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends CrudRepository<Transcript, Long> {
}
