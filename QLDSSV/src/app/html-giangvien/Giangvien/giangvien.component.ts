import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/auth/token-storage.service';
import { ServicesService } from 'src/app/services.service';

@Component({
  selector: 'app-giangvien',
  templateUrl: './giangvien.component.html',
  styleUrls: ['./giangvien.component.css']
})
export class GiangvienComponent implements OnInit {
  board: string;
  errorMessage: string;
  roles: string[] = [];
  authority: string;
  constructor(private userService: ServicesService, private tokenStorage: TokenStorageService) { }

  ngOnInit(): void {
    this.userService.getGVBoard().subscribe(
      data => {
        this.board = data;
      },
      error => {
        this.errorMessage = `${error.status}: ${JSON.parse(error.error).message}`;
      }
    );
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
