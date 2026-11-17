import { useState } from "react"
import { v4 as uuidv4 } from 'uuid';

export default function TodoList() {
    let [todos, setTodos] = useState([{ task: "simple-task", id: uuidv4() , isDone: false }]);
    let [newTodo, setNewTodo] = useState("");

    let addNewTask = () => {
        setTodos((prevTodos) => {
            return [...prevTodos, { task: newTodo, id: uuidv4() , isDone: false  }]
        })
        setNewTodo("")
    }

    let updateTodoValue = (event) => {
        setNewTodo(event.target.value)
    }

    let deleteTodo = (id) => {
        setTodos((prevTodos) => todos.filter((prevTodos) => prevTodos.id != id))
    }

    let markAllDone = () => {
        setTodos((prevTodos) =>
            prevTodos.map((todo) => {
                return {
                    ...todo,
                    isDone: true
                }
            }))
    }

    let markAsDone = (id) => {
        setTodos((prevTodos) =>
            prevTodos.map((todo) => {
                if (todo.id == id) {
                    return {
                        ...todo,
                        isDone: true
                    }
                }

                else {
                    return todo
                }

            }))
    }
    return (
        <div>

            <input type="text" placeholder="add a task" name="" id="" value={newTodo} onChange={updateTodoValue} />
            <br /><br />
            <button onClick={addNewTask} >Add task</button>
            <br />
            <br />
            <br />

            <h4>Todo List</h4>

            <ul>
                {
                    todos.map((todo) => {
                        return (
                            <li key={todo.id}>
                                <span style={todo.isDone ? {textDecorationLine: "line-through"} : {} }>{todo.task}</span>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <button onClick={() => deleteTodo(todo.id)}>Delete</button>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <button onClick={() => markAsDone(todo.id)}>markAsDone</button>
                            </li>

                        )
                    })
                }
            </ul>

            <button onClick={markAllDone}>markAllDone</button>
        </div>
    )
}