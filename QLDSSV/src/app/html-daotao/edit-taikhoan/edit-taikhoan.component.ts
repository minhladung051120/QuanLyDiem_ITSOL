import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { ActivatedRoute, Router } from '@angular/router';
import { taiKhoan } from '../../model/taiKhoan';
@Component({
  selector: 'app-edit-taikhoan',
  templateUrl: './edit-taikhoan.component.html',
  styleUrls: ['./edit-taikhoan.component.css']
})
export class EditTaikhoanComponent implements OnInit {
  taikhoan: taiKhoan;
  constructor(
    private servicesService: ServicesService,
    private activate: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getTaiKhoanId();
  }

  getTaiKhoanId() {
    this.activate.params.subscribe((param) => {
      this.servicesService.getTaiKhoanId(param.id).subscribe((data) => {
        console.log(data);
        this.taikhoan = data;
      });
    });
  }

  save() {
    this.servicesService.updateTaiKhoan(this.taikhoan).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    // this.taikhoan = new taiKhoan();
    this.gotoList();
  }

  gotoList() {
    if (confirm('Bạn có chắc sửa tài khoản này ??')) {
    this.router.navigate(['/daotao/daotao-qltk'])
    }
  }
}
