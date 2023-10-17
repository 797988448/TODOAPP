package com.SHRAVAN.TODO.service;

import com.SHRAVAN.TODO.Model.TODO;
import com.SHRAVAN.TODO.Repo.ITodorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    ITodorepo iTodorepo;

    public String AddTodo(TODO newTodo) {
         iTodorepo.save(newTodo);
         return "ADD TODO";
    }

    public List<TODO> getAll() {
        return iTodorepo.findAll();
    }

    public String UpdateData(Integer id, String name) {
        TODO todo=iTodorepo.findById(id).orElse(null);
        if(todo!=null){
            // TODO: 17-10-2023
            todo.setTodoName(name);
            iTodorepo.save(todo);
            return "UPDATE NAME";
        }
        return "NOT EXITS DATA";
    }

    public String DELETEDATA(Integer id) {
        iTodorepo.deleteById(id);
        return "DELETE DATA";
    }
}
