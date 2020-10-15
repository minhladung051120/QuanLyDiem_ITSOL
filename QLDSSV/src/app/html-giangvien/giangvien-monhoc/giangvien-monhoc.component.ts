import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getMonHocByGv } from '../../model/getMonHocByGv';
@Component({
  selector: 'app-giangvien-monhoc',
  templateUrl: './giangvien-monhoc.component.html',
  styleUrls: ['./giangvien-monhoc.component.css']
})
export class GiangvienMonhocComponent implements OnInit {
  getMonHocByGvs: getMonHocByGv[];
  constructor(private servicesService: ServicesService,
    private router: Router) { }

  ngOnInit(): void {
    this.getMonHocGv();
  }

  getMonHocGv() {
    this.servicesService.getMonHocByGv().subscribe((data: any[]) => {
      this.getMonHocByGvs = data;
    });
  }
}
