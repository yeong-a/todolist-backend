package com.jya.todolist.service;

import java.util.List;

import com.jya.todolist.dto.Todo;

public interface TodoService {
	boolean addTodo(Todo todo);
	boolean modifyTodo(Todo todo);
	boolean removeTodo(int no);
	List<Todo> findTodoList(String userId);
	Todo findTodo(int no);
	
	boolean removeTodoList(String userId);
	boolean completeTodo(int no);
}
