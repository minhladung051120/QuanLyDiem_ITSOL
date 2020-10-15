import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/auth/token-storage.service';
import { ServicesService } from 'src/app/services.service';

@Component({
  selector: 'app-daotao',
  templateUrl: './daotao.component.html',
  styleUrls: ['./daotao.component.css']
})
export class DaotaoComponent implements OnInit {
  board: string;
  errorMessage: string;
  roles: string[] = [];
  authority: string;
  constructor(private userService: ServicesService, private tokenStorage: TokenStorageService) { }

  ngOnInit(): void {
    this.userService.getDTBoard().subscribe(
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
