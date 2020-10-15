import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TokenStorageService } from '../auth/token-storage.service';

@Component({
  selector: 'app-trangchu',
  templateUrl: './trangchu.component.html',
  styleUrls: ['./trangchu.component.css']
})
export class TrangchuComponent implements OnInit {
  username: string;
  constructor(private token: TokenStorageService, private router: Router) { }

  ngOnInit(): void {
    this.username = this.token.getUsername();
    
  }
  logout() {
    this.token.signOut();
    var ketqua = confirm('Bạn có thực sự muốn thoát không?');
    if(ketqua){
      this.router.navigate(['login']);
    }
    // this.router.navigate(['login']);
    // window.location.reload();
  }

}
