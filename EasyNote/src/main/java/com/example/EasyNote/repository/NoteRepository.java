package com.example.EasyNote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EasyNote.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
