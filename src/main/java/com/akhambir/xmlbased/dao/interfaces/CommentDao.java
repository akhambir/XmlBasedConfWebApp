package com.akhambir.xmlbased.dao.interfaces;

import com.akhambir.xmlbased.model.Comment;

public interface CommentDao extends GenericDao<Comment> {

    Comment addComment(Comment comment);
}
