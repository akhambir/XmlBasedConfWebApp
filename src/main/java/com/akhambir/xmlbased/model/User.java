package com.akhambir.xmlbased.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "COMMENT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqInstanceKey")
    @SequenceGenerator(name = "seqInstanceKey", sequenceName = "SEQ_INSTANCE_KEY", allocationSize = 1)
    private Long userId;
    @Column(name = "USER_NAME", unique = true, nullable = false)
    private String userName;
    @Column(name = "USER_EMAIL", nullable = false)
    private String userEmail;
    @Column(name = "USER_PASSWORD", nullable = false)
    private String userPassword;
    @OneToMany
    private List<Comment> commentList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
