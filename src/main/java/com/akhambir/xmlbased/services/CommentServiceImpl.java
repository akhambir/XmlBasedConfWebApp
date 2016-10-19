package com.akhambir.xmlbased.services;

import com.akhambir.xmlbased.dao.interfaces.CommentDao;
import com.akhambir.xmlbased.model.Comment;
import com.akhambir.xmlbased.services.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentDao commentDao;

    @Autowired
    public CommentServiceImpl(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @Override
    public Comment addComment(Comment comment) {
        addTimestamp(comment);
        return commentDao.addComment(comment);
    }

    private void addTimestamp(Comment comment) {            // TODO I think that possible make it in better way
        final String TIMESTAMP_PATTERN = "hh:mm:ss, dd-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TIMESTAMP_PATTERN);
        LocalDateTime timestamp = LocalDateTime.now();
        comment.setCommentTimestamp(timestamp.format(formatter));
    }
}
