import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute, Router } from '@angular/router';
import { taiKhoanDb } from '../../model/taiKhoanDb';

@Component({
  selector: 'app-edit-taikhoan-sv',
  templateUrl: './edit-taikhoan-sv.component.html',
  styleUrls: ['./edit-taikhoan-sv.component.css']
})
export class EditTaikhoanSVComponent implements OnInit {
  taikhoandb: taiKhoanDb;
  constructor(
    private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.getTaiKhoanId()
  }

  getTaiKhoanId() {
    this.activate.params.subscribe((param) => {
      this.servicesService.getTaiKhoanSvId(param.id).subscribe((data) => {
        console.log(data);
        this.taikhoandb = data;
      })
    })
  }
  save() {
    this.servicesService.updateTaiKhoanDb(this.taikhoandb).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    // this.taikhoan = new taiKhoan();
    this.gotoList();
  }

  gotoList() {
    if (confirm('Bạn có chắc sửa tài khoản này ??')) {
      this.router.navigate(['/daotao/daotao-qltk']);
    }
  }

}
