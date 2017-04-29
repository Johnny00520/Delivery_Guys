package net.eat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import net.eat.domain.CommentDao;
import net.eat.domain.Comment;

@Controller
public class CommentController {
    @Autowired
    private CommentDao commentDao;

    @PostMapping("/comment")
    public String createComment(@RequestParam(value="name") String name,
                                @RequestParam(value="text") String text) {
        Comment comment = new Comment(name, text);
        this.commentDao.save(comment);
        return "index";
    }

    @GetMapping("/comment")
    public String commentForm(Model model) {
        model.addAttribute("test", "testing");
        return "comment";
    }
}
