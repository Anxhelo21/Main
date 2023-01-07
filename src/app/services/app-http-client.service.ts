import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AppHttpClientService {

  constructor(private httpClient: HttpClient) {}

    getData<T>(url: string){
      return this.httpClient.get<T>(url);
    }

}
