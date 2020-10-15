import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../../services.service';
import { Router } from '@angular/router';
import { getLopHocBySv } from '../../model/getLopHocBySv';
@Component({
  selector: 'app-sinhvien-lichhoc',
  templateUrl: './sinhvien-lichhoc.component.html',
  styleUrls: ['./sinhvien-lichhoc.component.css']
})
export class SinhvienLichhocComponent implements OnInit {
  getLopHocBySvs:getLopHocBySv[];
  constructor(private servicesService: ServicesService,
    private router: Router) { }

  ngOnInit(): void {
    this.getLopHocSv();
  }
  getLopHocSv() {
    this.servicesService.getLopHocBySv().subscribe((data: any[]) => {
      this.getLopHocBySvs = data;
    });
  }
}
