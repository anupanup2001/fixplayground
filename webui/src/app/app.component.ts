import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'webui';
  constructor(private httpClient: HttpClient) {}
  connect() {
    this.httpClient.get("/api/connect").subscribe(data => console.log(data));
  }

  disconnect() {
    this.httpClient.get("/api/disconnect").subscribe(data => console.log(data));
  }
}
