package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import org.springframework.stereotype.Service;


public interface TranscriptService {
    public abstract Transcript saveTranscript(Transcript newtranscript);
}
