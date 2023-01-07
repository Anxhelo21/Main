import { AppHttpClientService } from './services/app-http-client.service';
import { Component } from '@angular/core';
import { Person } from './interfaces/Person';
import { appendFile } from 'fs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  persons: Person[] = []


  onFormSubmitHandler(person: Person) {
    this.persons.push(person);
  }
}
