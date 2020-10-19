import { Component, OnInit } from '@angular/core';
import { taiKhoan } from '../../model/taiKhoan';
import { Router } from '@angular/router';
import { ServicesService } from '../../services.service';
import { FormGroup,  FormBuilder,  Validators ,FormControl } from '@angular/forms';
@Component({
  selector: 'app-daotaothemtk',
  templateUrl: './daotaothemtk.component.html',
  styleUrls: ['./daotaothemtk.component.css']
})
export class DaotaothemtkComponent implements OnInit {
  form = new FormGroup({
    tendangnhap: new FormControl('',Validators.required),
    diachi: new FormControl('', Validators.required),
    hoten: new FormControl('', Validators.required),
    sdt: new FormControl('', Validators.required),
    email: new FormControl('', [
      Validators.required,
      Validators.email
    ]),
    password: new FormControl('', [
      Validators.required,
      Validators.minLength(6)
    ])
  })
  taikhoan: taiKhoan = new taiKhoan();
  constructor(private servicesService: ServicesService,
    private router: Router) { }

  ngOnInit(): void {
  } 
  save() {
    this.taikhoan.chucVu="DT";
    this.servicesService.createTaiKhoanDt(this.taikhoan).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    this.taikhoan = new taiKhoan();
     this.gotoList();
  }
  onSubmit() {
    this.save();
  }
  gotoList() {
    if(confirm("Tạo tài khoản đào tạo thành công")){
      this.router.navigate(['/daotao/daotao-qltk']);
    }
    
  }
}
