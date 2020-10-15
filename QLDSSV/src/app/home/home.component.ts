import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../auth/token-storage.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  private roles: string[];
  authority: string;
  constructor(private tokenStorage: TokenStorageService) { }

  ngOnInit(): void {
    if(this.tokenStorage.getToken()){
      this.roles = this.tokenStorage.getAuthorities();
      this.roles.every(role => {
        if(role == 'ROLE_DAOTAO'){
          this.authority = 'daotao';
          return false;
        } else if (role == 'ROLE_GIANGVIEN'){
          this.authority = 'giangvien';
          return false;
        }
        this.authority = 'sinhvien';
        return true;
      })
    }
  }

}
