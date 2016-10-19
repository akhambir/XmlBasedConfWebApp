package com.akhambir.xmlbased.model;

import javax.persistence.*;

@Entity
@Table(name = "COMMENTS")
public class Comment {

    @Id
    @Column(name = "COMMENT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqInstanceKey")
    @SequenceGenerator(name = "seqInstanceKey", sequenceName = "SEQ_INSTANCE_KEY", allocationSize = 1)
    private Long commentId;
    @Column(name = "COMMENT_BODY", nullable = false)
    private String commentBody;
    @Column(name = "TIMESTAMP", nullable = false)
    private String commentTimestamp;
    @Column(name = "LIKE_COUNTER")
    private Long likeCounter;
    @Column(name = "DISLIKE_COUNTER")
    private Long dislikeCounter;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "USER_ID", nullable = false)
    private Long userId;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public String getCommentTimestamp() {
        return commentTimestamp;
    }

    public void setCommentTimestamp(String commentTimestamp) {
        this.commentTimestamp = commentTimestamp;
    }

    public Long getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(Long likeCounter) {
        this.likeCounter = likeCounter;
    }

    public Long getDislikeCounter() {
        return dislikeCounter;
    }

    public void setDislikeCounter(Long dislikeCounter) {
        this.dislikeCounter = dislikeCounter;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
