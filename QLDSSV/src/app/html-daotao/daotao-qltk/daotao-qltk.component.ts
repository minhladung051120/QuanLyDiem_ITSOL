import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getTaiKhoan } from '../../model/getTaiKhoan';
@Component({
  selector: 'app-daotao-qltk',
  templateUrl: './daotao-qltk.component.html',
  styleUrls: ['./daotao-qltk.component.css'],
})
export class DaotaoQLTKComponent implements OnInit {
  taikhoans: getTaiKhoan[];
  page = 1;
  pageSize = 10;
  searchText;
  p : Number=1;

  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.taiKhoan();
  }
  taiKhoanSv() {
    this.servicesService.getTaiKhoanSv().subscribe((data: any[]) => {
      this.taikhoans = data;
    });
  }
  taiKhoanGv() {
    this.servicesService.getTaiKhoanGv().subscribe((data: any[]) => {
      this.taikhoans = data;
    });
  }
  taiKhoanDt() {
    this.servicesService.getTaiKhoanDt().subscribe((data: any[]) => {
      this.taikhoans = data;
    });
  }
  taiKhoan() {
    this.servicesService.getTaiKhoan().subscribe((data: any[]) => {
      this.taikhoans = data;
    });
  }
  modo(value: string) {
    switch (value) {
      case 'ALL':
        this.taiKhoan();
        break;
      case 'SV':
        this.taiKhoanSv();
        break;
      case 'GV':
        this.taiKhoanGv();
        break;
      case 'DT':
        this.taiKhoanDt();
        break;
    }
  }
  clickMethod(name: string) {
    if(confirm("Bạn chắc chắn muốn xóa? "+name)) {
        this.deleteTaiKhoan(name);
    }
  }
  deleteTaiKhoan(maTk) {
    this.servicesService.deleteTaiKhoanDt(maTk).subscribe((response) => {
      this.taikhoans = this.taikhoans.filter((taikhoan) => taikhoan.maTk != maTk);
    });
  }
}
