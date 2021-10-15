import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  constructor(private userService: UserService) {}


  ngOnInit(): void {
  }

  getUsers() {
    console.log('click');
    this.userService
      .getUsers()
      .subscribe((data) => alert(JSON.stringify(data)));
  }
}
