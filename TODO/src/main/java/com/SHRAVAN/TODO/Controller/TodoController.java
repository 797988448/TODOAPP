package com.SHRAVAN.TODO.Controller;

import com.SHRAVAN.TODO.Model.TODO;
import com.SHRAVAN.TODO.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;
@PostMapping("post")
    public String AddTodo(@RequestBody TODO newTodo){
        return todoService.AddTodo(newTodo);
    }
    @GetMapping("get")
    public List<TODO> getAll(){
    return todoService.getAll();
    }
    @PutMapping("update")
    public String UpdateData(@RequestParam Integer id,@RequestParam String name){
    return todoService.UpdateData(id,name);
    }
    @DeleteMapping("DELETE")
    public String DELETEDATA(@RequestParam Integer id){
    return todoService.DELETEDATA(id);
    }
}
