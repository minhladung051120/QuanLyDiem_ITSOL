import { Component, OnInit } from '@angular/core';
import { taiKhoanDb } from '../../model/taiKhoanDb';
import { Router } from '@angular/router';
import { ServicesService } from '../../services.service';
import { FormGroup,  FormBuilder,  Validators ,FormControl } from '@angular/forms';

@Component({
  selector: 'app-daotaothemtksv',
  templateUrl: './daotaothemtksv.component.html',
  styleUrls: ['./daotaothemtksv.component.css']
})
export class DaotaothemtksvComponent implements OnInit {
  taikhoandb: taiKhoanDb = new taiKhoanDb();
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
    this.taikhoandb.chucVu="SV";
    this.servicesService.createTaiKhoanDb(this.taikhoandb).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    this.taikhoandb = new taiKhoanDb();
    this.gotoList();
  }
  onSubmit() {
    this.save();
  }
  gotoList() {
    if (confirm('Tạo tài khoản sinh viên thành công')) {
      this.router.navigate(['/daotao/daotao-qltk']);
    }
    
  }
}
