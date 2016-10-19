package com.akhambir.xmlbased.dao;

import com.akhambir.xmlbased.dao.interfaces.CommentDao;
import com.akhambir.xmlbased.model.Comment;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CommentDaoImpl extends AbstractDao<Comment> implements CommentDao {

    public CommentDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Comment addComment(Comment comment) {
        return add(comment);
    }
}
