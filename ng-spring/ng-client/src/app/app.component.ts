import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {RespData} from "./vo/RespData";
import {AppService} from "./app.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-client';
  greeting = {id: 0, content: ''};

  constructor(private app: AppService, private http: HttpClient, private router: Router) {
    // http.get('http://localhost:8080/resource').subscribe(res => {
    //   this.greeting = (res as RespData).data;
    // });
    this.app.authenticate(undefined, undefined);
  }

  logout() {
    this.http.post('https://localhost:8080/logout', {}).pipe().subscribe();
  }
}
