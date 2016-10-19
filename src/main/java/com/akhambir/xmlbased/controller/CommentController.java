package com.akhambir.xmlbased.controller;

import com.akhambir.xmlbased.model.Comment;
import com.akhambir.xmlbased.services.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping(value = "/flood/addComment", method = RequestMethod.POST)
    public String addCommentPost(@ModelAttribute("newComment") Comment comment,
                                 HttpServletRequest request,
                                 Model model) {
        //comment.setUserId((Long) request.getSession().getAttribute("userId")); //TODO looks ugly, need learn best practice
        comment.setUserId(1L);
        model.addAttribute("newComment", commentService.addComment(comment));
        return "floodLine";
    }
}
