import { Component, OnInit } from '@angular/core';
import { taiKhoanDb } from '../../model/taiKhoanDb';
import { Router } from '@angular/router';
import { ServicesService } from '../../services.service';
import { FormGroup,  FormBuilder,  Validators ,FormControl } from '@angular/forms';
@Component({
  selector: 'app-daotaothemtkgv',
  templateUrl: './daotaothemtkgv.component.html',
  styleUrls: ['./daotaothemtkgv.component.css']
})
export class DaotaothemtkgvComponent implements OnInit {
  taikhoan: taiKhoanDb = new taiKhoanDb();
  form = new FormGroup({
    tendangnhap: new FormControl('',Validators.required),
    diachi: new FormControl('', Validators.required),
    hoten: new FormControl('', Validators.required),
    sdt: new FormControl('', Validators.required),
    maTkDb : new FormControl('', Validators.required),
    email: new FormControl('', [
      Validators.required,
      Validators.email
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(6)
    ])
  })
  constructor(private servicesService: ServicesService,
    private router: Router) { }

  ngOnInit(): void {
  }
  save() {
    this.taikhoan.chucVu="GV";
    this.servicesService.createTaiKhoanDt(this.taikhoan).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    this.taikhoan = new taiKhoanDb();
    this.gotoList();
  }
  onSubmit() {
    this.save();
  }
  gotoList() {
    if (confirm('Tạo tài giảng viên tạo thành công')) {
      this.router.navigate(['/daotao/daotao-qltk']);
    }
    
  }
}

