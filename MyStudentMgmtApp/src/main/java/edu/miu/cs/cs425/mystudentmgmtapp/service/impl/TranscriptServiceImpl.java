package edu.miu.cs.cs425.mystudentmgmtapp.service.impl;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.TranscriptRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {
    public TranscriptServiceImpl(TranscriptRepository transcriptRepository) {
        this.transcriptRepository = transcriptRepository;
    }


private final TranscriptRepository transcriptRepository;

    @Override
    public Transcript saveTranscript(Transcript newtranscript) {
        return transcriptRepository.save(newtranscript);
    }
}
