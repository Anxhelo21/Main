import { Component, OnInit } from '@angular/core';
import { AppHttpClientService } from 'src/app/services/app-http-client.service';
import { ToDo } from './../../interfaces/ToDo';


@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit{
  public todos: ToDo[] = [];
  constructor(private appHttp:AppHttpClientService){
    appHttp.getData<ToDo[]>('https://jsonplaceholder.typicode.com/todos').subscribe((response) => {
      this.todos = response
    })
    console.log('request sent');
  }
  
  ngOnInit(): void {

  }

}
