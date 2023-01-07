import { Person } from './../../interfaces/Person';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  name: string = '';
  lastname: string = '';

  @Output() onSubmitEvent = new EventEmitter<Person>();

  constructor() { }

  ngOnInit(): void {
  }


  onSubmit() {
    if (this.name && this.lastname) {
      let person: Person = {
        name: this.name,
        lastname: this.lastname
      };
      this.onSubmitEvent.emit(person);
    }
  }
}
