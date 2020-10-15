import { Component, OnInit } from '@angular/core';
import { taiKhoanDb } from '../../model/taiKhoanDb';
import { Router } from '@angular/router';
import { ServicesService } from '../../services.service';
@Component({
  selector: 'app-daotaothemtksv',
  templateUrl: './daotaothemtksv.component.html',
  styleUrls: ['./daotaothemtksv.component.css']
})
export class DaotaothemtksvComponent implements OnInit {
  taikhoandb: taiKhoanDb = new taiKhoanDb();
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
    // this.gotoList();
  }
  onSubmit() {
    this.save();
  }
  gotoList() {
    this.router.navigate(['/daotao/daotao-qlkyhoc']);
  }
}
