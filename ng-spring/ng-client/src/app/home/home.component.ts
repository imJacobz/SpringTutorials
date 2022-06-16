import {Component, OnInit} from '@angular/core';
import {AppService} from "../app.service";
import {HttpClient} from "@angular/common/http";
import {RespData} from "../vo/RespData";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  title = "Ng-Client"
  greeting = { id: 0, content: "" };

  constructor(private app: AppService, private http: HttpClient) {
    http.get('http://localhost:8080/resource').subscribe(res => this.greeting = (res as RespData).data);
  }

  ngOnInit(): void {
  }

  authenticated() {
    return this.app.authenticated;
  }
}
