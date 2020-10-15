import { Component, OnInit } from '@angular/core';
import { kyHoc } from '../../model/kyHoc';
import { Router } from '@angular/router';
import { ServicesService } from '../../services.service';
import { FormGroup,  FormBuilder,  Validators ,FormControl } from '@angular/forms';

@Component({
  selector: 'app-daotaothemkyhoc',
  templateUrl: './daotaothemkyhoc.component.html',
  styleUrls: ['./daotaothemkyhoc.component.css'],
})
export class DaotaothemkyhocComponent implements OnInit {
  form = new FormGroup({
    maky: new FormControl('',Validators.required),
    tenky: new FormControl('', Validators.required),
    ngaybatdau: new FormControl('', Validators.required),
    ngayketthuc: new FormControl('', Validators.required),
  })
  kyhoc: kyHoc = new kyHoc();
  constructor(
    private servicesService: ServicesService,
    private router: Router
  ) {}

  ngOnInit(): void {}
  save() {
    this.servicesService.createKyHoc(this.kyhoc).subscribe(
      (data) => console.log(data),
      (error) => console.log(error),
    );
    this.kyhoc = new kyHoc();
    this.gotoList();
  }
  onSubmit() {
    this.save();
  }
  gotoList() {
    if (confirm("Thêm kỳ học thành công")) {
      this.router.navigate(['/daotao/daotao-qlkyhoc']);
    }
  }
}
